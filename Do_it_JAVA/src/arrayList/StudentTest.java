package arrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 90);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("영어", 80);
        studentKim.addSubject("국어", 90);
        studentKim.addSubject("과학", 100);

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
    }
}
