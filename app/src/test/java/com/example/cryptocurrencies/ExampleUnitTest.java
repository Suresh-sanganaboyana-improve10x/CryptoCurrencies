package com.example.cryptocurrencies;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.cryptocurrencies.network.CryptoCoinsApi;
import com.example.cryptocurrencies.network.CryptoCoinsService;
import com.example.cryptocurrencies.pojoclass.Coin;
import com.example.cryptocurrencies.pojoclass.CryptoDetail;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getCoins() throws IOException {
        CryptoCoinsService cryptoCoinsService = new CryptoCoinsApi().createCryptoCoinsService();
        Call<List<Coin>> call = cryptoCoinsService.getCryptoCoins();
        List<Coin> coins = call.execute().body();
        assertNotNull(coins);
        assertFalse(coins.isEmpty());
        System.out.println(new Gson().toJson(coins));
    }

    @Test
    public void getCryptoDetails() throws IOException {
        CryptoCoinsService cryptoCoinsService = new CryptoCoinsApi().createCryptoCoinsService();
        Call<CryptoDetail> call = cryptoCoinsService.getCryptoCoinsDetails();
        CryptoDetail cryptoDetail = call.execute().body();
        assertNotNull(cryptoDetail);
        System.out.println(new Gson().toJson(cryptoDetail));
    }
}