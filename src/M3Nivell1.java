import java.util.*;

public class M3Nivell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// FASE 1 --------------------------------------------------------------		
		 System.out.println(" --------- FASE 1 -----------------");	
		
		Scanner scanner = new Scanner (System.in);
		
		 System.out.print("Introdueix el nom de la ciutat 1: " );
		 String ciutat1 = scanner.nextLine();
		
		 System.out.print("Introdueix el nom de la ciutat 2 " );
		 String ciutat2 = scanner.nextLine();
		 
		 System.out.print("Introdueix el nom de la ciutat 3: " );
		 String ciutat3 = scanner.nextLine();
		
		 System.out.print("Introdueix el nom de la ciutat 4 " );
		 String ciutat4 = scanner.nextLine();
		 
		 System.out.print("Introdueix el nom de la ciutat 5: " );
		 String ciutat5 = scanner.nextLine();
		
		 System.out.print("Introdueix el nom de la ciutat 6 " );
		 String ciutat6 = scanner.nextLine();
	

// FASE 2 --------------------------------------------------------------	
		 
		 System.out.println("--------- FASE 2 -----------------");	
		 String arrayCiutats [] = {ciutat1, ciutat2, ciutat3,ciutat4,ciutat5, ciutat6};

		 Arrays.sort(arrayCiutats);

		 System.out.println("Ciutats ordenades por ordre alfabètic");

		 for (int i=0; i<arrayCiutats.length; i++) {
			 System.out.println(arrayCiutats[i]);
		 } 
	
// FASE 3 ------------------------------------------------------------
		 
		 System.out.println("--------- FASE 3 -----------------");	
		 System.out.println("Ciutats modificades por ordre alfabètic canviant 'a' per '4'");	
	
	for (int j=0; j<arrayCiutats.length; j++) {
		String arrayCiutatsModificades = arrayCiutats[j].replace("a","4");	
		System.out.println(arrayCiutatsModificades);
	}


// FASE 4 ------------------------------------------------------------
	
	 System.out.println("--------- FASE 4 -----------------");	
	 
	 Character arrayCiutat1 [] = new Character [ciutat1.length()];
	 Character arrayCiutat2 [] = new Character [ciutat2.length()];
	 Character arrayCiutat3 [] = new Character [ciutat3.length()];
	 Character arrayCiutat4 [] = new Character [ciutat4.length()];
	 Character arrayCiutat5 [] = new Character [ciutat5.length()];
	 Character arrayCiutat6 [] = new Character [ciutat6.length()]; 	 

	 
	 //for (int a =0; a < arrayCiutats.length; a++){  
	 
	 
	 for (int b=0; b < arrayCiutat1.length; b++) {
		 	arrayCiutat1[b] = ciutat1.charAt(b);    // guarda els CHAR a ciutat1
	 }
	 for (int h=ciutat1.length()-1; h>=0; h--) {
		 System.out.print(arrayCiutat1[h]); 		// imprimeix la ciutat1 al reves
	 }
	 System.out.println("");
	 
	 for (int c=0; c < arrayCiutat2.length; c++) {
		 	arrayCiutat2[c] = ciutat2.charAt(c);   // guarda els CHAR a ciutat2
	 }
	 for (int i=ciutat2.length()-1; i>=0; i--) {
		 System.out.print(arrayCiutat2[i]); 		// imprimeix la ciutat2 al reves
	 }
	 System.out.println("");
	 
	 for (int d=0; d < arrayCiutat3.length; d++) {
		 	arrayCiutat3[d] = ciutat3.charAt(d);   // guarda els CHAR a ciutat3
	 }
	 for (int j=ciutat3.length()-1; j>=0; j--) {
		 System.out.print(arrayCiutat3[j]); 		// imprimeix la ciutat3 al reves
	 }
	 System.out.println("");
	 
	 for (int e=0; e < arrayCiutat4.length; e++) {
		 	arrayCiutat4[e] = ciutat4.charAt(e);   // guarda els CHAR a ciutat4
	 }
	 for (int j=ciutat4.length()-1; j>=0; j--) {
		 System.out.print(arrayCiutat4[j]); 		// imprimeix la ciutat4 al reves
	 }
	 System.out.println("");
	 
	 for (int f=0; f < arrayCiutat5.length;f++) {
		 	arrayCiutat5[f] = ciutat5.charAt(f);   // guarda els CHAR a ciutat5
	 }
	 for (int j=ciutat5.length()-1; j>=0; j--) {
		 System.out.print(arrayCiutat5[j]); 		// imprimeix la ciutat5 al reves
	 }
	 System.out.println("");		 
	 
	 for (int g=0; g < arrayCiutat6.length; g++) {
		 	arrayCiutat6[g] = ciutat6.charAt(g);   // guarda els CHAR a ciutat6
	 }
	 for (int j=ciutat6.length()-1; j>=0; j--) {
		 System.out.print(arrayCiutat6[j]); 		// imprimeix la ciutat6 al reves
	 }
	 		  
}
} 


	 
