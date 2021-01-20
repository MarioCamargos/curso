
package usandoforeach;

public class UsandoForEach {

    public static void main(String[] args) {
        int[] vet=new int[10];
        
        for(int i=0; i<10; i++)
            vet[i]=i;
        
        for(int temp : vet)
            System.out.println(temp);
    }
    
}
