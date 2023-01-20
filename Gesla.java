import java.util.Random;
import java.util.Scanner;
public class Gesla {
    public static void main (String[]args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Vnestie prvotno geslo.");
        String og = sc.nextLine();
        char[] crke = new char[og.length()+1];

        for (int i = 0; i<og.length(); i++){
            crke[i] = og.charAt(i);
        }

        for (int j=0; j<og.length();j++){
            char[] zac = new char[og.length()+1];

            for(int k=0; k<og.length();k++){
                zac[k]=crke[k];
            }


            if(Character.isLetter(crke[j])){

                zac[j] = Character.toUpperCase(crke[j]);
                
                
            }
            else{
                continue;
            }
            
            
            
            for (int i = 0; i<og.length()+1; i++){
                StringBuffer zacasno = new StringBuffer();
                zacasno.append(zac);
                //System.out.println(zacasno);
                int k = og.length()-i;
                zacasno.insert(i, ".");
                System.out.println(zacasno); 
            }
        }

        
    }
    
}
