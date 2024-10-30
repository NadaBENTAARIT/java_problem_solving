// ****************** somme des elements
/*import java.util.*;
import java.lang.*;
import java.io.*;

class Main { 
   
    public static void main(String[] args) {
        int[] tab={6,7,9,8};
        int somme=0;
for(int i=0;i<tab.length-1;i++)   
    {
    somme=somme+tab[i];
    }
    System.out.println("La somme des elements? " + somme);
    }
}
*/








//***************** */ tri croissant ( à bulles, par selection, par insertion)
// a bulle (comparer pair par pair)
/*import java.util.*;
import java.lang.*;
import java.io.*;

class Main { 
   
    public static void main(String[] args) {
        int[] tab = {6, 7, 9, 8, 5, 4, 12};
        int aux;
        boolean tri = true;
  
        while(tri) {
            tri = false;  // On suppose que le tableau est trié

            for(int i = 0; i < tab.length - 1; i++) {  // Correction ici
                if(tab[i] > tab[i + 1]) {  // Échanger les éléments si nécessaire
                    aux = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = aux;
                    tri = true;  // On détecte que le tableau n'était pas trié
                }
            }
        }

        // Afficher le tableau trié
        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}*/



