package singleton;

public class Company {

    private static Company instance = new Company();
    // 접근 x : private, 여러개 아니고 하나만 : static
    // 이 instance 가, 전체(+외부)에서 유일하게 사용될 인스턴스임
    // 함부로 null이된다거나, 값이 바뀌면 안되니까 private으로 선언
    // 여러개 있을게 아니고, 딱 하나만 있을거니까 static으로 선언
    // 이 instance 를 외부에서 가져다 쓸 수 없으니까, public 으로 getIstance 만들어줌
    private Company(){};
    // default 가 public이니까, private으로 만들어버림

    public static Company getInstance(){
        if (instance == null)
            instance = new Company();
        return instance;
    }
    // 메서드를 public 으로 제공하면, 생성된 instance를 외부에서 접근 가능
    // 객체를 생성하지 않고 이 메서드를 부르기 위해, 이 메서드를 static으로 선언한다.
}
