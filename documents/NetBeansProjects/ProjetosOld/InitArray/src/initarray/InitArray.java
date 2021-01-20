
package initarray;

public class InitArray {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array=new int[ARRAY_LENGTH];
        
        for(int i=0; i<ARRAY_LENGTH; i++)
            array[i]=2+2*i;
        
        for(int i=0; i<ARRAY_LENGTH; i++)
            System.out.println(array[i]);
    }
    
}
