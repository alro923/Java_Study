package inheritance;

public class Customer_VIP extends Customer{
    int agentID;
    double saleRatio;

    public Customer_VIP(int customerID, String customerName){

        // super(); <- 안보이지만, 이게 호출 되는 것이다! 즉, Customer 를 호출함.
        // 그런데, 이게 default constructor 를 호출하는거라, 다른 constructor 만들어서 default 없으면 에러남.
        super(customerID, customerName); // 그래서, 이렇게 해줘야함
        customerGrade = "VIP";
        bonusRatio = 0.05; // override 됨
        saleRatio = 0.1;
        // super.setBonusPoint(1000);

        System.out.println("Customer_VIP(int, String) 호출");
    }

    public int getAgentID(){
        return agentID;
    }
}
