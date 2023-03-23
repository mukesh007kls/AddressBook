import java.util.Scanner;

public class Address extends Contact {
    private String address;
    private String city;
    private String state;
    private int pinCode;

    public Address(){

    }


    public Address(String firstName, String lastName, long phoneNumber, String eMail, String address, String city, String state, int pinCode) {
        super(firstName, lastName, phoneNumber, eMail);
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    public Address getPersonDetails(){
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

        System.out.println("Enter PinCode:");
        address1.setPinCode(sc1.nextInt());

        Address address2 = new Address(address1.getFirstName(), address1.getLastName(), address1.getPhoneNumber(),
                address1.geteMail(), address1.getAddress(), address1.getCity(), address1.getCity(),
                address1.getPinCode());
        return address2;
    }
    @Override
    public String toString(){
        return("Name:"+getFirstName()+" "+getLastName()+
                "\nPhoneNumber:"+getPhoneNumber()+"\nEmailID:"+geteMail()+
                "\nAddress:"+address+"\nCity:"+city+"\nState:"+state+"\nPinCode:"+pinCode);
    }
}
