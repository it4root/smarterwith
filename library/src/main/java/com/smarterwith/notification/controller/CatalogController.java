package com.smarterwith.notification.controller;


import com.smarterwith.notification.model.Catalog;
import com.smarterwith.notification.repository.CatalogRepository;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@Api("/v1/api/catalogs")
@RequestMapping("/v1/api")
public class CatalogController {

    private CatalogRepository catalogRepository;

    @GetMapping("/catalogs")
    public List<Catalog> getCatalogs() {
        return catalogRepository.findAll();
    }

    @PutMapping("/catalogs")
    public Catalog getCatalogs(@Valid @RequestBody Catalog catalog) {
        return catalogRepository.save(catalog);
    }

    @GetMapping("/catalogs/health")
    public String health() {
        return "OK";
    }
}
