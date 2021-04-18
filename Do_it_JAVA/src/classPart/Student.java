package classPart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student() {
    } // 이건 자바 컴파일러가 자동으로 추가해준다.
    //특징1 : 매개변수 x, 구현 코드 x
    //특징2 : 생성자가 하나도 없을 대 제공해준다.

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

}