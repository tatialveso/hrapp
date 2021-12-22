package br.foo.humanResource;

public class HRApp {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------");
		System.out.println("Boas vindas ao Sistema de Recursos Humanos");
		System.out.println("--------------------------------------------");
		
		/* Department createDepartment = new Department();
		createDepartment.toString(); */
		
		Employee e1 = new Employee(540, "Tati", 5000.0);
		Employee e2 = new Employee(540, "Jeery", 5000.0);
		System.out.println(e1);
		System.out.println(e2);
	}

}
