import java.util.ArrayList;

public class Hold {

    private final int maximumWeight;
    private final ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }


    @Override
    public String toString() {
        int weight = 0;
        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }

//        if (suitcases.size() == 0) {
//            return "no items (0 kg)";
//        }
//
//        if (items.size() == 1) {
//            return this.items.size() + " item (" + weight + " kg)";
//        }


        return this.suitcases.size() + " suitcases (" + weight + " kg)";
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeightSize = 0;

        if (!suitcases.isEmpty()) {
            for (Suitcase suitcase1 : suitcases) {
                currentWeightSize += suitcase1.totalWeight();
            }
        }

        if (currentWeightSize + suitcase.totalWeight() <= maximumWeight) {
            suitcases.add(suitcase);
        }

    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
