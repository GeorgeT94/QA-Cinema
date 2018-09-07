package com.qa.cinema.util;

import com.qa.cinema.business.dto.ShowingDto;
import com.qa.cinema.persistence.domain.Showing;

public class ShowingConverter {
	
	public static Showing dtoToEntity(ShowingDto ShowingDto) {
		Showing Showing = new Showing(ShowingDto.getShowingTime());
		Showing.setShowingId(ShowingDto.getShowingId());
		return Showing;
	}

	public static ShowingDto entityToDto(Showing showing) {
		return new ShowingDto(showing.getShowingId(), showing.getShowingTime());
	}
}