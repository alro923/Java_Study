package inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerKim = new Customer(10010, "Kim");
        int priceKim = customerKim.calcPrice(10000);
        System.out.println("지불 금액은 " + priceKim + "이고, " + customerKim.showCustomerInfo());

        Customer_VIP customerLee = new Customer_VIP(10011, "Lee", 101);
        int priceLee = customerLee.calcPrice(10000);
        System.out.println("지불 금액은 " + priceLee + "이고, " + customerLee.showCustomerInfo());

        Customer customerWho = new Customer_VIP(10012, "Who", 102);
        int priceWho = customerWho.calcPrice(10000);
        System.out.println("지불 금액은 " + priceWho + "이고, " + customerWho.showCustomerInfo());
        // 어..? VIP 꺼가 불렸네?
        // 참조는 Customer 꺼를 해서 agentID가 안 불리는데,
        // VIP 꺼 메소드가 불렸다.
        // 인스턴스를 new Customer_VIP 로 생성했는데,
        // 형 변환을 했으니까 원래는 Customer의 함수,필드에만 접근 가능하다.
        // 그런데, Customer_VIP 에서 showInfo 함수를 재정의해서 이런 결과가 나오는 것이다.
        // 이게 바로 '가상함수' 라는 것이다.

        Customer customerGuem = new Customer_Gold(10013, "Guem");
        System.out.println(customerGuem.showCustomerInfo());
    }
}
