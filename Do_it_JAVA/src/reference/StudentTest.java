package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "lee");
        studentLee.setKorean(100);
        studentLee.setMath(100);

        Student studentKim = new Student(101, "kim");
        studentKim.setKorean(50);
        studentKim.setMath(20);

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
    }
}
