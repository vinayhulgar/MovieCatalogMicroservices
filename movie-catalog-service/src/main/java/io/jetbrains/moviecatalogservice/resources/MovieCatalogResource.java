package io.jetbrains.moviecatalogservice.resources;

import io.jetbrains.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/Catalog")
public class MovieCatalogResource {

@RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId) {

    return Collections.singletonList(new CatalogItem("Transformers", "Test", 4));
}

}
