package com.example.cryptocurrencies.cryptodetailsclasses;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocurrencies.databinding.TagItemBinding;
import com.example.cryptocurrencies.databinding.TeammeberItemBinding;
import com.example.cryptocurrencies.pojoclass.Team;

import java.util.List;

public class TeamsAdapter extends RecyclerView.Adapter<TeamViewHolder> {

    private List<Team> teams;

    void setTeams(List<Team> teams) {
        this.teams = teams;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TeammeberItemBinding binding = TeammeberItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        TeamViewHolder teamViewHolder = new TeamViewHolder(binding);
        return teamViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        Team team = teams.get(position);
        holder.binding.setTeam(team);
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }
}
