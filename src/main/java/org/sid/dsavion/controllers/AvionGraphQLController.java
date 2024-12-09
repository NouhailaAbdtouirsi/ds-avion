package org.sid.dsavion.controllers;

import org.sid.dsavion.dao.entities.Avion;
import org.sid.dsavion.dto.AvionDTO;
import org.sid.dsavion.service.AvionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AvionGraphQLController {

    @Autowired
    private AvionServiceImp avionServiceImp;

    @GetMapping("/avions")
    public List<AvionDTO> getAllAvions(){
        return avionServiceImp.getAllAvions();
    }

    @GetMapping("/avion/{id}")
    public AvionDTO getAvionById(@PathVariable Long id){
        return avionServiceImp.getAvionById(id);
    }

    @DeleteMapping("/avion/{id}")
    public void deleteAvionById(@PathVariable Long id){
        avionServiceImp.deleteAvionById(id);
    }

    //get avion by model
    @QueryMapping
    public AvionDTO getAvionByModel(@Argument String model){
        return avionServiceImp.getAvionByModel(model);
    }

    // get avion by model and price
    @QueryMapping
    public AvionDTO getAvionByModelAndPrice(@Argument String model, @Argument Long price){
        return avionServiceImp.getAvionByModelAndPrice(model, price);
    }

    @PostMapping("/avion")
    public AvionDTO saveAvion(@RequestBody AvionDTO avion){
        return avionServiceImp.saveAvion(avion);
    }

}
