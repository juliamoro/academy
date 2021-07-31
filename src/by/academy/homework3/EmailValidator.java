package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    public static final String REG_EMAIL = "\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,6}";

    @Override
    public boolean validator(String email) {
        Pattern pattern = Pattern.compile(REG_EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

}
