import java.util.Scanner;

public class AddressBookMain {
    public static final int ADD_ADDRESS_BOOK = 1;
    public static final int DELETE_ADDRESS_BOOK = 2;
    private static final int EDIT_ADDRESS_BOOK = 3;
    private static final int PRINT_ADDRESS_BOOK = 4;
    public static final int EXIT = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        AddressBookOperations addressBookOperations = new AddressBookOperations();
        boolean loop = true;
        while (loop) {
            System.out.println("Enter the choice:-\n1.Add a new Address Book\n2.Edit Address Book\n3.Delete Address Book\n4.Print Address Books\n5.To exit");
            int choice = sc.nextInt();
            switch (choice) {
                case ADD_ADDRESS_BOOK -> addressBookOperations.createAddressBooks();
                case EDIT_ADDRESS_BOOK -> addressBookOperations.editBooks();
                case DELETE_ADDRESS_BOOK -> addressBookOperations.deleteBook();
                case PRINT_ADDRESS_BOOK -> addressBookOperations.printBooks();
                case EXIT -> loop = false;
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}