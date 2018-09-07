package com.qa.cinema.business.dto;

public class ShowingDto {
    
	private Integer showingId;
    private String showingTime;

    public ShowingDto(Integer showingId, String showingTime) {
        this.showingId = showingId;
        this.showingTime = showingTime;
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

}
