import java.util.ArrayList;
import java.util.Collections;

public class defaultSort implements sortInterface {

    @Override
    public ArrayList<Person> sort(ArrayList<Person> person) {

        Collections.sort(person, Person.ComparatorId);

        System.out.println("Ordered list of persons by id:");
        for(Person e:person)
            System.out.println(e);

        return person;
    }
}
