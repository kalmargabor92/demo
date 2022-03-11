public class Main {

    public static void main(String[] args) {
        var aquarium = new Aquarium();

        for (int i = 0; i < 10; i++) {
            aquarium.addFish();
        }

        aquarium.getStatus();

        for (int i = 0; i < 6; i++) {
            aquarium.feed();
        }

        aquarium.getStatus();
        aquarium.removeFish();
        aquarium.getStatus();
    }

}
