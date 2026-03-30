import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

class PhoneBook {
    String name;
    String phone;
    PhoneBook(String name, String phone){
        this.phone=phone;
        this.name=name;
    }
    public String toString(){
        return name + " : " + phone;
    }
}
public class PhoneBookMain{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<PhoneBook> contact_list = new ArrayList<>();
        TreeMap<String,PhoneBook> contact_tree_map = new TreeMap<>();
        HashMap<String, PhoneBook> contact_hash_map = new HashMap<>();
        int ch;

        do {
            System.out.println("Enter your option:\n" +
                    "1. Add Contact\n" +
                    "2. Search Contact by Name or Number\n" +
                    "3. List all Contact\n" +
                    "4. Exit ");
            ch = s.nextInt();
            s.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Enter Name");
                    String name = s.nextLine();
                    System.out.println("Enter Phone Number");
                    String phone = s.nextLine();
                    PhoneBook contact = new PhoneBook(name,phone);
                    contact_list.add(contact);
                    contact_tree_map.put(name, contact);
                    contact_hash_map.put(phone,contact);
                    System.out.println("Contact Added ");
                    break;
                case 2:
                    System.out.print("Enter Name or Phone: ");
                    String key = s.nextLine();
                    if(contact_tree_map.containsKey(key)){
                        System.out.println(contact_tree_map.get(key));
                    } else if (contact_hash_map.containsKey(key)) {
                        System.out.println(contact_hash_map.get(key));

                    }
                    else {
                        System.out.println("Contact Not Found ");
                    }
                    break;
                case 3:
                    System.out.println("All Contacts: ");
                    for (PhoneBook c:contact_tree_map.values()){
                        System.out.println(c);
                    }break;
                case 4:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Invalid option ");
                    break;


            }
        }while (ch !=4);
    }

}
