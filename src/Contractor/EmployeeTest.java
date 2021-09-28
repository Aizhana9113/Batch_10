package Contractor;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name ="Zack";
        employee1.age =25;
        employee1.setEmplyeeID(11);
        System.out.println(employee1.employeeId);

        Employee employee2= new Employee("female");
        System.out.println(employee2.gender);
        //System.out.println(employee1);// null now // same array storage HASH code location
        //System.out.println(employee2.gender);

        employee1.info();




    }
}
