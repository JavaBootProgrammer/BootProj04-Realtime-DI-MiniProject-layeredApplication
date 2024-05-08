package com.nt;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmployeeOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj04RealtimeDiMiniProjectLayeredApplication {

	public static void main(String[] args) {
		   //get  IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj04RealtimeDiMiniProjectLayeredApplication.class, args);
		  //get access to controller class obj
		EmployeeOperationsController controller=ctx.getBean("empController",EmployeeOperationsController.class);
		// invoke the b.method
		try {
			List<Employee> list=controller.showEmployeesByDesgs("CLERK", "MANAGER", "SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("PRoblem is code ::"+e.getMessage());
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		String beanids[]=ctx.getBeanDefinitionNames();
		System.out.println("All bean ids are ::"+Arrays.toString(beanids));
		
		//close the IOC container
		((ConfigurableApplicationContext) ctx).close();
		
		
	}

}
