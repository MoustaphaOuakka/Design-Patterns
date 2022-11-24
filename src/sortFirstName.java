import java.util.ArrayList;
import java.util.Collections;

public class sortFirstName implements sortInterface {

    @Override
    public ArrayList<Person> sort(ArrayList<Person> person) {

        Collections.sort(person, Person.ComparatorFirstName);

        System.out.println("Ordered list of persons by First Name:");
        for(Person e:person)
            System.out.println(e);

        return person;
    }
}
