package AddressbookProgram;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class AddressBook {
	
	public static Scanner sc = new Scanner(System.in);
    //contact of person stored in arraylist
    public ArrayList<Person> contactList = new ArrayList<>();

    public void addContactDetails(){
        System.out.println("Enter the Details of ContactDetails  person");
        System.out.println("Enter the first name");
        String firstName = sc.next();
        System.out.println("Enter the Last name");
        String lastName = sc.next();
        System.out.println("Enter the Address");
        String address = sc.next();
        System.out.println("Enter the City");
        String city = sc.next();
        System.out.println("Enter the State");
        String state = sc.next();
        System.out.println("Enter the email");
        String email = sc.next();
        System.out.println("Enter the ZipCode");
        String zip = sc.next();
        System.out.println("Enter the contact number...");
        String phoneNumber = sc.next();
        //passing the value in constructor
       Person contactofPerson = new Person(firstName, lastName, address, city, state, email, phoneNumber, zip);
        contactList.add(contactofPerson);

    }

    public boolean editContactDetails(String Name) {
        int flag = 0;
        for(Person contact: contactList)
        {
            if(contact.getFirstName().equals(Name))		//used equal to method for check name
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Address: ");
                String address = sc.next();
                contact.setAddress(address);
                System.out.println("Enter City: ");
                String city = sc.next();
                contact.setCity(city);
                System.out.println("Enter State: ");
                String state = sc.next();
                contact.setState(state);
                System.out.println("Enter Email: ");
                String email = sc.next();
                contact.setEmail(email);
                System.out.println("Enter Phone Number:");
                String phoneNumber = sc.next();
                contact.setPhoneNumber(phoneNumber);
                System.out.println("Enter Zip Code: ");
                String zip = sc.next();
                contact.setZip(zip);
                flag = 1;
            }
        }
        return flag == 1;
    }
    public boolean deleteContact(String name) {
        int flag = 0;
        for(Person contact: contactList)
        {
            if(contact.getFirstName().equals(name))
            {
                contactList.remove(contact);
                flag = 1;
                break;
            }
        }
        return flag == 1;
    }
    
    public boolean checkDuplicate(String fname)
    {
        int flag=0;
        for (Person p: contactList)
        {
            if (p.getFirstName().equals(fname))
            {
                flag=1;
                break;
            }
        }
        return flag == 1;
    }
    
 // used java stream
    public void getPersonNameByState(String State) {
        List<Person> list = contactList.stream().filter(contactName -> contactName.getState().equals(State))
                .collect(Collectors.toList());
        for (Person contact : list) {
            System.out.println("First Name: " + contact.getFirstName());
            System.out.println("Last Name: " + contact.getLastName());
        }

    }

    public void getPersonNameByCity(String cityName) {
        List<Person> list = contactList.stream().filter(contactName -> contactName.getCity().equals(cityName))
                .collect(Collectors.toList());
        for (Person contact : list) {
            System.out.println("First Name: " + contact.getFirstName());
            System.out.println("Last Name: " + contact.getLastName());
        }
    }
}
