package Chapter9;

/**
 * Exercise 9.14
 */
public class CommissionEmployeeTest {

    public static void main(String[] args )
    {
        //Instantiate Commission Employee Object
        CommissionEmployee comm_employee = new CommissionEmployee("Suh", "Jones", "222-222-222", birthDate, 10000, 0.06 );

        //get commission employment data
        BasePlusCommissionEmployeeTest.basePlusCommision(comm_employee.getFirstName(), comm_employee.getLastName(),
                comm_employee.getSocialSecurityNumber(), comm_employee.getGrossSales(), comm_employee.getCommissionRate(),
                (BasePlusCommissionEmployee) comm_employee);
        System.out.printf("%s %.2f%n", "Base Salary Is", ((BasePlusCommissionEmployee) comm_employee).getBaseSalary() );

        System.out.printf("\n%s: %s\n", "Same Employee Information Obtained By toString", comm_employee.toString() );

        comm_employee.setGrossSales(5000);
        comm_employee.setCommissionRate(0.1);

        System.out.printf("\n%s: %s\n", "Updated Employee Information Obtained By toString", comm_employee.toString() );
    }
}
