public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBookOperations addressBookOperations=new AddressBookOperations();
        addressBookOperations.readDetails();
        addressBookOperations.printDetails();
    }
}