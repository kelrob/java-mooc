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

    public String longest() {

        if (this.elements.size() == 0) {
            return null;
        }

        String longestString = this.elements.get(0);

        for (String e : this.elements) {
            if (longestString.length() < e.length()) {
                longestString = e;
            }
        }

        return longestString;
    }
}
