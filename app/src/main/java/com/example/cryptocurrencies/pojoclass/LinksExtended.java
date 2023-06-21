package com.example.cryptocurrencies.pojoclass;

public class LinksExtended {
    private String url;
    private String type;
    private Stats stats;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}

class Stats {
    private Integer subscribers;
    private Integer contributors;
    private Integer stars;
    private Integer followers;

    public Integer getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Integer subscribers) {
        this.subscribers = subscribers;
    }

    public Integer getContributors() {
        return contributors;
    }

    public void setContributors(Integer contributors) {
        this.contributors = contributors;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }
}
