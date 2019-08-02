package oca.inheritance;

import java.time.LocalDate;

class Person {

    private String name;
    private String email;
    private LocalDate dob;
    private String cellPhoneNumber;

    public Person(String name, String email, LocalDate dob, String cellPhoneNumber) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }
}
