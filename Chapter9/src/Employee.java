package Chapter9.src;

import Chapter8.example.Date;

/**
 * Exercise 9.14
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee()
    {
        this.firstName = " ";
        this.lastName = " ";
        this.socialSecurityNumber = " ";
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Employee(String firstName, String lastName, String ssn, Date birthDate) {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public abstract double getPaymentAmount();

    public String toString() {
        return "Employee { " +
                "firstName='" + firstName +
                ", lastName='" + lastName +
                ", socialSecurityNumber='" + socialSecurityNumber +
                " }";
    }

    public abstract double earnings();
}
