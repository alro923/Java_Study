package classPart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이자바";
        studentLee.address = "서울시 광진구 군자동";
        studentLee.studentID = 100;

        studentLee.showStudentInfo();

        Student studentKim = new Student(200, "김자바");
        studentKim.address = "서울시 어쩌구 가츠동";

        studentKim.showStudentInfo();

        studentKim.setStudentName("김인페");
        System.out.println(studentKim.getStudentName());

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
