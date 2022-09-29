package net.irvinehawks.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.irvinehawks.springBoot.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
