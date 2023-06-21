package com.example.cryptocurrencies.cryptodetailsclasses;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocurrencies.databinding.TeammeberItemBinding;

public class TeamViewHolder extends RecyclerView.ViewHolder {

    TeammeberItemBinding binding;

    public TeamViewHolder(TeammeberItemBinding teammeberItemBinding) {
        super(teammeberItemBinding.getRoot());
        binding = teammeberItemBinding;
    }
}
