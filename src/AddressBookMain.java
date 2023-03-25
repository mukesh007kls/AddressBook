import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    public static final int ADD_ADDRESS_BOOK = 1;
    public static final int DELETE_ADDRESS_BOOK = 2;
    private static final int EDIT_ADDRESS_BOOK = 3;
    private static final int PRINT_ADDRESS_BOOK = 4;
    private static final int SEARCH_BY_CITY_STATE=5;
    public static final int EXIT = 0;

    public static void main(String[] args) {
        HashMap<String, AddressBookOperations> address_Dictionary = new HashMap<>();
        int countOfPersonsCity=0;
        int countOfPersonsState=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        AddressBookOperations addressBookOperations = new AddressBookOperations();
        boolean loop = true;
        while (loop) {
            System.out.println("Enter the choice:-\n1.Add a new Address Book\n2.Edit Address Book\n3.Delete Address Book\n4.Print Address Books\n5.Search by city or state\n0.To exit");
            int choice = sc.nextInt();
            switch (choice) {
                case ADD_ADDRESS_BOOK -> addressBookOperations.createAddressBooks(address_Dictionary);
                case EDIT_ADDRESS_BOOK -> addressBookOperations.editBooks(address_Dictionary);
                case DELETE_ADDRESS_BOOK -> addressBookOperations.deleteBook(address_Dictionary);
                case PRINT_ADDRESS_BOOK -> addressBookOperations.printBooks(address_Dictionary);
                case SEARCH_BY_CITY_STATE -> {
                    Scanner scanner=new Scanner(System.in);
                    Map<String, List<Address>> cityHashMap=new HashMap<>();
                    Map<String, List<Address>> stateHashMap=new HashMap<>();
                    System.out.println("Enter choice of search:-\n1.City\n2.State");
                    int option= scanner.nextInt();
                    scanner.nextLine();
                    switch (option){
                        case 1-> {
                            System.out.println("Enter city name:-");
                            String city = scanner.nextLine();
                            countOfPersonsCity=addressBookOperations.searchByCity(city,address_Dictionary).size();
                            cityHashMap.put(city,addressBookOperations.searchByCity(city,address_Dictionary));
                            System.out.println("Number of persons living in "+city+" is:-"+countOfPersonsCity);
                            System.out.println(cityHashMap);
                        }
                        case 2->{
                            System.out.println("Enter State name:-");
                            String state=scanner.nextLine();
                            countOfPersonsState=addressBookOperations.searchByState(state,address_Dictionary).size();
                            stateHashMap.put(state,addressBookOperations.searchByState(state,address_Dictionary));
                            System.out.println("Number of persons living in "+state+" is:-"+countOfPersonsState);
                            System.out.println(stateHashMap);
                        }
                    }
                }
                case EXIT -> loop = false;
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}