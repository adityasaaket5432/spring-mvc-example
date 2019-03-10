package com.journaldev.spring.mapper;

import com.journaldev.spring.dto.EmployeeDto;
import com.journaldev.spring.model.Employee;

public class EmployeeMapper {

	
	public static EmployeeDto mapEntityToDto(Employee e){
		EmployeeDto dto= null;
		if(e!=null){
			dto= new  EmployeeDto();
	    	dto.setId(e.getId());
	    	dto.setAge(e.getAge());
	    	dto.setName(e.getName());
	    	dto.setSalary(e.getSalary());
		}
		return dto;
	}
	
	public static Employee mapDtoToEntity(EmployeeDto e){
		Employee dto= null;
		if(e!=null){
			dto= new  Employee();
	    	dto.setId(e.getId());
	    	dto.setAge(e.getAge());
	    	dto.setName(e.getName());
	    	dto.setSalary(e.getSalary());
		}
		return dto;
	}
}
