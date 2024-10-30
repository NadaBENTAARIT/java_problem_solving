// ********** reverse string
/*import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
       String test="bonjour";
       String res="";
        for(int i=test.length()-1;i>=0;i--)
            {
                res=res+test.charAt(i);
            }
        System.out.println(res);
    }
}*/

//**********  palindrome string
/*import java.util.*;
import java.lang.*;
import java.io.*;

class Main { 
    public static boolean test() {
        String chaine = "";
        int debut = 0;
        int fin = chaine.length() - 1;
        
        while (debut <= fin) {
            if (chaine.charAt(debut) != chaine.charAt(fin)) {
                return false;
            } else {
                debut++;
                fin--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = test();
        System.out.println("La chaîne est-elle un palindrome ? " + result);
    }
}*/



//Trouver le caractère qui apparaît le plus souvent
/*