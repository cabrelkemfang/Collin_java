package Chapter8.example;
// Fig. 8.8: Employee.java
// Employee class with references to other objects.
// Java How to Program, 10th Ed. (Deitel) Page 329


public class Employee
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
   private Date birthDate;
   private Date hireDate;

   public Employee( String first, String last, String sSN, Date dateOfBirth,
      Date dateOfHire )
   {
      firstName = first;
      lastName = last;
      birthDate = dateOfBirth;
      hireDate = dateOfHire;
   }

   public Employee(String fName, String lName, String sSN) {
      firstName = fName;
      lastName = lName;
      socialSecurityNumber = sSN;
   }

	public Employee(String fNAme, String lName, String ssn, java.util.Date birthDate, double sales, double rate) {
	}

	public String getFirstName() {
      return firstName;
   }
   public String getLastName() { return lastName; }

   public String getSocialSecurityNumber() { return socialSecurityNumber; }

   public String toString()
   {
      return String.format( "%s, %s  Hired: %s  Birthday: %s",
         lastName, firstName, hireDate, birthDate );
   }
}
