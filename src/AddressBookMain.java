import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        final int ADD_CONTACT = 1;
        final int PRINT_CONTACT = 2;
        final int EXIT=3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        AddressBookOperations addressBookOperations = new AddressBookOperations();
        boolean loop = true;
        while (loop) {
            System.out.println("Enter the choice:-\n1.Add a new contact\n2.Display the Contacts\n3.To exit");
            int choice = sc.nextInt();
            switch (choice) {
                case ADD_CONTACT -> addressBookOperations.readDetails();
                case PRINT_CONTACT -> addressBookOperations.printDetails();
                case EXIT->loop=false;
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}