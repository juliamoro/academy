package by.academy.homework4;
import java.util.Scanner;

public class Date {

    private Day day;
    private Month month;
    private Year year;

    Scanner s = new Scanner(System.in);

    public class Day {
        private int day;

        Day() {
        }

        Day(int day) {
            this.day = day;
        }

        Day(String day) {
            this.day = Integer.parseInt(day);
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }
    }

    public class Month {
        private int month;

        Month() {
        }

        Month(int month) {
            this.month = month;
        }

        public Month(String month) {
            this.month = Integer.parseInt(month);
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }
    }

    public class Year {
        private int year;

        Year() {
        }

        Year(int year) {
            this.year = year;
        }

        public Year(String year) {
            this.year = Integer.parseInt(year);
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Day getDay() {
        return day;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Month getMonth() {
        return month;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Year getYear() {
        return year;
    }

    public Date() {
        super();
    }

    public Date(Day day, Month month, Year year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(String date) {
        setDate(date);
    }

    public void setDate(String date) {
        day = new Day(date.substring(0, 2));
        month = new Month(date.substring(3, 5));
        year = new Year(date.substring(6));
    }

    public String getDate() {
        return day.getDay() + "-" + month.getMonth() + "-" + year.getYear();
    }

    public String printDayOfWeek() {
        String str;
        int num = s.nextInt();
        switch (num) {
            case (1):
                return str = Week.Sunday.getIndex();
            case (2):
                return str = Week.Monday.getIndex();
            case (3):
                return str = Week.Tuesday.getIndex();
            case (4):
                return str = Week.Wednesday.getIndex();
            case (5):
                return str = Week.Thursday.getIndex();
            case (6):
                return str = Week.Friday.getIndex();
            case (7):
                return str = Week.Saturday.getIndex();
            default:
                return "there is no such week!";
        }
    }
    public boolean LeapYear() {
        int year = this.year.getYear();
        if (year % 400 == 0 || year % 4 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        }else {
            return false;
        }
    }
//ошибка
    public void print(){
        int year = this.year.getYear();
        int month = this.month.getMonth();
        int day = this.day.getDay();
    //    LocalDate date = new LocalDate(year,month,day);
    }
}
