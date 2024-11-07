package abstraction;

abstract class Person {
    private String name; // Common property for all persons

    // Constructor to initialize the name
    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    // Common method to get the person's name
    public String getName() {
        return name;
    }


    void describeRole() {
        System.out.println("This person is has describeRole.");
    }

}
