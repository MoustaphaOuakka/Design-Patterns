import java.util.Comparator;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Person(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "- " + id +
                " | " + firstName +
                " | " + lastName +
                " | " + age;
    }

    /*
     * Comparator for sorting persons by id
     */
    public static Comparator<Person> ComparatorId = new Comparator<Person>() {

        @Override
        public int compare(Person e1, Person e2) {
            return (int) (e1.getId() - e2.getId());
        }
    };

    /*
     * Comparator for sorting persons by firstName
     */
    public static Comparator<Person> ComparatorFirstName = new Comparator<Person>() {

        @Override
        public int compare(Person e1, Person e2) {
            return e1.getFirstName().compareTo(e2.getFirstName());
        }
    };

    /*
     * Comparator for sorting persons by lastName
     */
    public static Comparator<Person> ComparatorLastName = new Comparator<Person>() {

        @Override
        public int compare(Person e1, Person e2) {
            return e1.getLastName().compareTo(e2.getLastName());
        }
    };

    /*
     * Comparator for sorting persons by age
     */
    public static Comparator<Person> ComparatorAge = new Comparator<Person>() {

        @Override
        public int compare(Person e1, Person e2) {
            return (int) (e1.getAge() - e2.getAge());
        }
    };

}
