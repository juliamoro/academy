package by.academy.homework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {
    public static final String REG_X = "\\\\d{2}\\\\/\\\\d{2}\\\\/\\\\d{4}";
    public static final String REG_Y = "\\\\d{2}\\\\-\\\\d{2}\\\\-\\\\d{4}";

    public void formatReg(Date dateType) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day, month, and year ");
        boolean exit = false;
        while (exit) {
            String str = scan.nextLine();
            Pattern patX = Pattern.compile(REG_X);
            Pattern patY = Pattern.compile(REG_Y);
            Matcher matX = patX.matcher(str);
            Matcher matY = patY.matcher(str);
            if (matX.matches() == true) {
                exit = true;
                System.out.println("The date was entered correctly");
                dateType = new SimpleDateFormat(("'Date : ' dd \n 'Month : ' MMMM \n 'Year : ' yyyy \n")).parse(str);
            }
            if (matY.matches() == true) {
                exit = true;
                System.out.println("The date was entered correctly");
                dateType = new SimpleDateFormat(("'Date : ' dd \n 'Month : ' MMMM \n 'Year : ' yyyy \n")).parse(str);
            } else {
                System.out.println("The date is entered incorrectly!!!");
            }
        }
    }
}
