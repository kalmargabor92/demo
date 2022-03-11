public class Kong extends Fish{

    @Override
    void feed() {
        this.setWeight(this.getWeight() + 2);
    }

    @Override
    FishType getType() {
        return FishType.KONG;
    }

}
