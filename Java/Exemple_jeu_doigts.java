import java.util.Scanner;

public class ExempleJeuDeDoigts{

	public static void main(String[] args) {
		
		// jeux test avec les doigts
		// import du scanner
		Scanner sc = new Scanner(System.in);

		int nbrA;
		int nbrB;
		int reste;
		String reponse;
		
		
		// Debut de la partie
		do
		{
		//Les joueurs A et B vont choisir un chiffre entre 0 et 5, si la sommes est paire: Joueur A Gagne ; Si impaire: Joueur B Gagne
		System.out.println("Les joueurs A et B choisiront un chiffre entre 0 et 5. Si, le r�sultat est paire, Joueur A Gagne, sinon jouer B ");
		
		//joueur A commence
		System.out.println("Commen�ons! Joueur A, entrez un chiffre entre 0 et 5 s'il vous plait."); 

		//Lire choix du joueur A
		nbrA = sc.nextInt();
		
		// �crire "A vous joueur B, entrez un chiffre entre 0 et 5 s'il vous plait."
		System.out.println("A vous joueur B, entrez un chiffre entre 0 et 5 s'il vous plait.");
		// Lire choix du joueur B
		nbrB = sc.nextInt();
		
		reste = ((nbrA + nbrB) % 2);
		
		if (reste == (0)) 
		{
			System.out.println("Bravo au joueur A, vous avez gagner!");
		}
		else 
		{
			System.out.println("Bravo joueur B, vous avez gagner!");
		}
		// Voulez-vous rejouer?
		System.out.println("Voulez-vous rejouer ? o/n");
		reponse=sc.next();
		}
		while (!reponse.equals("non"));
		sc.close();	

	}

}
