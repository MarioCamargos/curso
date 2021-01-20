package inserindostring;

import java.util.Scanner;

public class InserindoString {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.println("Digte o nome do curso que deseja participar:");
        String curso=s.nextLine();
        System.out.println("Digite o nome do curso secundário:");
        String curso2=s.next();
        
        System.out.println("Os cursos são: "+curso+" e "+curso2);
        
        
    }
    
}
