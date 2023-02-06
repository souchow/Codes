package assignment2;

public class Employee {
    private  int id;
    private String firstName;
    private String lastName;
    private int salary;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName + lastName;
    }
    public String toString(){
        return ("Employee[id = " + getId() +"," + "name = " + getName() + "," + "salary = " + getSalary());
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //Java Day-4 Qs.3
    private static int count = 0;
    private static final int MAX_COUNT = 3;
    private static Employee[] instances = new Employee[MAX_COUNT];

    private Employee(){
        count++;
    }
    public static  Employee getInstance(){
        if(count < MAX_COUNT){
            instances[count] = new Employee();
            return instances[count];
        }
        else{
            return null;
        }
    }
    public int raiseSalary(int percent){
        int amount = ((percent * salary)/100);
        return (salary += amount);
    }
}
