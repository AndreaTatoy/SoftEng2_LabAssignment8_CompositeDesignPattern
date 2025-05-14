import java.util.ArrayList;
import java.util.List;

public class College implements OrganizationalComponent {
    private String name;
    private List<OrganizationalComponent> components;

    public College(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void add(OrganizationalComponent component) {
        components.add(component);
    }

    public void remove(OrganizationalComponent component) {
        components.remove(component);
    }

    public List<OrganizationalComponent> getChildren() {
        return components;
    }

    @Override
    public int getNumberOfStudents() {
        int totalStudents = 0;
        for (OrganizationalComponent component : components) {
            totalStudents += component.getNumberOfStudents();
        }
        return totalStudents;
    }

    @Override
    public double getBudget() {
        double totalBudget = 0;
        for (OrganizationalComponent component : components) {
            totalBudget += component.getBudget();
        }
        return totalBudget;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nCollege: " + name);
        System.out.println("------------------------------------------");
        System.out.println("Total Students: " + getNumberOfStudents());
        System.out.println("Total Budget: PHP" + String.format("%.2f", getBudget()));
        System.out.println("------------------------------------------");
        for (OrganizationalComponent component : components) {
            component.displayDetails();
        }
    }
} 