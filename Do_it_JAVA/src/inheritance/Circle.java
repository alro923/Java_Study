package inheritance;

public class Circle {
    Point point; // 여기서 extends 해서 쓸 필요 없고, Point 로 쓰면 된다.
    // Cirlce 과 Point는 합성. has-a 관계
    private int radius;
    public Circle() {
        point = new Point(); // constructor 이용해서, 생성할때 바로 만듦
    }

}
