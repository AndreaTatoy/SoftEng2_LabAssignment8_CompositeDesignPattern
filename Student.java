public class Student implements OrganizationalComponent {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public int getNumberOfStudents() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee; 
    }

    @Override
    public void displayDetails() {
        System.out.println("  > Student: " + name);
        System.out.println("      Student ID: " + studentId);
        System.out.println("      Tuition Fee: PHP" + String.format("%.2f", tuitionFee) + "\n");
    }
} 