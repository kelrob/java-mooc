import java.util.ArrayList;

public class Suitcase {
    private final ArrayList<Item> items;
    private final int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<Item>();
    }

    @Override
    public String toString() {
        int weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }

        if (items.size() == 0) {
            return "no items (0 kg)";
        }

        if (items.size() == 1) {
            return this.items.size() + " item (" + weight + " kg)";
        }


        return this.items.size() + " items (" + weight + " kg)";
    }

    public void addItem(Item item) {
        int currentWeightSize = 0;

        if (!items.isEmpty()) {
            for (Item item1 : items) {
                currentWeightSize += item1.getWeight();
            }
        }

        if (currentWeightSize + item.getWeight() <= maximumWeight) {
            items.add(item);
        }

    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }

        return weight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);
        for (Item item : this.items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }
}
