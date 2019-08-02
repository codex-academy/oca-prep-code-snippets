package oca.inheritance;

import java.time.LocalDate;

public class Teacher extends Person {
    double salary;

    public Teacher(String name, String email, LocalDate dob, String cellPhoneNumber, double salary) {
        super(name, email, dob, cellPhoneNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
