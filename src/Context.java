import java.util.ArrayList;

public class Context {

    private sortInterface sortType = new defaultSort(); //Affecter une strategy par defaut

    public void applySort(ArrayList<Person> person){
        sortType.sort(person);
    }

    public void setSort(sortInterface sortType) {
        this.sortType = sortType;
    }
}
