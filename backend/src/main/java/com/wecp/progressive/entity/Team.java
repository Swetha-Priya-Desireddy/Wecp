package com.wecp.progressive.entity;

public class Team implements Comparable<Team> {
    private int teamId;
    private String teamName;
    private String location;
    private String ownerName;
    private int establishmentYear;
    public Team(int teamId, String teamName, String location, String ownerName, int establishmentYear) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.location = location;
        this.ownerName = ownerName;
        this.establishmentYear = establishmentYear;
    }
    public Team() {
    }
    public int getTeamId() {
        return teamId;
    }
    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public int getEstablishmentYear() {
        return establishmentYear;
    }
    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }
    @Override
    public int compareTo(Team o) {
        return this.getTeamName().compareTo(o.getTeamName());
    }
    

}