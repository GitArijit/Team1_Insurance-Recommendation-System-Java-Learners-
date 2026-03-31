import java.util.*;

class Phonebook{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

            // used three collection types - Arraylist, Hashmap and Treeset


            ArrayList<String> firstname = new ArrayList<>();
            ArrayList<Long> num = new ArrayList<>();
            ArrayList<String> lastname = new ArrayList<>();

            HashMap<String,Long> search2 = new HashMap<>();
            HashMap<Long,String> search6 = new HashMap<>();
      

            TreeSet<String> searchbysurname = new TreeSet<>();


        int choice;

        do{
        System.out.println("--------Phonebook App-------");
        System.out.println("1. Add a new contact");
        System.out.println("2. Search by name ");
        System.out.println("3. Search by number");
        System.out.println("4. List all sorted by surname");
        System.out.println("5. Exit");

        System.out.println("Enter the choice number: ");
        choice = s.nextInt();
        s.nextLine();

        if(choice==1){

        //saving the contact details- first name , last name and number in three seperate arraylists


             System.out.println("Enter first name: ");
             String savename = s.nextLine();

             System.out.println("Enter last name: ");
             String savelastname =s.nextLine();


            System.out.println("Enter number: ");
            long savenum = s.nextLong();

            //saving all the contact details
            firstname.add(savename);
            num.add(savenum);
            lastname.add(savelastname);
            

            //saving the data into hashmap for searching by name and number
            search2.put(savename, savenum);
            search6.put(savenum, savename);

            //for sorting by surname using treeset
            searchbysurname.add(savelastname); 



        System.out.println("------------Contact Added-------------");
        for(int j =0 ; j< firstname.size(); j++){
            System.out.println(firstname.get(j)+ " " +lastname.get(j)+ ":" +num.get(j));

        }
     

        }  //search by using name. logic I used is checking if the key conatins the value, if yes then get the value
            else if(choice ==2){

                System.out.println("Enter the name: ");
                String search3 = s.nextLine();

                if(search2.containsKey(search3)){
                    System.out.println("Contact number found: "+search2.get(search3));
                }else{
                    System.out.println("Name not found.");
                }
            }//search by using number. same logic
            else if(choice ==3){
                System.out.println("Enter the number: ");
                Long search4 = s.nextLong();

                if(search6.containsKey(search4)){
                    System.out.println("Name against this contact number found: " +search6.get(search4));
                 }else{
                System.out.println("No contact found for this number");
                }
            }

            //first sorted the list using treeset, then if index of lastname equals surname, show the whole contact

            else if(choice ==4){

                System.out.println("-----List of all contacts sorted by lastname----");
                for(String surname : searchbysurname){
                  for(int i =0; i< lastname.size() ; i++){
                    if(lastname.get(i).equals(surname)){
                        System.out.println(firstname.get(i)+" " +lastname.get(i)+ ":" +num.get(i));
                    }

                  }
                }
              


            }
            else if(choice==5){
                 System.out.println("Exited Successfully!!!");
                 }   
                }while(choice !=5);
    }
}

    