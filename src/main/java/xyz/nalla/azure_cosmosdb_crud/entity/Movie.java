package xyz.nalla.azure_cosmosdb_crud.entity;


import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Container(containerName = "movies")

public class Movie {

    @Id
    @GeneratedValue
    private String id;
    @NonNull
    private String title;
    @NonNull
    private int year;
    @NonNull
    private String coverUrl;
    @NonNull
    private String summary;
    @NonNull
    @PartitionKey
    private String genre;
}
