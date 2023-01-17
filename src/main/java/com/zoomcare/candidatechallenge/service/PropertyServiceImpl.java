package com.zoomcare.candidatechallenge.service;

import com.zoomcare.candidatechallenge.model.Property;
import com.zoomcare.candidatechallenge.repo.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public List<Property> getProperties() {
        return propertyRepository.findAll();
    }
}
