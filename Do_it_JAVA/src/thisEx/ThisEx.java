package thisEx;

class Birthday{
    int day, month, year;
    public void setYear(int year){
        this.year = year;
        // year = year
        // 이렇게 하면 Birthday의 멤버 변수인 year (this.year) 가 아니라
        // 메소드 setYear의 지역변수인 year (int year)에 assign 된다.
        // // (이름이 같으면 이렇다. 다르면 제대로 멤버 변수에 할당 된다.)
    }

    public void printThis(){
        System.out.println(this);
    }
}
public class ThisEx {
    public static void main(String[] args) {
        Birthday b1 = new Birthday();
        Birthday b2 = new Birthday();

        System.out.println(b1);
        b1.printThis();

        System.out.println(b2);
        b2.printThis();
    }
}
