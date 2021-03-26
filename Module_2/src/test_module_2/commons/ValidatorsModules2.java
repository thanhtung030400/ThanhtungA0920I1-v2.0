package test_module_2.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorsModules2 {
    public static  final String REGEX = "";
    public static  final String REGEX_1 = "";
    private static Pattern pattern;
    private static Matcher matcher;

    public static boolean isValidRegex (String str, String regex){
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);

        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("input is not matching" + regex);
        }
        return flag;
    }

    public static  boolean isMoreThan(double number, double destNumber){
        boolean flag = number > destNumber;

        if (!flag){
            System.out.println("input not more than" + number);
        }
        return flag;
    }

    public static boolean isLessThan(double number, double destNumber){
        boolean flag = number < destNumber;

        if ((!flag)){
            System.out.println("input must less than" + number);
        }
        return flag;
    }

    public static  boolean isMoreThan (double number, double startNumber, double endNumber){
        boolean flag = number>startNumber&&number<endNumber;
        if (!flag){
            System.out.println("input must between (" + startNumber +"," + endNumber +")");
        }
        return flag;
    }


}
