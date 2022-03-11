import java.util.List;
import java.util.Random;

public abstract class Fish {

    private static final List<String> COLORS = List.of("white", "black", "yellow", "orange", "red", "blue", "green", "brown");
    private static final List<String> NAMES = List.of("Beco", "Gizi", "Feri", "Marci", "Orsi", "Gyuri", "Krisz", "Gabi");

    private final String name;
    private int weight;
    private String color;
    private boolean memory;

    public Fish() {
        this.name = Utils.getRandomElement(NAMES);
        this.weight = new Random().nextInt(8) + 1;
        this.color = Utils.getRandomElement(COLORS);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMemory() {
        return memory;
    }

    public void setMemory(boolean memory) {
        this.memory = memory;
    }

    abstract void feed();

    abstract FishType getType();

    public void status() {
        System.out.printf("%s, weight: %s, color: %s, short-term memory loss: %s, type: %s\n", name, weight, color, memory, getType());
    }

}
