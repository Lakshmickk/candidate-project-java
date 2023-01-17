package com.zoomcare.candidatechallenge.model;

import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column("id")
    Long id;

    @Column("supervisor_id")
    Long supervisorId;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private List<Property> ob;

    public Employee(){}

    public Employee(Long id, Long supervisorId, List<Property> ob) {
        this.id = id;
        this.supervisorId = supervisorId;
        this.ob = ob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSupervisorId() {
        return supervisorId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", supervisorId=" + supervisorId +
//                ", ob=" + ob +
                '}';
    }

    public void setSupervisorId(Long supervisorId) {
        this.supervisorId = supervisorId;
    }

    public List<Property> getOb() {
        return ob;
    }

    public void setOb(List<Property> ob) {
        this.ob = ob;
    }
}
