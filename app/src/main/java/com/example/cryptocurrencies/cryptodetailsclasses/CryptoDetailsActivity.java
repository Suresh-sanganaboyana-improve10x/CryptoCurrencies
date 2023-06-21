package com.example.cryptocurrencies.cryptodetailsclasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.cryptocurrencies.CryptoCoinsAdapter;
import com.example.cryptocurrencies.databinding.ActivityCryptoDetailsBinding;
import com.example.cryptocurrencies.network.CryptoCoinsApi;
import com.example.cryptocurrencies.network.CryptoCoinsService;
import com.example.cryptocurrencies.pojoclass.CryptoDetail;
import com.example.cryptocurrencies.pojoclass.Tags;
import com.example.cryptocurrencies.pojoclass.Team;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CryptoDetailsActivity extends AppCompatActivity {

    private ActivityCryptoDetailsBinding binding;
    private TagAdapter tagAdapter;
    private TeamsAdapter teamsAdapter;
    private String id;
    private List<Tags> tagsList = new ArrayList<>();
    private List<Team> teams = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCryptoDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (getIntent().hasExtra("coin")) {
            id = (String) getIntent().getSerializableExtra("coin");
        }
        fetchTagsDetails();
        fetchTeamMembers();
        setupTagAdapter();
        setupTagRecyclerView();
        setupTeamsAdapter();
        setupTeamsRecyclerView();
    }

    private void fetchTagsDetails() {
        CryptoCoinsService cryptoCoinsService = new CryptoCoinsApi().createCryptoCoinsService();
        Call<CryptoDetail> call = cryptoCoinsService.getCryptoCoinsDetails(id);
        call.enqueue(new Callback<CryptoDetail>() {
            @Override
            public void onResponse(Call<CryptoDetail> call, Response<CryptoDetail> response) {
                if (response.isSuccessful()) {
                    CryptoDetail cryptoDetail = response.body();
                    tagAdapter.setTags(cryptoDetail.getTags());
                    binding.setCryptoDetail(cryptoDetail);
                }
                Toast.makeText(CryptoDetailsActivity.this, "Get Tags Successful", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<CryptoDetail> call, Throwable t) {
                Toast.makeText(CryptoDetailsActivity.this, "Failed to get Tags", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setupTagAdapter() {
        tagAdapter = new TagAdapter();
        tagAdapter.setTags(tagsList);
    }

    private void setupTagRecyclerView() {
        binding.tagsRv.setLayoutManager(new GridLayoutManager(this, 3));
        binding.tagsRv.setAdapter(tagAdapter);
    }

    private void fetchTeamMembers() {
        CryptoCoinsService cryptoCoinsService = new CryptoCoinsApi().createCryptoCoinsService();
        Call<CryptoDetail> call = cryptoCoinsService.getCryptoCoinsDetails(id);
        call.enqueue(new Callback<CryptoDetail>() {
            @Override
            public void onResponse(Call<CryptoDetail> call, Response<CryptoDetail> response) {
                if (response.isSuccessful()) {
                    CryptoDetail cryptoDetail = response.body();
                    teamsAdapter.setTeams(cryptoDetail.getTeams());
                }
                Toast.makeText(CryptoDetailsActivity.this, "Successfully fetch team members", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<CryptoDetail> call, Throwable t) {
                Toast.makeText(CryptoDetailsActivity.this, "Failed to fetch Team members", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setupTeamsAdapter() {
        teamsAdapter = new TeamsAdapter();
        teamsAdapter.setTeams(teams);
    }

    private void setupTeamsRecyclerView() {
        binding.teamsRv.setLayoutManager(new LinearLayoutManager(this));
        binding.teamsRv.setAdapter(teamsAdapter);
    }
}