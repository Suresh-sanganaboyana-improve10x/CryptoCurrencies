package com.example.cryptocurrencies;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocurrencies.databinding.CryptoCoinItemBinding;

public class CryptoCoinsViewHolder extends RecyclerView.ViewHolder {

    CryptoCoinItemBinding binding;

    public CryptoCoinsViewHolder(CryptoCoinItemBinding cryptoCoinItemBinding) {
        super(cryptoCoinItemBinding.getRoot());
        binding = cryptoCoinItemBinding;
    }
}
