package abstraction;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Teacher ali = new Teacher("Ali", "Java 101", "Coded", 15, true, 118);
        Teacher fajri = new Teacher("Fajri", "Java 101", "Coded", 1, false, 18);

        ali.describeRole();
        fajri.describeRole();

        System.out.println("############################");


        ali.increaseStudentCount(5);
        fajri.increaseStudentCount(3);


        System.out.println("############################");

        System.out.println(ali);
        System.out.println(fajri);

    }
}
