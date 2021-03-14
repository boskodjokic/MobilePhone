import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.addContact("Phone","065222555" );
        mobilePhone.addContact("Phone2","064555221" );
        mobilePhone.addContact("Phone3","066221548" );
        mobilePhone.addContact("Phone4","066223658" );


        System.out.println("Options");
        printOptions();
        
        
        do {
            int option = s.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Insert name and number:");
                    s.nextLine();
                    String name = s.nextLine();

                    String num = s.nextLine();

                    mobilePhone.addContact(name, num);

                    break;
                case 2:
                    System.out.println("Insert name:");
                    s.nextLine();
                    String nameD = s.nextLine();
                    mobilePhone.deleteContact(nameD);
                    break;
                case 3:
                    System.out.println("Name or number:");
                    String choice = s.nextLine().toLowerCase();
                    if (choice.equals("name")) {
                        System.out.println("Enter name for modifying: ");
                        String oldName = s.nextLine();
                        System.out.println("Enter new name: ");
                        String newName = s.nextLine();
                        mobilePhone.modifyContact(oldName, newName);
                    }
                    else {
                        System.out.println("Enter name for modifying: ");
                        String oldName = s.nextLine();
                        System.out.println("Enter new number: ");
                        String newNumber = s.nextLine();
                        mobilePhone.modifyContact1(oldName, newNumber);

                    }
                    break;
                case 4:
                        mobilePhone.printContacts();
                    break;

                case 5:
                    printOptions();
                    break;

                case 6:
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }

        } while (true);



    }

    public static void printOptions () {
        System.out.println("1. Add\r");
        System.out.println("2. Delete\r");
        System.out.println("3. Modify\r");
        System.out.println("4. Print\r");
        System.out.println("5. Print Options\r");
        System.out.println("6. Exit\r");
    }
}
