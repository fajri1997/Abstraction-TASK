package abstraction;

public class Teacher extends Person {
    private String subject;
    private String school;
    private int yearsOfExperience;
    private boolean isFullTime;
    private int numberOfStudents;

    public Teacher(String name, String subject, String school, int yearsOfExperience, boolean isFullTime, int numberOfStudents) {
        super(name);
        this.subject = subject;
        this.school = school;
        this.yearsOfExperience = yearsOfExperience;
        this.isFullTime = isFullTime;
        this.numberOfStudents = numberOfStudents;
    }


    public Teacher() {
        super();
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }


    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(String fullTime) {
        if (fullTime == "yes") {
            isFullTime = true;
        } else if (fullTime == "no") {
            isFullTime = false;
        } else {
            System.out.println("enter yes or no please");
        }
    }


    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void increaseStudentCount(int additionalStudents) {
        this.numberOfStudents += additionalStudents;
        System.out.println("the new number of students for " + getName() + ": " + numberOfStudents);
    }


    @Override
      public String toString() {
        return "Teacher" +
                "\n  Name: '" + getName() + '\'' +
                "\n  Subject: '" + subject + '\'' +
                ",\n  School: '" + school + '\'' +
                ",\n  Years of Experience: " + yearsOfExperience +
                 ",\n  Full-time: " + isFullTime +
                ",\n  Number of Students: " + numberOfStudents +
                "\n";
    }

    void describeRole() {
        System.out.println(getName() + " is a teacher at " + school + " love to teach his student");
    }


}
