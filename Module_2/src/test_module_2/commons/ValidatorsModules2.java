package test_module_2.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorsModules2 {
    public static final String BENH_AN_REGEX = "BA-[\\d]{3}";
    public static final String BENH_NHAN_REGEX = "BN-[\\d]{3}";
    public static final String NGAY_REGEX = "[\\d]{2}/[\\d]{2}/[\\d]{4}";
    public static final String VIP_REGEX = "(VIP1,VIP2,VIP3) ";
    private static Pattern pattern;
    private static Matcher matcher;

    public static boolean isValidRegex (String str, String regex){
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);

        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("nhap khong dung dinh dang" + regex);
        }
        return flag;
    }

//    public static  boolean isMoreThan(double number, double destNumber){
//        boolean flag = number > destNumber;
//
//        if (!flag){
//            System.out.println("input not more than" + number);
//        }
//        return flag;
//    }
//
//    public static boolean isLessThan(double number, double destNumber){
//        boolean flag = number < destNumber;
//
//        if ((!flag)){
//            System.out.println("input must less than" + number);
//        }
//        return flag;
//    }
//
//    public static  boolean isMoreThan (double number, double startNumber, double endNumber){
//        boolean flag = number>startNumber&&number<endNumber;
//        if (!flag){
//            System.out.println("input must between (" + startNumber +"," + endNumber +")");
//        }
//        return flag;
//    }


}
