package b19.string_and_regex.bai_tap.validate_phonenumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONENUMBER_REGEX = "[(]\\d{2}[)][-][(][0]\\d{9}[)]$";
    public  PhoneNumber(){
        pattern = Pattern.compile(PHONENUMBER_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern. matcher(regex);
        return matcher.matches();
    }
}
