package reference;

public class Subject {
    int score;
    String subjectName;

    public Subject(String subjectName){
        this.subjectName = subjectName;
    }
    public void setScore(int score){
        this.score = score;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
