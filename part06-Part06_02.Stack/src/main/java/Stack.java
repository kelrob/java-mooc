import java.util.ArrayList;

public class Stack {
    ArrayList<String> stack = new ArrayList<String>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String value) {
        stack.add(0, value);
    }

    public ArrayList<String> values() {
        return stack;
    }

    public String take() {
        String result = stack.get(0);
        stack.remove(0);

        return result;
    }
}
