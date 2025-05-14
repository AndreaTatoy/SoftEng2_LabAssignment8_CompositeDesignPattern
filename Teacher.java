public class Teacher implements OrganizationalComponent {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public int getNumberOfStudents() {
        return 0;
    }

    @Override
    public double getBudget() {
        return salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher: " + name);
        System.out.println("   Subject: " + subject);
        System.out.println("   Salary: PHP" + String.format("%.2f", salary) + "\n");
    }
} 