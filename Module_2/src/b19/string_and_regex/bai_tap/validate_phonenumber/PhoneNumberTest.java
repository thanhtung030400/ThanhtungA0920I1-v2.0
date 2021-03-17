package b19.string_and_regex.bai_tap.validate_phonenumber;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumber= new PhoneNumber();
        for (String number : validPhoneNumber){
            boolean isValid = phoneNumber.validate(number);
            System.out.println("This phone number is "+ number + "is valid "+ isValid);
        }
        for (String number: invalidPhoneNumber){
            boolean isValid = phoneNumber.validate(number);
            System.out.println("This phone number is " + number + "is valid " + isValid);
        }
    }
}
