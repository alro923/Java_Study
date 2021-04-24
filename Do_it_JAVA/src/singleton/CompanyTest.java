package singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        // Company c1 = new Company();
        // Company c2 = new Company();
        // 이렇게 하면 서로 다른 인스턴스 여러개 생성하는 거잖아...
        // 딱 하나만 만들고 싶어!!

        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        // Company c3 = new Company(); // error
        System.out.println(c1 == c2); // true
        System.out.println(c1);
        System.out.println(c2); // 주소값이 같음을 알 수 있다.

        // Calendar 클래스도 singleton 패턴으로 구현되어 있다.
        // new 해보면, constructor 가 없고, getInstance()가 있다.
        // 시간이란 건 여러개가 아니고, 하나만 있기 때문에 singleton 으로 제공한다.
        // 시간은 다 같으니까, 여러개를 만들 필요는 없다!
        // (sout 해보면 false 나오는데, 만들어진 시간이 달라서 그렇다)
        Calendar cal = Calendar.getInstance();
    }
}
