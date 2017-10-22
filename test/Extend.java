class Employee {
	public String name;
	public int id;
	public int sallary;
	public Employee(String nm, int i, int sa) {
		name = nm;
		id = i;
		sallary = sa;
	}
	public void PyoSi() {
		System.out.println(name + '\t' + id + '\t' + sallary + "$");
	}
}
class Director extends Employee{
	private String carname;
	public Director(String nm, int i, int sa,String cn){
		super(nm,i,sa);
		carname = cn;
	}
	public void PyoSi() {
		System.out.println("Dir:: " + name + '\t' + id + '\t' + sallary + "$");
	}
	public void car(){
		System.out.println("CAR : "+carname);
	}
}
class Extend {
	public static void main(String[] args) {
		Employee emp = new Employee("JHON", 120140001, 1000);
		Director dir = new Director("SMITH", 120140002, 2000, "Avnatee");
		emp.PyoSi();
		dir.PyoSi();
		dir.car();
	}
}
