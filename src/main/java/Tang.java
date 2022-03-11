import java.util.Random;

public class Tang extends Fish {

    @Override
    void feed() {
        this.setWeight(this.getWeight() + 1);

        if (!this.isMemory()) {
            int randomSuffer = new Random().nextInt(2) + 1;
            if (randomSuffer == 1) {
                this.setMemory(true);
            }
        }
    }

    @Override
    FishType getType() {
        return FishType.TANG;
    }

}
