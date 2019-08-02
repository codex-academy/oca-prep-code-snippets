package oca.inheritance;

import java.time.LocalDate;

public class Learner extends Person {

    String grade;
    double bursary;

    public Learner(String name, String email, LocalDate dob, String cellPhoneNumber) {
        super(name, email, dob, cellPhoneNumber);
    }

    public double getBursary() {
        return bursary;
    }

    public void setBursary(double bursary) {
        this.bursary = bursary;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
