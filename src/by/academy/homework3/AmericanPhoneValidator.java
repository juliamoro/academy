package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator{
public static final String REG_American_Phone = "\\+1[0-9]{10}";
    @Override
    public boolean validator(String phone) {
        Pattern pattern = Pattern.compile(REG_American_Phone);
        Matcher matcher = pattern.matcher(phone);
        return matcher.find();
    }
}
