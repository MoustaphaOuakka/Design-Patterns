import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Person> person = new ArrayList<>();

        person.add(new Person(1, "Moustapha", "Ouakka",23));
        person.add(new Person(2, "Kaouthar", "Slaoui",25));
        person.add(new Person(3, "Karim", "Zyani",16));
        person.add(new Person(4, "Anas", "Hafidi",30));
        person.add(new Person(5, "Hanae", "Mrani",12));
        person.add(new Person(6, "Nisrin", "Salmi",45));
        person.add(new Person(7, "Amine", "Hidran",24));
        person.add(new Person(8, "Youssef", "Touzani",34));

        Context context = new Context();
        context.applySort(person);


        while (true){
            System.out.print("Entrer quelle methode de triation doit utilisé : \n" +
                    "\t -defaultSort   : sort with id \n" +
                    "\t -sortFirstName : sort with first name \n" +
                    "\t -sortLastName  : sort with last name \n" +
                    "\t -sortAge       : sort with age \n" +
                    "=> ");
            Scanner scanner = new Scanner(System.in);
            sortInterface sortInterface =(sortInterface) Class.forName(scanner.nextLine()).newInstance();
            context.setSort(sortInterface);
            context.applySort(person);
        }

    }
}
