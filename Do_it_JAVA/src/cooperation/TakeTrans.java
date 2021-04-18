package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student lee = new Student("lee", 5000);
        Student kim = new Student("kim", 7000);

        Bus bus100 = new Bus(100);
        lee.takeBus(bus100);
        lee.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway(2);
        kim.takeSubway(subwayGreen);
        kim.showInfo();
        subwayGreen.showInfo();
    }
}
