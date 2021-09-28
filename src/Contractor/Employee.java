package Contractor;

public class Employee {
    String name;
    int  age;
    int employeeId;
    String gender;
    String companyName = "Techtorial";

    public int setEmplyeeID(int id){
        employeeId =id;
        return employeeId;
    }
    //   +++++++++++++   CREATE CONTRACTOR+++++++++++++++


    public void info(){
        System.out.println(name+age+employeeId+gender+companyName);
    }

    public Employee(){

    }// without this static will NOT work employee1

    public Employee(String newGender){
        gender= newGender;

    }

}
