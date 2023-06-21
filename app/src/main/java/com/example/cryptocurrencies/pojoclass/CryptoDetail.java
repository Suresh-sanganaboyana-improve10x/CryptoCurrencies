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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public ArrayList<Tags> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tags> tags) {
        this.tags = tags;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getOpenSource() {
        return openSource;
    }

    public void setOpenSource(Boolean openSource) {
        this.openSource = openSource;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getDevelopmentStatus() {
        return developmentStatus;
    }

    public void setDevelopmentStatus(String developmentStatus) {
        this.developmentStatus = developmentStatus;
    }

    public Boolean getHardwareWallet() {
        return hardwareWallet;
    }

    public void setHardwareWallet(Boolean hardwareWallet) {
        this.hardwareWallet = hardwareWallet;
    }

    public String getProofType() {
        return proofType;
    }

    public void setProofType(String proofType) {
        this.proofType = proofType;
    }

    public String getOrgStructure() {
        return orgStructure;
    }

    public void setOrgStructure(String orgStructure) {
        this.orgStructure = orgStructure;
    }

    public String getHashAlgorithm() {
        return hashAlgorithm;
    }

    public void setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public ArrayList<LinksExtended> getLinksExtends() {
        return linksExtends;
    }

    public void setLinksExtends(ArrayList<LinksExtended> linksExtends) {
        this.linksExtends = linksExtends;
    }

    public Whitepaper getWhitepaper() {
        return whitepaper;
    }

    public void setWhitepaper(Whitepaper whitepaper) {
        this.whitepaper = whitepaper;
    }

    public String getFirstDataAt() {
        return firstDataAt;
    }

    public void setFirstDataAt(String firstDataAt) {
        this.firstDataAt = firstDataAt;
    }

    public String getLastDataAt() {
        return lastDataAt;
    }

    public void setLastDataAt(String lastDataAt) {
        this.lastDataAt = lastDataAt;
    }
}
