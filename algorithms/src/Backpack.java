import java.util.Arrays;
import java.util.Comparator;

public class Backpack {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 50);
        final Item item3 = new Item(2, 15);

        final Item[] items = {item1, item2, item3};
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));

        final int W=7;

        int weightSoFar = 0;
        double valueSoFar = 0;
        int currentItem = 0;

        while(currentItem<items.length && weightSoFar!=W){
            //full
            if(weightSoFar+items[currentItem].getWeight()<W){
                valueSoFar+=items[currentItem].getValue();
                weightSoFar+=items[currentItem].getWeight();
                System.out.println("valueSoFar " + valueSoFar +", " + "weightSoFar " + weightSoFar);
            }else {
                //part
                valueSoFar+=((W-weightSoFar)/(double)items[currentItem].getWeight())
                        *items[currentItem].getValue();
                weightSoFar=W;
                System.out.println("valueSoFar " + valueSoFar +", " + "weightSoFar " + weightSoFar);
            }
            currentItem++;
        }
        System.out.println("The best value: " +valueSoFar);
    }
}

class Item {
    private int weight;
    private int value;

    public double valuePerUnitOfWeight() {
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}
