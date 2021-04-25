package inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {

        Customer_VIP customerLee = new Customer_VIP(1001, "Lee", 100);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        // 묵시적 형변환 (up-casting)
        Customer customerKim = new Customer_VIP(1002, "Kim", 102);
        //customerKim.agentId = 11; 안된다! 변한돼서 Customer 에 없고 VIP 에만 있는 필드 쓸 수 없음

    }
}
