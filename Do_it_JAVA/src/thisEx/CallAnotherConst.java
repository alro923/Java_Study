package thisEx;

class Person{
    String name;
    int age;

    public Person(){
        // name = "이름없음";
        // age = 1;
        this("이름없음", 1); // 이 앞에는 아무 statement 도 올 수 없다!
        // 생성자 안에서, 아래에 있는 public Person(S n, i a) 이 생성자 호출하는 거임
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person returnSelf(){
        return this;
    }
}
public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.returnSelf());
    }
}
