import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookOperations {
    final List<Address> addressList = new ArrayList<>();

    public void readDetails() {
        boolean addContact = true;
        while (addContact) {
            Address address1 = new Address();
            Scanner sc1 = new Scanner(System.in);

            System.out.println("Enter contact detail:");
            System.out.println("Enter First Name:");
            address1.setFirstName(sc1.nextLine());

            System.out.println("Enter Last Name:");
            address1.setLastName(sc1.nextLine());

            System.out.println("Enter Phone Number:");
            address1.setPhoneNumber(sc1.nextLong());

            sc1.nextLine();
            System.out.println("Enter EmailID:");
            address1.seteMail(sc1.nextLine());

            System.out.println("Enter Address");
            address1.setAddress(sc1.nextLine());

            System.out.println("Enter City:");
            address1.setCity(sc1.nextLine());

            System.out.println("Enter State:");
            address1.setState(sc1.nextLine());

            System.out.println("Enter Pincode:");
            address1.setPinCode(sc1.nextInt());

            Address address2 = new Address(address1.getFirstName(), address1.getLastName(), address1.getPhoneNumber(),
                    address1.geteMail(), address1.getAddress(), address1.getCity(), address1.getCity(),
                    address1.getPinCode());
            addressList.add(address2);
            System.out.println("If you want add another contact enter add or else enter exit:-");
            String choice = sc1.next();
            if (choice.equalsIgnoreCase("add")) {
                addContact = true;
            } else {
                addContact = false;
            }
        }
    }

    public void printDetails() {
        for (Address x : addressList) {
            System.out.println("Details for Person");
            System.out.println("Name:-" + x.getFirstName() + " " + x.getLastName());
            System.out.println("Phone Number:-" + x.getPhoneNumber());
            System.out.println("EMail:-" + x.geteMail());
            System.out.println("Address:-" + x.getAddress());
            System.out.println("City:-" + x.getCity());
            System.out.println("State:-" + x.getState());
            System.out.println("PinCode:-" + x.getPinCode());
            System.out.println("");
        }
    }
}
