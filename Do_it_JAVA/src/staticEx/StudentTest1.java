package staticEx;

public class StudentTest1 {

    public static void main(String[] args) {

        System.out.println(Student.getSerialNum());

        Student studentlee = new Student();
        System.out.println(studentlee.studentID);

        Student studentkim = new Student();
        System.out.println(studentkim.studentID);
    }
}
