package com.zoomcare.candidatechallenge.model;

import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Property {
    @EmbeddedId
    PropertyPK propertyPK;

    @Column
    String value;

    public Property(){}

    public Property(PropertyPK propertyPK, String value) {
        this.propertyPK = propertyPK;
        this.value = value;
    }

    public PropertyPK getPropertyPK() {
        return propertyPK;
    }

    public void setPropertyPK(PropertyPK propertyPK) {
        this.propertyPK = propertyPK;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property)) return false;
        Property property = (Property) o;
        return getPropertyPK().equals(property.getPropertyPK()) && Objects.equals(getValue(), property.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPropertyPK(), getValue());
    }
}
