package hiding;

class BirthDay {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (month == 2) {
            if (day < 1 || day > 28) {
                System.out.println("날짜 오류입니다.");
            }
        } else {
            this.day = day;
        }
    }

    public void setMonth(int month) {

        this.month = month;
    }

//    public void setYear(int year) {
//        this.year = year;
//    }
    // 이러면 year 는 READ ONLY 가 되는 것임~
}

public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay bDay = new BirthDay();

        bDay.setDay(18);
        bDay.setMonth(4);
        // bDay.setYear(2021);
    }
}
