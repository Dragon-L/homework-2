import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CompareNumber comparer = new CompareNumber();
        GenerateNumber generator = new GenerateNumber();
        String forcompare = generator.generateNum();
        String input;
        String output;

        System.out.printf("Welcome!\n\n");
        for(int i=6;i>0;i--){
            System.out.printf("Please input your number(%d):",i);
            Scanner sc =new Scanner(System.in);
            input = sc.next();
            if(isRepeat(input)){
                System.out.printf("Cannot input duplicate numbers!\n\n");
                i++;
            }
            else {
                output = comparer.compareNum(forcompare,input);
                if(output.equals("4A0B")){
                    System.out.println("Congratulations!");
                    return;
                }
                else {
                    System.out.printf("%s\n\n",output);
                }
            }
        }
        System.out.print("Game Over");
    }
    public static boolean isRepeat(String str){
        char[] num_char = str.toCharArray();
        HashSet<Character> num_set = new HashSet<Character>();
        for(char x:num_char){
            num_set.add(x);
        }
        return (num_char.length!=num_set.size());
    }
}
