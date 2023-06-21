package com.example.cryptocurrencies.network;

import com.example.cryptocurrencies.pojoclass.Coin;
import com.example.cryptocurrencies.pojoclass.CryptoDetail;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoCoinsService {

    @GET("coins")
    Call<List<Coin>> getCryptoCoins();

    @GET("coins/btc-bitcoin")
    Call<CryptoDetail> getCryptoCoinsDetails();
}
