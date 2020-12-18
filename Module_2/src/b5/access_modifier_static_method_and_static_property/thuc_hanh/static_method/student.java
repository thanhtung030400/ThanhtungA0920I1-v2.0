package b5.access_modifier_static_method_and_static_property.thuc_hanh.static_method;

public class student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    student(int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college ="CODEGYM";
    }

    void display(){
        System.out.println(rollno + "" + name + "" + college);
    }
}
