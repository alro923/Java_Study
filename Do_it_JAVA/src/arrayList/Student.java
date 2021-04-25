package arrayList;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    // 학생이 과목을 수강하면, subjectList에 추가해야겠죠!
    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);

        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total = 0;
        for(Subject subject : subjectList){
            System.out.println(studentName+ " 학생의 " + subject.getName() + " 점수는 " + subject.getScore() + " 점 입니다.");
            total += subject.getScore();
        }
        System.out.println(studentName+ " 학생의 총점은 " + total + " 점 입니다.");
    }
}
