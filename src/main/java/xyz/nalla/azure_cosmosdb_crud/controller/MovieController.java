package xyz.nalla.azure_cosmosdb_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.nalla.azure_cosmosdb_crud.entity.Movie;
import xyz.nalla.azure_cosmosdb_crud.service.MovieService;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        return service.addMovie(movie);
    }

    @GetMapping("/movieByYear/{year}")
    public Movie findMovieByYear(@PathVariable int year){
        return service.getMovieByYear(year);
    }

    @GetMapping("/movieByTitle/{title}")
    public Movie findMovieByTitle(@PathVariable String title){
        return service.getMovieByTitle(title);
    }

    @GetMapping("/movies")
    public List<Movie> movies(){
        return service.movies();
    }

}
