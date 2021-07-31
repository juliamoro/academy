package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator{
    public static final String REG_Belarus_Phone = "\\+375[0-9]{9}}";
    @Override
    public boolean validator(String phone) {
        Pattern pattern = Pattern.compile(REG_Belarus_Phone);
        Matcher matcher = pattern.matcher(phone);
        return matcher.find();
    }
}
