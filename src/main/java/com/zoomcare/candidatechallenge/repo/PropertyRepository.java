package com.zoomcare.candidatechallenge.repo;

import com.zoomcare.candidatechallenge.model.Property;
import com.zoomcare.candidatechallenge.model.PropertyPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("propRepo")
public interface PropertyRepository extends JpaRepository<Property, PropertyPK> {
}
