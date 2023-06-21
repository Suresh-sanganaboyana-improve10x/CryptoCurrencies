package com.example.cryptocurrencies.pojoclass;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Links {
    private ArrayList<String> explorer;
    private ArrayList<String> facebook;
    private ArrayList<String> reddit;
    @SerializedName("source_code")
    private ArrayList<String> sourceCode;
    private ArrayList<String> website;
    private ArrayList<String> youtube;
}
