import java.util.HashSet;
import java.util.Random;

public class GenerateNumber {
    public String generateNum() {
        Random random = new Random();
        HashSet<Integer> num = new HashSet<Integer>();
        while (num.size()<4){
            num.add(random.nextInt(10));
        }
        String generator = "";
        for(int x:num){
            generator += x;
        }
        return generator;
    }
}
