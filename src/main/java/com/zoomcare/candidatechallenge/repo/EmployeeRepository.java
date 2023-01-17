package com.zoomcare.candidatechallenge.repo;

import com.zoomcare.candidatechallenge.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("empRepo")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
