package com.qa.cinema.business.dto;

public class ShowingDto {
    
	private Integer showingId;
    private String ShowingName;

    public ShowingDto(Integer showingId, String showingName) {
        this.showingId = showingId;
        ShowingName = showingName;
    }

    public ShowingDto() {
    }

    public Integer getShowingId() {
        return showingId;
    }

    public void setShowingId(Integer showingId) {
        this.showingId = showingId;
    }

    public String getShowingName() {
        return ShowingName;
    }

    public void setShowingName(String showingName) {
        ShowingName = showingName;
    }
}
