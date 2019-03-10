package com.journaldev.spring.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.journaldev.spring.dto.EmployeeDto;
import com.journaldev.spring.dto.befitUserDto;
import com.journaldev.spring.dto.logindto;
import com.journaldev.spring.dto.response;
import com.journaldev.spring.model.Employee;
import com.journaldev.spring.model.befitUser;
import com.journaldev.spring.service.EmployeeService;
import com.journaldev.spring.service.befitUserService;;
/**
 * @author Ranga Reddy
 * @version 1.0
 */
@Controller
public class HomeControllerRest {
	
	private static final Logger logger = Logger.getLogger(HomeControllerRest.class);
	
	public HomeControllerRest() {
		System.out.println("EmployeeController()");
	}

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private befitUserService befitUserService;
   
    @ResponseBody
    @RequestMapping(value="saveEmployee",headers="Accept=application/json",produces = {MediaType.APPLICATION_JSON_VALUE})
    public EmployeeDto saveEmployee(@RequestBody EmployeeDto employee) {
    	logger.info("Saving the Employee. Data : "+employee);
    	long i=0L;
        if(employee.getId() == 0){ // if employee id is 0 then creating the employee other updating the employee
            i= employeeService.createEmployee(employee);
        } else {
           employeeService.updateEmployee(employee);
        }
        EmployeeDto res=new EmployeeDto();
        if(i!=0L){
    	res.setStatus("$200 OK");
        }
        else
        	res.setStatus("$600 not done");
    	 return res;
    }
    //
   
    
    @RequestMapping("deleteEmployee")
    public ModelAndView deleteEmployee(@RequestParam long id) {
    	logger.info("Deleting the Employee. Id : "+id);
        employeeService.deleteEmployee(id);
        return new ModelAndView("redirect:getAllEmployees");
    }
    
    @RequestMapping(value = "/")
    public ModelAndView getAllEmployees() {
    	logger.info("Getting the all Employees.");
        List<Employee> employeeList = employeeService.getAllEmployees();
        return new ModelAndView("employeeList", "employeeList", employeeList);
    }
    //show Employee in json format  
    @ResponseBody
    @RequestMapping(value = "getAllEmployee",method=RequestMethod.GET ,headers="Accept=application/json", produces = {MediaType.APPLICATION_JSON_VALUE})
    public EmployeeDto getAllEmployeesREST() {
    	logger.info("Getting the all Employees.");
      List<Employee> employeeList = employeeService.getAllEmployees();
      EmployeeDto dt=new EmployeeDto();
      dt.setListAllEmpl(employeeList);
      return dt;
    }
    @ResponseBody
    @RequestMapping(value="searchEmployee",method=RequestMethod.POST,headers="Accept=application/json", produces = {MediaType.APPLICATION_JSON_VALUE})
    public EmployeeDto searchEmployee(@RequestBody Employee employee) {  
    	logger.info("Searching the Employee. Employee Names: "+employee.getName());
    	List<Employee> employeeList = employeeService.getAllEmployees(employee.getName());
    	EmployeeDto dt=new EmployeeDto();
        dt.setListAllEmpl(employeeList);
        return dt;   	
    }
    
    //beFit Rest Api from here
    
    @ResponseBody
    @RequestMapping(value="registerBefitUser",headers="Accept=application/json",produces = {MediaType.APPLICATION_JSON_VALUE})
    public befitUserDto registerBefitUser(@RequestBody befitUser befitUser) {
    	logger.info("Saving the befitdata. Data : "+befitUser);
    	long i=0L;
        if(befitUser.getId() == 0){ // if employee id is 0 then creating the employee other updating the employee
            i=befitUserService.register(befitUser);
        } else {
        	befitUserService.register(befitUser);
        }
        befitUserDto res=new befitUserDto();
        if(i!=0L){
    	res.setStatus("$200 OK");
        }
        else
        	res.setStatus("$600 not done");
    	 return res;
    }
    
    @ResponseBody
    @RequestMapping(value="login",headers="Accept=application/json",produces = {MediaType.APPLICATION_JSON_VALUE})
    public logindto loginUser(@RequestBody befitUser befitUser)
    {
    	String mobile=befitUser.getMobile();
    	String password=befitUser.getPassword();
    	logindto dt=new logindto();
    	dt=befitUserService.login(mobile, password);
    	
    	
    	return dt;
    }
    
    
    
    
    
    
    
    
}