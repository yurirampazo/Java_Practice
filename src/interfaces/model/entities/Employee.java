package interfaces.model.entities;

public class Employee implements Comparable<Employee> {

    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

//    @Override
//    public int compareTo(Employee o) {
//        return name.compareTo(o.getName());
//    }

//    @Override
//    public int compareTo(Employee o) {
//        return salary.compareTo(o.getSalary());
//    }

    @Override  //Ordenando por ordem decrescente de salário. Quando o salário comparado for maior retorna negativo
                //Quando menor, retorna positivo
    public int compareTo(Employee o) {
        return -salary.compareTo(o.getSalary());
    }


    @Override
    public String toString(){
        return name + "," + salary;
    }
}

