package final_test.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {
    public static final String VEHICLE_REGEX = "[\\d]{2}(A|B|C)-[\\d]{3}.[\\d]{2}";
    public static final String VEHICLE_MOTORCYCLE_REGEX ="[\\d]{2}-[\\W][\\w]-[\\d]{3}.[\\d]{2}";
    public static Pattern pattern;
    public static Matcher matcher;

    public static boolean isValidVehicle(String str ,String regex){
        pattern = Pattern.compile(regex);
        matcher= pattern.matcher(str);

        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("input not matching" + regex);
        }
        return flag;
    }
}
