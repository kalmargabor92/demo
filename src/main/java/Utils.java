import java.util.List;
import java.util.Random;

public class Utils {

    public static String getRandomElement(List<String> stringList) {
        return stringList.get(new Random().nextInt(stringList.size()));
    }

}
