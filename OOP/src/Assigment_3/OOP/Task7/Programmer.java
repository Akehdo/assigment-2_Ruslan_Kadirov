package Assigment_3.OOP.Task7;

public class Programmer {
    private int salary = 1000;

    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        programmer.setSalary(900);
        System.out.println("Salary: " + programmer.getSalary());

        programmer.setSalary(1200);
        System.out.println("Salary: " + programmer.getSalary());
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }
    }

}

