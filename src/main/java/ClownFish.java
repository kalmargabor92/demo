import java.util.List;

public class ClownFish extends Fish {

    private final List<String> COLOR_OF_STRIPES = List.of("white", "black", "orange");

    @Override
    void feed() {
        this.setColor(this.getColor() + " " + Utils.getRandomElement(this.COLOR_OF_STRIPES));
        this.setWeight(this.getWeight() + 1);
    }

    @Override
    FishType getType() {
        return FishType.CLOWN;
    }
}
