package Methods;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setStudentName("David ");
        student2.setStudentName("Jonn");
        System.out.println(student1.studentName);
        System.out.println(student2.studentName);

        student1.setSchoolName("Techtorial");// Techtorial
        System.out.println(student2.schoolName);//Tech School
        System.out.println(student2.schoolName);//Tech School

        Student.setSchoolAdress("2200 E Davon Avenue");
        System.out.println(student1.schoolAdress);//200 E Davon Avenue
        System.out.println(student2.schoolAdress);//2200 E Davon Avenue
// it is doent matter how do we initialize the static variables
        // when we initialize it the variables is going to be same for every object

    setStaticVariables("Techtorial", "2200 E Devon Avenue ");
    // if method return type void we can

    Student student3 = new Student();
        System.out.println(student3.schoolAdress);

        // it is doent matter how many student object we are create, bc our address
        // and schoolName is going to be common for every object.

    }
    public static void setStaticVariables(String schoolName, String adress){
        Student. setSchoolAdress(adress);
        Student.setSchoolName(schoolName);
        Student. setSchoolName(schoolName);

    }
}
