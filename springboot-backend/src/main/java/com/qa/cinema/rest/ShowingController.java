package com.qa.cinema.rest;

import com.qa.cinema.business.ShowingService;
import com.qa.cinema.business.dto.ShowingDto;
import com.qa.cinema.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(Constants.SHOWING)
@RestController
public class ShowingController {

    @Autowired
    ShowingService showingService;

    @CrossOrigin
    @RequestMapping(Constants.GET_SHOWING_BY_ID)
    public ShowingDto getShowingById(@PathVariable Integer showingID){
        return showingService.getShowingByID(showingID);
    }

    @CrossOrigin
    @RequestMapping(Constants.GET_ALL_SHOWINGS)
    public List<ShowingDto> getAllShowings() {
        return showingService.getAllShowings();
    }

    @CrossOrigin
    @RequestMapping(value= Constants.SAVE_SHOWING, method= RequestMethod.POST)
    public void saveFilm(@RequestBody ShowingDto showingDto) {
        showingService.saveShowing(showingDto);
    }


    @CrossOrigin
    @RequestMapping(Constants.GET_SHOWINGS_BY_TMDB)
    public List<ShowingDto> getShowingsByTMDB(@PathVariable Integer tmdb) {
        return showingService.getShowingByTMDB(tmdb);
    }

}
