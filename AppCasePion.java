public class AppCasePion {

	public static void main( String [] args ) {
		
		// Création de la case qui se trouve en ligne 2 et en colonne 3
		// notée c(2,3)
		System.out.println( "\nCRÉATION DE LA CASE c(2,3)" ) ;
		Case cs23 = new Case( 2 , 3 ) ;
		
		
		// Affichage de l'état (occupée ou libre) de la case c(2,3)
		
		if( cs23.estOccupee() == true ){
			System.out.println( "\n1 - c(2,3) est occupée." ) ;
		}
		else {
			System.out.println( "\n1 - c(2,3) est libre." ) ;
		}
			// Doit afficher : 1 - c(2,3) est libre.
		
		
		// Création du pion chat noir qui occupe la case c(2,3)
		System.out.println( "\nCRÉATION DU CHAT NOIR PLACÉ SUR LA CASE c(2,3)" ) ;
		Pion pnChatNoir = new Pion( 2 , "Chat" , "Noir" , cs23 ) ;
		
		
		// Affichage de l'état du pion chat noir
		
		if( pnChatNoir.estEnJeu() == true ){
			System.out.println( "\n2 - Le chat noir est en jeu." ) ;
		}
		else {
			System.out.println( "\n2 - Le chat noir a été capturé." ) ;
		}
			// Doit afficher : 2 - Le chat noir est en jeu
		
		
		// Affichage de l'état de la case c(2,3)
		
		if( cs23.estOccupee() == true ){
			System.out.println( "\n3 - c(2,3) est occupée." ) ;
		}
		else {
			System.out.println( "\n3 - c(2,3) est libre." ) ;
		}
			// Doit afficher : 3 - c(2,3) est occupée.
		
		
		// Affichage des coordonnées de la case occupée par le chat noir
		
		System.out.println( "\4 - Coordonnées de la case occupée par le chat noir : " + pnChatNoir.getLaCase().getLigne() + "," + pnChatNoir.getLaCase().getColonne() ) ;
			// Doit afficher : 4 - Coordonnées de la case occupée par le chat noir : 2,3
		
		
		// Affichage du pion qui occupe la case c(2,3)
		
		System.out.println( "\n5 - c(2,3) est occupée par le " + cs23.getLePion().getAnimal() + " " + cs23.getLePion().getCouleur() ) ;
			// Doit afficher : 5 - c(2,3) est occupée par le Chat Noir
		
		
		// Création de la case qui se trouve en ligne 2 et en colonne 4
		// notée c(2,4)
		System.out.println( "\nCRÉATION DE LA CASE c(2,4)" ) ;
		Case cs24 = new Case( 2 , 4 ) ;
		
		
		// Le chat noir se déplace vers l'Est donc sur la case c(2,4)
		System.out.println( "\nLE CHAT NOIR SE DÉPLACE D'UNE CASE DANS LA DIRECTION DE L'EST (CASE c(2,4))" ) ;
		pnChatNoir.setLaCase( cs24 ) ;
		
		
		// Affichage de l'état du pion chat noir
		
		if( pnChatNoir.estEnJeu() == true ){
			System.out.println( "\n6 - Le chat noir est en jeu." ) ;
		}
		else {
			System.out.println( "\n6 - Le chat noir a été capturé." ) ;
		}
			// Doit afficher : 6 - Le chat noir est en jeu
			
				
		// Affichage de l'état de la case c(2,4)
		
		if( cs24.estOccupee() == true ){
			System.out.println( "\n7 - c(2,4) est occupée." ) ;
		}
		else {
			System.out.println( "\n7 - c(2,4) est libre." ) ;
		}
			// Doit afficher : 7 - c(2,4) est occupée.
		
		
		// Affichage des coordonnées de la case occupée par le chat noir
		
		System.out.println( "\8 - Coordonnées de la case occupée par le chat noir : " + pnChatNoir.getLaCase().getLigne() + "," + pnChatNoir.getLaCase().getColonne() ) ;
			// Doit afficher : 8 - Coordonnées de la case occupée par le chat noir : 2,4
			
			
		// Affichage du pion qui occupe la case c(2,4)
		
		System.out.println( "\n9 - c(2,4) est occupée par le " + cs24.getLePion().getAnimal() + " " + cs24.getLePion().getCouleur() ) ;
			// Doit afficher : 9 - c(2,4) est occupée par le Chat Noir
		
		
		// Affichage de l'état de la case c(2,3)
		
		if( cs23.estOccupee() == true ){
			System.out.println( "\n10 - c(2,3) est occupée." ) ;
		}
		else {
			System.out.println( "\n10 - c(2,3) est libre." ) ;
		}
			// Doit afficher : 10 - c(2,3) est libre.
		
		
		// Le chat noir est capturé
		System.out.println( "\nLE CHAT NOIR EST CAPTURÉ" ) ;
		pnChatNoir.setLaCase( null ) ;
		
		
		// Affichage de l'état du pion chat noir
		
		if( pnChatNoir.estEnJeu() == true ){
			System.out.println( "\n11 - Le chat noir est en jeu." ) ;
		}
		else {
			System.out.println( "\n11 - Le chat noir a été capturé." ) ;
		}
			// Doit afficher : 11 - Le chat noir a été capturé
			
				
		// Affichage de l'état de la case c(2,4)
		
		if( cs24.estOccupee() == true ){
			System.out.println( "\n12 - c(2,4) est occupée." ) ;
		}
		else {
			System.out.println( "\n12 - c(2,4) est libre." ) ;
		}
			// Doit afficher : 12 - c(2,4) est libre.
		
	}
	
}
