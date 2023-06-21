package com.example.cryptocurrencies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.cryptocurrencies.databinding.ActivityCryptoCoinsBinding;
import com.example.cryptocurrencies.network.CryptoCoinsApi;
import com.example.cryptocurrencies.network.CryptoCoinsService;
import com.example.cryptocurrencies.pojoclass.Coin;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CryptoCoinsActivity extends AppCompatActivity {

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
                    Toast.makeText(CryptoCoinsActivity.this, "Fetch Coins SuccessFul", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Coin>> call, Throwable t) {
                Toast.makeText(CryptoCoinsActivity.this, "Failed fetch coins", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setupCryptoCoinsAdapter() {
        adapter = new CryptoCoinsAdapter();
        adapter.setCoins(coins);
    }

    private void setupCryptoCoinsRv() {
        binding.cryptoCoinsRv.setLayoutManager(new LinearLayoutManager(this));
        binding.cryptoCoinsRv.setAdapter(adapter);
    }
}