package com.example.cryptocurrencies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cryptocurrencies.databinding.ActivityCryptoCoinsBinding;

public class CryptoCoinsActivity extends AppCompatActivity {

    private ActivityCryptoCoinsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  ActivityCryptoCoinsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}