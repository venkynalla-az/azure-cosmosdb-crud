package xyz.nalla.azure_cosmosdb_crud.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import xyz.nalla.azure_cosmosdb_crud.entity.Movie;

public interface MovieRepository extends CosmosRepository<Movie, String> {

    Movie findByYear(int year);

    Movie findByTitle(String title);


}
