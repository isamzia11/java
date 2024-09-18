public class Employee
{
 String name;
 int salary;
 Employee(String x, int y)
 {
name = x;
salary = y;
 }   
 Employee(Employee x)
 {
this.name = x.name;
this.salary = x.salary;
 }
 public static void main(String[] args) {
    Employee E1 = new Employee("Isam",90000);
    System.out.println("Name of employe :"+E1.name);
    System.out.println("Salary of employee = "+E1.salary);
    System.out.println("copy detail of object 1 to object 2");
    Employee E2 = new Employee(E1);
    System.out.println("Name of employe :"+E2.name);
    System.out.println("Salary of employee = "+E2.salary);

 }
}
