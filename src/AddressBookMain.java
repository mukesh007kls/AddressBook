import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        final int ADD_ADDRESS_BOOK = 1;
        final int PRINT_ADDRESS_BOOK = 2;
        final int EXIT = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        AddressBookOperations addressBookOperations = new AddressBookOperations();
        boolean loop = true;
        while (loop) {
            System.out.println("Enter the choice:-\n1.Add a new Address Book\n2.Print Address Books\n3.To exit");
            int choice = sc.nextInt();
            switch (choice) {
                case ADD_ADDRESS_BOOK -> addressBookOperations.createAddressBooks();
                case PRINT_ADDRESS_BOOK -> addressBookOperations.printBooks();
                case EXIT -> loop = false;
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}