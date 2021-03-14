import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contacts = new ArrayList <Contacts>();

    private int contactExists(String name) {
        for (int i = 0; i<contacts.size(); i++ ) {
            if (name.equals(contacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public void addContact(String name, String number) {
        if (contactExists(name) >= 0) {
            System.out.println("Contact already exists.");
        } else {
            contacts.add(new Contacts(name, number));
        }
    }

    public void deleteContact(String name) {
        if (contactExists(name) >= 0) {
            int indexForDelete = contactExists(name);
            this.contacts.remove(indexForDelete);
        }
        else {
            System.out.println("Contact doesn't exist");
        }
    }

    public void modifyContact(String name, String name1) {
        if (contactExists(name)>= 0) {
            contacts.get(contactExists(name)).setName(name1);
        }
        else {
            System.out.println("Contact doesn't exist");
        }
    }

    public void modifyContact1(String name, String number1) {
        if (contactExists(name)>= 0) {
            contacts.get(contactExists(name)).setName(number1);
        }
        else {
            System.out.println("Contact doesn't exist");
        }
    }
    public void printContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("Name: " + contacts.get(i).getName() + " , number " + contacts.get(i).getContactNumber());
        }
    }

}
