import java.util.ArrayList;

public class SimpleCollection {

    private final String name;
    private final ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String string = "";
        if (this.elements.isEmpty()) {
            string = "The collection " + this.name + " is empty.";
        } else {
            if (this.elements.size() == 1) {
                string += "The collection " + this.name + " has " + this.elements.size() + " element:\n";
            } else {
                string += "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
            }

            for (int i = 0; i < this.elements.size(); i++) {
                if (i + 1 == this.elements.size()) {
                    string += this.elements.get(i);
                } else {
                    string += this.elements.get(i) + "\n";
                }

            }
        }

        return string;
    }

}
