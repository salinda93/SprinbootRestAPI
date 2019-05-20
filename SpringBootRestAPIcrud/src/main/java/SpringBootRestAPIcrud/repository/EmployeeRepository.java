package SpringBootRestAPIcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootRestAPIcrud.model.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee, Long> {

}
