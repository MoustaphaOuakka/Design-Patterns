import java.util.ArrayList;
import java.util.Collections;

public class sortAge implements sortInterface {

    @Override
    public ArrayList<Person> sort(ArrayList<Person> person) {

        Collections.sort(person, Person.ComparatorAge);

        System.out.println("Ordered list of persons by Age:");
        for(Person e:person)
            System.out.println(e);

        return person;
    }
}
