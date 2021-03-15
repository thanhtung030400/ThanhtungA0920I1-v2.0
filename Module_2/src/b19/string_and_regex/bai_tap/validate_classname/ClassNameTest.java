package b19.string_and_regex.bai_tap.validate_classname;

public class ClassNameTest {
    private static ClassName className;
    private static final String[] validClassName = new String[]{"C0318G"};
    private static final String[] invalidClassName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String name  : validClassName){
            boolean isValid = className.validate(name);
            System.out.println("class name is " + name + " is valid " + isValid);
        }
        for (String name: invalidClassName){
            boolean isValid = className.validate(name);
            System.out.println("class name is " + name + " is valid " + isValid);
        }
    }
}
