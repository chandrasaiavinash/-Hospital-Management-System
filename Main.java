import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient p = new Patient();

        while (true) {
            System.out.println("\n--- Hospital Management Menu ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter disease: ");
                    String disease = sc.nextLine();
                    p.addPatient(name, age, disease);
                    break;

                case 2:
                    p.showPatients();
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
