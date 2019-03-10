/**
 * 
 */
package com.journaldev.spring.DAO;

import java.util.List;

import com.journaldev.spring.dto.EmployeeDto;
import com.journaldev.spring.model.Employee;

/**
 * @author Ranga Reddy
 * @version 1.0
 */
public interface EmployeeDAO {
	public long createEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(long id);
    public List<Employee> getAllEmployees();
    public EmployeeDto getEmployee(long id);	
	public List<Employee> getAllEmployees(String employeeName);
}
