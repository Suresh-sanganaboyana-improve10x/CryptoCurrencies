package com.example.cryptocurrencies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.cryptocurrencies.cryptodetailsclasses.CryptoDetailsActivity;
import com.example.cryptocurrencies.cryptodetailsclasses.OnItemActionListener;
import com.example.cryptocurrencies.databinding.ActivityCryptoCoinsBinding;
import com.example.cryptocurrencies.network.CryptoCoinsApi;
import com.example.cryptocurrencies.network.CryptoCoinsService;
import com.example.cryptocurrencies.pojoclass.Coin;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CryptoCoinsActivity extends BaseActivity {

    private ActivityCryptoCoinsBinding binding;
    private ArrayList<Coin> coins = new ArrayList<>();
    private CryptoCoinsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  ActivityCryptoCoinsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fetchCryptoCoins();
        setupCryptoCoinsAdapter();
        setupCryptoCoinsRv();
    }

    private void fetchCryptoCoins() {
        CryptoCoinsService cryptoCoinsService = new CryptoCoinsApi().createCryptoCoinsService();
        Call<List<Coin>> call = cryptoCoinsService.getCryptoCoins();
        call.enqueue(new Callback<List<Coin>>() {
            @Override
            public void onResponse(Call<List<Coin>> call, Response<List<Coin>> response) {
                if (response.isSuccessful()) {
                    List<Coin> coinList = response.body();
                    adapter.setCoins(coinList);
                    showToast("Fetch Coins SuccessFul");
                }
            }

            @Override
            public void onFailure(Call<List<Coin>> call, Throwable t) {
                showToast("Failed fetch coins");
            }
        });
    }

    private void setupCryptoCoinsAdapter() {
        adapter = new CryptoCoinsAdapter();
        adapter.setCoins(coins);
        adapter.setOnItemActionListener(new OnItemActionListener() {
            @Override
            public void onClick(String id) {
                Intent intent = new Intent(CryptoCoinsActivity.this, CryptoDetailsActivity.class);
                intent.putExtra("coin", id);
                startActivity(intent);
            }
        });
    }

    private void setupCryptoCoinsRv() {
        binding.cryptoCoinsRv.setLayoutManager(new LinearLayoutManager(this));
        binding.cryptoCoinsRv.setAdapter(adapter);
    }
}