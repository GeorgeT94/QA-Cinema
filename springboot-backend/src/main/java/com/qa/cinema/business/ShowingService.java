package com.qa.cinema.business;

import com.qa.cinema.business.dto.ShowingDto;

import java.util.List;

public interface ShowingService {
    ShowingDto getShowingByID(Integer showingId);
    void saveShowing(ShowingDto showingDto);
    List<ShowingDto> getAllShowings();
    List<ShowingDto> getShowingByTMDB(Integer tmdb);
}
