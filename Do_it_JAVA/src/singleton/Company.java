package singleton;

public class Company {

    private static Company instance = new Company();
    // 접근 x : private, 여러개 아니고 하나만 : static
    private Company(){};

    public static Company getInstance(){
        if (instance == null)
            instance = new Company();
        return instance;
    }
}
