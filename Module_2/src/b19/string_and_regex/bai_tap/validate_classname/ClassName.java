package b19.string_and_regex.bai_tap.validate_classname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASSNAME_REGEX = "[CAP](\\d)+[GHIKLM]";

    public ClassName(){
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
