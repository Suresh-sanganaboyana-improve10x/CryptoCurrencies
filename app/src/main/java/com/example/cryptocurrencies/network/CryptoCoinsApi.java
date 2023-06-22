package com.example.cryptocurrencies.network;

import com.example.cryptocurrencies.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CryptoCoinsApi {

    public CryptoCoinsService createCryptoCoinsService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.CRYPTO_CURRENCY_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CryptoCoinsService cryptoCoinsService = retrofit.create(CryptoCoinsService.class);
        return cryptoCoinsService;
    }
}
