package assignment2;

public class EmployeeTestMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Amit ", "Jain", 2500);
        System.out.println(e1);

        //Testing Setters and Getters
        e1.setSalary(999);
        System.out.println(e1); // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

        // Test raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);

        Employee emp = Employee.getInstance();
        Employee emp1 = Employee.getInstance();
        Employee emp2 = Employee.getInstance();
        Employee emp3 = Employee.getInstance();

        if (emp3 == null){
            System.out.println("Cannot Create more than 3 instances of Employee Class");
        }

    }
}
