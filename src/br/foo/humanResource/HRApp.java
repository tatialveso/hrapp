package br.foo.humanResource;

public class HRApp {

	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("Sistema de Recursos Humanos");
		System.out.println("-----------------------------\n");
		
		Department d = new Department("Educação");
		System.out.println(d.toString() + "\n");
		
		d.addEmployee(new Employee(750, "Jack", 4000));
		d.addEmployee(new Employee(430, "Mary", 10000));
		d.addEmployee(new Employee(983, "Beatrice", 10500));
		
		Employee[] employees = d.getEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		System.out.println("\nSOMA TOTAL DE SALÁRIOS NO DEPARTAMENTO: " + d.getTotalSalary());
		System.out.println("MÉDIA DOS SALÁRIOS DO DEPARTMENTO: " + d.getSalaryAverage());
	}

}
