package com.example.cryptocurrencies;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocurrencies.cryptodetailsclasses.OnItemActionListener;
import com.example.cryptocurrencies.databinding.CryptoCoinItemBinding;
import com.example.cryptocurrencies.pojoclass.Coin;

import java.util.List;

public class CryptoCoinsAdapter extends RecyclerView.Adapter<CryptoCoinsViewHolder> {

    private List<Coin> coins;
    private OnItemActionListener onItemActionListener;

    void setCoins(List<Coin> coins) {
        this.coins = coins;
        notifyDataSetChanged();
    }

    void setOnItemActionListener(OnItemActionListener onItemActionListener) {
        this.onItemActionListener = onItemActionListener;
    }
    @NonNull
    @Override
    public CryptoCoinsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CryptoCoinItemBinding cryptoCoinItemBinding = CryptoCoinItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        CryptoCoinsViewHolder cryptoCoinsViewHolder = new CryptoCoinsViewHolder(cryptoCoinItemBinding);
        return cryptoCoinsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CryptoCoinsViewHolder holder, int position) {
        Coin coin = coins.get(position);
        holder.binding.setCoin(coin);
        holder.binding.getRoot().setOnClickListener(v -> {
            onItemActionListener.onClick(coin.getId());
        });
    }

    @Override
    public int getItemCount() {
        return coins.size();
    }
}
