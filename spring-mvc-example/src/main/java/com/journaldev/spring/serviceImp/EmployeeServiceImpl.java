 package com.journaldev.spring.serviceImp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.DAO.EmployeeDAO;
import com.journaldev.spring.dto.EmployeeDto;
import com.journaldev.spring.model.Employee;
import com.journaldev.spring.mapper.EmployeeMapper;
import com.journaldev.spring.service.EmployeeService;
/**
 * @author Ranga Reddy
 * @version 1.0
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl()");
	}
	
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public long createEmployee(EmployeeDto employee) {
        return employeeDAO.createEmployee(EmployeeMapper.mapDtoToEntity(employee));
    }
    @Override
    public Employee updateEmployee(EmployeeDto employee) {
        return employeeDAO.updateEmployee(EmployeeMapper.mapDtoToEntity(employee));
    }
    @Override
    public void deleteEmployee(long id) {
        employeeDAO.deleteEmployee(id);
    }
    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
    @Override
    public EmployeeDto getEmployee(long id) {
        return employeeDAO.getEmployee(id);
    }    
    @Override
    public List<Employee> getAllEmployees(String employeeName) {
    	return employeeDAO.getAllEmployees(employeeName);
    }
}
