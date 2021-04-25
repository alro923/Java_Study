package inheritance;

public class Customer_Gold extends Customer{
    public Customer_Gold(int customerID, String customerName) {
        super(customerID, customerName);
        bonusRatio = 0.05;

        System.out.println("Customer_Gold(int, String) 호출");
    }

    @Override // 재정의 된 거다!
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return "Gold 등급인 " + super.showCustomerInfo();
    }
}
