package xyz.nalla.azure_cosmosdb_crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import xyz.nalla.azure_cosmosdb_crud.entity.Movie;
import xyz.nalla.azure_cosmosdb_crud.repository.MovieRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public Movie addMovie(Movie movie){
        return repository.save(movie);
    }

    public Movie getMovieByYear(int year){
        return repository.findByYear(year);
    }

    public Movie getMovieByTitle(String title){
        return  repository.findByTitle(title);
    }

    public List<Movie> movies(){
        Iterable<Movie> movieIterable = repository.findAll();
        List<Movie> movies = new ArrayList<Movie>();
        Iterator<Movie> iterator = movieIterable.iterator();
        while (iterator.hasNext()){
            movies.add(iterator.next());
        }
        return movies;
    }

}
