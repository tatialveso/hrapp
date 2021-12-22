package br.foo.humanResource;

public class HRApp {

	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("Sistema de Recursos Humanos");
		System.out.println("-----------------------------\n");
		
		Department d = new Department("Educa��o");
		System.out.println(d.toString() + "\n");
		
		d.addEmployee(new Employee(750, "Jack", 4000));
		d.addEmployee(new Employee(430, "Mary", 10000));
		d.addEmployee(new Employee(983, "Beatrice", 10500));
		
		Employee[] employees = d.getEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		System.out.println("\nSOMA TOTAL DE SAL�RIOS NO DEPARTAMENTO: " + d.getTotalSalary());
		System.out.println("M�DIA DOS SAL�RIOS DO DEPARTMENTO: " + d.getSalaryAverage());
	}

}
