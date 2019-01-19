
public class Empregado {

	private String name;
	private int age;
	private double wage;
	
	
	public Empregado(String name, int age, double wage) {
		super();
		this.name = name;
		this.age = age;
		this.wage = wage;
	}

	public double salarioanual() {
		return this.wage *12;
	}
	
	public void displaySalario() {
		System.out.println(this.wage);
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


	public double getWage() {
		return wage;
	}


	public void setWage(double wage) {
		this.wage = wage;
	}
	
	
}
