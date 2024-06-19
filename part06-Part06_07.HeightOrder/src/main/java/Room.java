import java.util.ArrayList;

public class Room {

    ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<Person>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.size() == 0;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.persons.get(0);
        for (Person person : this.persons) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.shortest();
        this.persons.remove(this.shortest());
        return shortestPerson;
    }
}
