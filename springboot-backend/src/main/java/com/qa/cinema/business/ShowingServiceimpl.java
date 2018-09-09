package com.qa.cinema.business;

import com.qa.cinema.business.dto.ShowingDto;
import com.qa.cinema.persistence.ShowingRepository;
import com.qa.cinema.util.ShowingConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowingServiceimpl implements ShowingService{

    @Autowired
    ShowingRepository showingRepository;

    @Override
    public ShowingDto getShowingByID(Integer showingId) {
        return ShowingConverter.entityToDto(showingRepository.getOne(showingId));
    }

    @Override
    public void saveShowing(ShowingDto showingDto) {
        showingRepository.save(ShowingConverter.dtoToEntity(showingDto));
    }

    @Override
    public List<ShowingDto> getAllShowings() {
        return showingRepository.findAll().stream().map(ShowingConverter::entityToDto).collect(Collectors.toList());

    }

    @Override
    public List<ShowingDto> getShowingByTMDB(Integer tmdb) {
        return showingRepository.findAllByShowingTMDBEquals(tmdb).stream().map(ShowingConverter::entityToDto).collect(Collectors.toList());
    }
}
