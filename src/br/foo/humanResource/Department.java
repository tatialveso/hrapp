package br.foo.humanResource;

public class Department {
	private String name;
	private Employee[] employees = new Employee[10];
	private int lastAddedEmployeeIndex = -1;
	
	//constructor
	public Department(String name) {
		this.name = name;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//add employees to the system
	public void addEmployee(Employee employee) {
		if(lastAddedEmployeeIndex < employees.length) {
			lastAddedEmployeeIndex++;
			employees[lastAddedEmployeeIndex] = employee;
		}
	}
	
	//get employees list
	public Employee[] getEmployees() {
		Employee[] employeeList = new Employee[lastAddedEmployeeIndex + 1];
		for(int i = 0; i < employeeList.length; i++) {
			employeeList[i] = employees[i];
		}
		
		return employeeList;
	}
	
	//total number of employees
	public int totalEmployees() {
		return lastAddedEmployeeIndex + 1;
	}
	
	//find an employee by their id number
	public Employee getEmployeeById(int employeeId) {
		for(Employee employee : employees) {
			if(employee != null) {
				if(employee.getId() == employeeId) {
					return employee;
				}	
			}
		}
		
		return null;
	}
	
	//total salary of all employees in the department
	public double getTotalSalary() {
		double totalSalary = 0.0;
		
		for(int i = 0; i <= lastAddedEmployeeIndex; i++) {
			totalSalary += employees[i].getSalary();
		}
		
		return totalSalary;
	}
	
	//salary average in the department
	public double getSalaryAverage() {
		if(lastAddedEmployeeIndex > -1) {
			return getTotalSalary() / (lastAddedEmployeeIndex + 1);
		} else {
			return 0.0;
		}
	}

	//to string method
	public String toString() {
		return "DEPARTAMENTO: " + getName();
	}
}
