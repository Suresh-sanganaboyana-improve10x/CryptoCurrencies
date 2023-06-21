package com.example.cryptocurrencies.pojoclass;

import com.google.gson.annotations.SerializedName;

public class Coin {

    private String id;
    private String name;
    private String symbol;
    private Integer rank;
    @SerializedName("is_new")
    private Boolean isNew;
    @SerializedName("is_active")
    private Boolean isActive;
    private String type;
}
