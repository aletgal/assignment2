public class Employee extends Person{
    private double salary;

    public Employee(){
        super();
    }

    public Employee(String name, String surname, Double salary) {
        super(name, surname);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


}
