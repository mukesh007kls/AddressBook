import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        final int ADD_CONTACT = 1;
        final int EDIT_CONTACT=2;
        final int PRINT_CONTACT = 3;
        final int EXIT = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        AddressBookOperations addressBookOperations = new AddressBookOperations();
        boolean loop = true;
        while (loop) {
            System.out.println("Enter the choice:-\n1.Add a new contact\n2.Edit Contact Details\n3.Display the Contacts\n4.To exit");
            int choice = sc.nextInt();
            switch (choice) {
                case ADD_CONTACT -> addressBookOperations.readDetails();
                case EDIT_CONTACT -> addressBookOperations.editDetails();
                case PRINT_CONTACT -> addressBookOperations.printDetails();
                case EXIT -> loop = false;
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}