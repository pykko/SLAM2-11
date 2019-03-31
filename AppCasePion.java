public class AppCasePion {

	public static void main( String [] args ) {
		
		// Création de la case qui se trouve en ligne 2 et en colonne 3
		Case cs23 = new Case( 2 , 3 ) ;
		
		// Affichage de l'état de la case 2,3
		if( cs23.estOccupee() == true ){
			System.out.println( "1 - Case occupée." ) ;
		}
		else {
			System.out.println( "1 - Case libre." ) ;
		}
		// Doit afficher : 1 - Case libre.
		
		// Création du pion chat rouge qui occupe la case 2,3
		Pion pn = new Pion( 2 , "Chat" , "Rouge" , cs23 ) ;
		
		// Affichage du pion chat rouge
		if( pn.estEnJeu() == true ){
			System.out.println( "2 - Pion en jeu." ) ;
		}
		else {
			System.out.println( "2 - Pion capturé." ) ;
		}
		// Doit afficher : 2 - Pion en jeu.
		
		
		// Affichage de l'état de la case 2,3
		if( cs23.estOccupee() == true ){
			System.out.println( "3 - Case occupée." ) ;
		}
		else {
			System.out.println( "3 - Case libre." ) ;
		}
		// Doit afficher : 3 - Case occupée.
		
		
		// Affichage de la ligne de la case occupée par le chat rouge
		System.out.println( "4 - " + pn.getLaCase().getLigne() ) ;
		// Doit afficher : 4 - 2
		
		
		// Affichage du nom de l'animal qui occupe la case 2 , 3
		System.out.println( "5 - " + cs23.getLePion().getAnimal() ) ;
		// Doit afficher : 5 - Chat
		
		
		
	}
	
}
