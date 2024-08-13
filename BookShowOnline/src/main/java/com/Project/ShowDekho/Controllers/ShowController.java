package com.Project.ShowDekho.Controllers;

import com.Project.ShowDekho.Model.Show;
import com.Project.ShowDekho.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowController {
    private final ShowService showService;

    @Autowired
    public ShowController(ShowService showService) { this.showService = showService; }

    @PostMapping(value = "showdekho.com/show/insert")
    public ResponseEntity<Show> registerNewShow(@RequestBody Show show){
        Show currShow = showService.addNewShow(show);
        return ResponseEntity.ok(currShow);
    }

    @GetMapping(value = "showdekho.com/show/get")
    public List<Show> getAllShow(){
        return showService.getShows();
    }

    @GetMapping(value = "showdekho.com/show/{id}")
    public List<Show> getShowMovieId(@PathVariable("id") Integer movieId){
        return showService.getShowByMovieId(movieId);
    }
}
