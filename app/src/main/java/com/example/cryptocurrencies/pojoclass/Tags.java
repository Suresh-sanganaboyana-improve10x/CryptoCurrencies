package com.example.cryptocurrencies.pojoclass;

import com.google.gson.annotations.SerializedName;

public class Tags {
    private String id;
    private String name;
    @SerializedName("coin_counter")
    private Integer coinCounter;
    @SerializedName("ico_counter")
    private Integer icoCounter;
}
