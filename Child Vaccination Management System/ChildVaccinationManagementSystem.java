import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Child {
    String name;
    int age;
    ArrayList<String> vaccines;

    Child(String name, int age) {
        this.name = name;
        this.age = age;
        this.vaccines = new ArrayList<>();
    }

    void addVaccine(String vaccine) {
        vaccines.add(vaccine);
    }

    void showVaccinationDetails() {
        System.out.println("Vaccination Details for " + name + ":");
        for (String vaccine : vaccines) {
            System.out.println("- " + vaccine);
        }
    }
}

class VaccinationSystem {
    HashMap<String, Child> records;

    VaccinationSystem() {
        records = new HashMap<>();
    }

    void addChild(String name, int age) {
        records.put(name, new Child(name, age));
    }

    void bookAppointment(String name, String vaccine) {
        if (records.containsKey(name)) {
            records.get(name).addVaccine(vaccine);
            System.out.println("Appointment booked for " + name + " for " + vaccine + " vaccine.");
        } else {
            System.out.println("Child not found in the system.");
        }
    }

    void showChildDetails(String name) {
        if (records.containsKey(name)) {
            records.get(name).showVaccinationDetails();
        } else {
            System.out.println("Child not found in the system.");
        }
    }

    void showReminders() {
        System.out.println("Vaccination Reminders:");
        for (Child child : records.values()) {
            System.out.println("Reminder for " + child.name + ":");
            child.showVaccinationDetails();
        }
    }
}

public class ChildVaccinationManagementSystem {
    public static void main(String[] args) {
        VaccinationSystem system = new VaccinationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Child Vaccination Management System ---");
            System.out.println("1. Add Child");
            System.out.println("2. Book Vaccination Appointment");
            System.out.println("3. View Child's Vaccination Details");
            System.out.println("4. Show Vaccination Reminders");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter child's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter child's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    system.addChild(name, age);
                    System.out.println("Child added successfully.");
                    break;
                case 2:
                    System.out.print("Enter child's name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter vaccine name: ");
                    String vaccine = scanner.nextLine();
                    system.bookAppointment(name, vaccine);
                    break;
                case 3:
                    System.out.print("Enter child's name: ");
                    name = scanner.nextLine();
                    system.showChildDetails(name);
                    break;
                case 4:
                    system.showReminders();
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
