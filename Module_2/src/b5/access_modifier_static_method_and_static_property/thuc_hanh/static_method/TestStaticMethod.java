package b5.access_modifier_static_method_and_static_property.thuc_hanh.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        student.change();

        student s1 = new student(111,"hoang");
        student s2 = new student(222,"khanh");
        student s3 = new student(333,"nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
