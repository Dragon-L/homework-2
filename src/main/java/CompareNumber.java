
public class CompareNumber {
    public String compareNum(String one, String two) {
        int numofa = 0,numofb = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(one.charAt(i)==two.charAt(j)&&i==j){
                    numofa++;
                }
                else if (one.charAt(i)==two.charAt(j)&&i!=j){
                    numofb++;
                }
            }
        }
        String result = numofa+"A"+numofb+"B";
        return result;
    }
}