package com.zoomcare.candidatechallenge.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PropertyPK implements Serializable {

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "key")
    private String key;

    public PropertyPK() {
    }

    public PropertyPK(Long employeeId, String key) {
        this.employeeId = employeeId;
        this.key = key;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PropertyPK)) return false;
        PropertyPK that = (PropertyPK) o;
        return getEmployeeId().equals(that.getEmployeeId()) && getKey().equals(that.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(), getKey());
    }
}