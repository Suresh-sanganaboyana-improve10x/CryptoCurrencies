package com.example.cryptocurrencies.cryptodetailsclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.cryptocurrencies.CryptoCoinsAdapter;
import com.example.cryptocurrencies.R;
import com.example.cryptocurrencies.databinding.ActivityCryptoDetailsBinding;
import com.example.cryptocurrencies.network.CryptoCoinsApi;
import com.example.cryptocurrencies.network.CryptoCoinsService;
import com.example.cryptocurrencies.pojoclass.CryptoDetail;
import com.example.cryptocurrencies.pojoclass.Tags;
import com.example.cryptocurrencies.pojoclass.Team;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CryptoDetailsActivity extends AppCompatActivity {

    private ActivityCryptoDetailsBinding binding;
    private CryptoCoinsAdapter cryptoCoinsAdapter;
    private String tags;
//    private List<Tags> tags;
//    private List<Team> teams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCryptoDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (getIntent().hasExtra("coin")) {
            tags = (String) getIntent().getSerializableExtra("coin");
        }
        fetchCryptoDetails();

    }

    private void fetchCryptoDetails() {
        CryptoCoinsService cryptoCoinsService = new CryptoCoinsApi().createCryptoCoinsService();
        Call<CryptoDetail> call = cryptoCoinsService.getCryptoCoinsDetails(tags);
        call.enqueue(new Callback<CryptoDetail>() {
            @Override
            public void onResponse(Call<CryptoDetail> call, Response<CryptoDetail> response) {
                CryptoDetail cryptoDetail = response.body();
                binding.setCryptoDetail(cryptoDetail);
                Toast.makeText(CryptoDetailsActivity.this, "Fetch Successful", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<CryptoDetail> call, Throwable t) {
            }
        });
    }
}