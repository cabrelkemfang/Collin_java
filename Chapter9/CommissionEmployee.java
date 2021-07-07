package Chapter9;

import Chapter8.example.Employee;

import java.util.Date;

/**
 * Exercise 9.14.
 */
public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    private double PaymentAmout;

    public CommissionEmployee(String fName, String lName, String sSN, Date birthDate, double sales, double rate)
    {
        super(fName, lName,  sSN);
        this.grossSales = sales;
        this.commissionRate = rate;
        this.firstName = fName;
        this.lastName = lName;
        this.socialSecurityNumber = sSN;
    }


    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double sales) {

        if ( sales <= 0.0 )
            throw new IllegalArgumentException("Gross Sales Must Be Positive");

        this.grossSales = sales;
    }

    public void setCommissionRate(double rate) {

        if ( rate <= 0.0 )
            throw new IllegalArgumentException("Commission Rate Must Be Positive");

        this.commissionRate = rate;
    }

    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return "CommissionEmployee { " + super.toString() +
                " grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                " }";
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public void setSocialSecurityNumber(String sSN) {
        this.socialSecurityNumber = sSN;
    }

    protected double getPaymentAmount() {
        return PaymentAmout;
    }
}
