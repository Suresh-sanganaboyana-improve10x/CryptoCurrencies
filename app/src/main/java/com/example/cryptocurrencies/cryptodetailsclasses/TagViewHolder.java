package com.example.cryptocurrencies.cryptodetailsclasses;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocurrencies.databinding.TagItemBinding;

public class TagViewHolder extends RecyclerView.ViewHolder {

    TagItemBinding binding;

    public TagViewHolder(TagItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
