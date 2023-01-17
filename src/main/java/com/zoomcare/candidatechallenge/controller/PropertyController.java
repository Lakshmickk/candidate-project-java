package com.zoomcare.candidatechallenge.controller;

import com.zoomcare.candidatechallenge.model.Property;
import com.zoomcare.candidatechallenge.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping
    public List<Property> getProperties() {
        List<Property> list = propertyService.getProperties();
        return list;
    }
}
