package com.journaldev.spring.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.journaldev.spring.model.Employee;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_DEFAULT)
public class EmployeeDto implements Serializable {
	
	private static final long serialVersionUID = -7988799579036225137L;

    private long id;
   
    private String name;
    private String status;
    
    private List<Employee> listAllEmpl;
	private Employee singleEmp;

	
    public Employee getSingleEmp() {
		return singleEmp;
	}

	public void setSingleEmp(Employee singleEmp) {
		this.singleEmp = singleEmp;
	}

	public List<Employee> getListAllEmpl() {
		return listAllEmpl;
	}

	public void setListAllEmpl(List<Employee> listAllEmpl) {
		this.listAllEmpl = listAllEmpl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private int age;
    
    private float salary;

    public EmployeeDto() {
		// TODO Auto-generated constructor stub
	}
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}