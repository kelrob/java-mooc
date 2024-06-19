import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList<String>();
    }

    public void add(String task) {
        todos.add(task);
    }

    public void print() {
        int taskNumber = 1;
        for (String todo : this.todos) {
            System.out.println(taskNumber + ": " + todo);
            taskNumber++;
        }
    }

    public void remove(int number) {
        for (int i = 1; i <= this.todos.size(); i++) {
            if (i == number) {
                this.todos.remove(number - 1);
            }
        }
    }
}
