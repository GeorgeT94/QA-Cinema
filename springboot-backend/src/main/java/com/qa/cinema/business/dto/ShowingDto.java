package com.qa.cinema.business.dto;

public class ShowingDto {
    
	private Integer showingId;
    private String showingTime;
    private Integer showingTMDB;

    public ShowingDto(Integer showingId, String showingTime, Integer showingTMDB) {
        this.showingId = showingId;
        this.showingTime = showingTime;
        this.showingTMDB = showingTMDB;
    }

    public ShowingDto() {
    }

    public Integer getShowingId() {
        return showingId;
    }

    public void setShowingId(Integer showingId) {
        this.showingId = showingId;
    }

    public void setShowingTime(String showingTime) {
        this.showingTime = showingTime;
    }

    public String getShowingTime() {
        return showingTime;
    }

    public Integer getShowingTMDB() {
        return showingTMDB;
    }

    public void setShowingTMDB(Integer showingTMDB) {
        this.showingTMDB = showingTMDB;
    }
}
