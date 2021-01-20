package arraymanipulation;

import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        double[] doubleArray={8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.println("______________________");
        for(double a : doubleArray)
            System.out.println(a+"\n");
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");
        
        int[] intArray={1,2,3,4,5};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");
        
        boolean b=Arrays.equals(intArray, intArrayCopy);
        System.out.println("São iguais? "+b);
        
        b=Arrays.equals(intArray, filledIntArray);
        System.out.println("São iguais? "+b);
        
        int location = Arrays.binarySearch(intArray, 5);
        if(location>=0)
            System.out.println("Encontrado no elemento: "+location);
        else
            System.out.println("Não encontrado o elemento 5.");
        location=Arrays.binarySearch(intArray, 8763);
        if(location>=0)
            System.out.println("Encontrado no elemento "+location);
        else
            System.out.println("8763 não enconrado");
        
        
    }

    private static void displayArray(int[] array, String description) {
        System.out.println("Dexciprion");
        for(int value : array)
            System.out.println(value);
    }
    
}
