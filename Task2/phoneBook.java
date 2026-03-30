import java.util.*;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }

    @Override
    public String toString() {
        return name + " " + phoneNumber;
    }
}


public class phoneBook {

    private ArrayList<Contact> contacts = new ArrayList<>();
    private HashMap<String, Contact> phoneNumberMap = new HashMap<>();
    private TreeMap<String, ArrayList<Contact>> nameMap = new TreeMap<>();

    private Scanner sc = new Scanner(System.in);


    public void searchByName() {
        System.out.print("Enter name: ");
        String search = sc.nextLine().toLowerCase();

        boolean found = false;

        for (Contact c : contacts) {
            if (c.getName().toLowerCase().contains(search)) {
                System.out.println(c);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }


    public void searchByNumber() {
        System.out.print("Enter number: ");
        String num = sc.nextLine();

        Contact c = phoneNumberMap.get(num);

        if (c != null) {
            System.out.println(c);
        } else {
            System.out.println("Not found");
        }
    }


    public void listAllSorted() {
        System.out.println("\nSorted Contacts:");

        for (ArrayList<Contact> list : nameMap.values()) {
            for (Contact c : list) {
                System.out.println(c);
            }
        }
    }

  
    public void run() {
        while (true) {
            System.out.println("\n1. Search by Name");
            System.out.println("2. Search by Number");
            System.out.println("3. List All Sorted");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            String ch = sc.nextLine();

            switch (ch) {
                case "1": searchByName(); break;
                case "2": searchByNumber(); break;
                case "3": listAllSorted(); break;
                case "4": return;
                default: System.out.println("Invalid");
            }
        }
    }

    public static void main(String[] args) {
        phoneBook app = new phoneBook();

        // Sample data
        Contact c1 = new Contact("Suvra", "1345345311");
        Contact c2 = new Contact("Naba", "2123131212");
        Contact c3 = new Contact("Upakul", "5775757577");
        Contact c4 = new Contact("Sahil", "3243232433");
        Contact c5 = new Contact("Ijaz", "4242342424");

        app.contacts.add(c1);
        app.contacts.add(c2);
        app.contacts.add(c3);
        app.contacts.add(c4);
        app.contacts.add(c5);

        for (Contact c : app.contacts) {
            app.phoneNumberMap.put(c.getPhoneNumber(), c);

            app.nameMap.putIfAbsent(c.getName().toLowerCase(), new ArrayList<>());
            app.nameMap.get(c.getName().toLowerCase()).add(c);
        }

        app.run();
    }
}