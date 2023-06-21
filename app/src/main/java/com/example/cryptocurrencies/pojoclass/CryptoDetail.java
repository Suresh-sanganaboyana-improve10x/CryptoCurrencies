package com.example.cryptocurrencies.pojoclass;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CryptoDetail {

    private String id;
    private String name;
    private String symbol;
    private Integer rank;
    @SerializedName("is_new")
    private Boolean isNew;
    @SerializedName("is_active")
    private Boolean isActive;
    private String type;
    private String logo;
    private ArrayList<Tags> tags;
    @SerializedName("team")
    private ArrayList<Team> teams;
    private String description;
    private String message;
    @SerializedName("open_source")
    private Boolean openSource;
    @SerializedName("started_at")
    private String startedAt;
    @SerializedName("development_status")
    private String developmentStatus;
    @SerializedName("hardware_wallet")
    private Boolean hardwareWallet;
    @SerializedName("proof_type")
    private String proofType;
    @SerializedName("org_structure")
    private String orgStructure;
    @SerializedName("hash_algorithm")
    private String hashAlgorithm;
    private Links links;
    @SerializedName("links_extended")
    private ArrayList<LinksExtended> linksExtends;
    private Whitepaper whitepaper;
    @SerializedName("first_data_at")
    private String firstDataAt;
    @SerializedName("last_data_at")
    private String lastDataAt;
}
