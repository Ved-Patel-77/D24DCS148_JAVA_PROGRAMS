package part3;

public class Employee {
    public static void main(String[] args) {
       
        Employ employee1 = new Employ("John", "Doe", 3000.00);
        Employ employee2 = new Employ("Jane", "Smith", 2500.00);

        
        System.out.println("Yearly Salary of " + employee1.get_fname() + " " + employee1.get_lname() + ": " + employee1.get_annual_income());
        System.out.println("Yearly Salary of " + employee2.get_fname() + " " + employee2.get_lname() + ": " + employee2.get_annual_income());

        
        employee1.raise(10.0);
        employee2.raise(10.0);

        
        System.out.println("Yearly Salary of " + employee1.get_fname() + " " + employee1.get_lname() + " after 10% raise: " + employee1.get_annual_income());
        System.out.println("Yearly Salary of " + employee2.get_fname() + " " + employee2.get_lname() + " after 10% raise: " + employee2.get_annual_income());
    }
}


	
