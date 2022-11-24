import java.util.ArrayList;
import java.util.Collections;

public class sortLastName implements sortInterface {

    @Override
    public ArrayList<Person> sort(ArrayList<Person> person) {

        Collections.sort(person, Person.ComparatorLastName);

        System.out.println("Ordered list of persons by Last Name:");
        for(Person e:person)
            System.out.println(e);

        return person;
    }
}
