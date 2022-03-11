import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aquarium {

    private List<Fish> fishList = new ArrayList<>();

    public void addFish() {
        this.fishList.add(getRandomFish());
    }

    public void feed() {
        for (Fish fish : fishList) {
            fish.feed();
        }
    }

    public void removeFish() {
        List<Fish> tempList = new ArrayList<>(fishList);
        for (Fish fish : fishList) {
            if (fish.getWeight() >= 11) {
                tempList.remove(fish);
            }
        }
        this.fishList = tempList;
    }

    public void getStatus() {
        System.out.println();
        for (Fish fish : fishList) {
            fish.status();
        }
    }

    private Fish getRandomFish() {
        var randomFishType = new Random().nextInt(3) + 1;
        return switch (randomFishType) {
            case 1 -> new ClownFish();
            case 2 -> new Tang();
            case 3 -> new Kong();
            default -> new ClownFish();
        };
    }

}
