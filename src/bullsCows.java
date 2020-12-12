import java.util.Arrays;

public class bullsCows {
    public String getHint(String secret, String guess) {
        //bulls which are number is correct
        //cows which are number is correct but in wrong location
        int bulls = 0;
        int cows = 0;

        int len = secret.length();
        //0-9
        int[] sec = new int[10];
        int[] gue = new int[10];

        for(int i=0;i<len;i++){
            int a = secret.charAt(i) - '0';
            int b = guess.charAt(i) - '0';

            if(a == b){
                bulls ++;
            }else{
                sec[secret.charAt(i) - '0'] ++;
                gue[guess.charAt(i) - '0'] ++;
            }
        }

        System.out.println(Arrays.toString(sec) + ',' + Arrays.toString(gue));
        for(int i=0;i<10;i++){
            cows += Math.min(sec[i], gue[i]);
        }

        return String.valueOf(bulls) + "A" + String.valueOf(cows) + "B";
    }
}
