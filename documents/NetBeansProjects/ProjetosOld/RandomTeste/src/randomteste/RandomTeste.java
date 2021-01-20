
package randomteste;

import java.util.Random;

public class RandomTeste {

    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] frequency = new int[7];
        
        for(int roll=1; roll <= 6000; roll++)
            ++frequency[1 + randomNumbers.nextInt(6)];
        
        for(int face = 1; face<frequency.length; face++)
            System.out.println(face+"  "+frequency[face]);
    }
    
}
