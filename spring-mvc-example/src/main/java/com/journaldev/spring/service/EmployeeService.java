
package com.journaldev.spring.service;
import java.util.List;

import com.journaldev.spring.dto.EmployeeDto;
import com.journaldev.spring.model.Employee;

/**
 * @author Ranga Reddy
 * @version 1.0
 */

public interface EmployeeService {
	public long createEmployee(EmployeeDto employee);
    public Employee updateEmployee(EmployeeDto employee);
    public void deleteEmployee(long id);
    public List<Employee> getAllEmployees();
    public EmployeeDto getEmployee(long id);	
	public List<Employee> getAllEmployees(String employeeName);
}
