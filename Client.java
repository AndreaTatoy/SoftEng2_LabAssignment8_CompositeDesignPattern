public class Client {
    public static void main(String[] args) {
        College cicsCollege = new College("College of Informatics and Computing Studies");

        // create departments
        Department csDepartment = new Department("Computer Science");
        Department itDepartment = new Department("Information Technology");

        // create teachers
        Teacher teacher1 = new Teacher("Sir Jerico Esperanza", "Software Engineering 2", 25000);
        Teacher teacher2 = new Teacher("Ma'am Lori Laureta", "Free Elective 2: Technopreneurship", 24500);
        Teacher teacher3 = new Teacher("Sir Nhiall Gaspar", "Application Development & Emerging Technologies", 23200);

        // create students
        Student student1 = new Student("Laura Tatoy", "CS001", 5000);
        Student student2 = new Student("Fiona Buri", "CS002", 5000);
        Student student3 = new Student("Shelly Telen", "CS003", 4500);
        Student student4 = new Student("Kyle Mercado", "IT001", 4300);
        Student student5 = new Student("Rachel Daanoy", "IT002", 4500);

        csDepartment.add(teacher1);
        csDepartment.add(teacher2);
        csDepartment.add(student1);
        csDepartment.add(student2);
        csDepartment.add(student3);

        itDepartment.add(teacher3);
        itDepartment.add(student4);
        itDepartment.add(student5);

        cicsCollege.add(csDepartment);
        cicsCollege.add(itDepartment);

        System.out.println("New Era University");
        cicsCollege.displayDetails();

        // summary
        System.out.println("\n---------- Summary ---------- ");
        System.out.println("Total Students in College: " + cicsCollege.getNumberOfStudents());
        System.out.println("Total College Budget: PHP" + String.format("%.2f", cicsCollege.getBudget()));
        
        // department summaries
        System.out.println("\n---------- Department Summaries ---------- ");
        System.out.println("Computer Science Department:");
        System.out.println("  Students: " + csDepartment.getNumberOfStudents());
        System.out.println("  Budget: PHP" + String.format("%.2f", csDepartment.getBudget()));
        
        System.out.println("\nInformation Technology Department:");
        System.out.println("  Students: " + itDepartment.getNumberOfStudents());
        System.out.println("  Budget: PHP" + String.format("%.2f", itDepartment.getBudget()));
    }
} 