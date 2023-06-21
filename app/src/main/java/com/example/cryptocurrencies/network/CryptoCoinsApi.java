package com.example.cryptocurrencies.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CryptoCoinsApi {

    public CryptoCoinsService createCryptoCoinsService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinpaprika.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CryptoCoinsService cryptoCoinsService = retrofit.create(CryptoCoinsService.class);
        return cryptoCoinsService;
    }
}
