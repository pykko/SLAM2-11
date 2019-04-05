public class AppServeurJeu {

	public static void main( String [] args ) {
		
		// Création de la couleur Mauve
		
		System.out.println( "\nCRÉATION DE LA COULEUR MAUVE" ) ;
		Couleur clrMauve = new Couleur( 8 , "Mauve" ) ;
		
		
		// 1- Nombre de pions mauves
		
		System.out.println( "\n1- Nombre de pions mauves : " + clrMauve.getLesPions().size() ) ;
			// Affichage attendu : 1- Nombre de pions mauves : 0
				
		
		// Création du chat mauve
		
		System.out.println( "\nCRÉATION DU CHAT MAUVE" ) ;
		Pion chatMauve = new Pion( 2 , "Chat" , clrMauve ) ;
		
		
		// 2- Nombre de pions mauves
		
		System.out.println( "\n2- Nombre de pions mauves : " + clrMauve.getLesPions().size() ) ;
			// Affichage attendu : 2- Nombre de pions mauves : 1
			
			
		// 3- Numéro de la couleur du chat mauve
		
		System.out.println( "\n3- Numéro de la couleur du chat mauve : " + chatMauve.getLaCouleur().getNumero() ) ;
			// Affichage attendu : 3- Numéro de la couleur du chat mauve : 8
			
			
		// 4- Numéro de la couleur du premier pion mauve
		
		System.out.println( "\n4- Numéro de la couleur du premier pion mauve : " + clrMauve.getLesPions().get( 0 ).getNumero() ) ) ;
			// Affichage attendu : 4- Numéro de la couleur du premier pion mauve : 8
		
		
		// Création du rat mauve
		
		System.out.println( "\nCRÉATION DU RAT MAUVE" ) ;
		Pion ratMauve = new Pion( 1 , "Rat" , clrMauve ) ;
		
		
		// 5- Nombre de pions mauves
		
		System.out.println( "\n5- Nombre de pions mauves : " + clrMauve.getLesPions().size() ) ;
			// Affichage attendu : 5- Nombre de pions mauves : 2
		
		
		// 6- Liste des pions mauves
		
		System.out.println( "\n6- Pions mauves :" ) ;
		for( Pion unPion : clrMauve.getLesPions() ){
			System.out.println( "- " + unPion.getNumero() + " : " + unPion.getNom() ) ;
		}
			// Affichage attendu :
			// 6- Pions mauves :
			// - 2 : Chat
			// - 1 : Rat
		
		
		// Suppression du chat mauve
		
		System.out.println( "\nSUPPRESSION DU CHAT MAUVE" ) ;
		clrMauve.supprimerPion( chatMauve ) ;
		
		
		// 7- Affichage de la couleur du chat mauve
		
		System.out.println( "\n7- Couleur du chat mauve : " + chatMauve.getLaCouleur() ) ;
			// Affichage attendu : 7- Couleur du chat mauve : null
		
		
		// 8- Liste des pions mauves
		
		System.out.println( "\n8- Pions mauves :" ) ;
		for( Pion unPion : clrMauve.getLesPions() ){
			System.out.println( "- " + unPion.getNumero() + " : " + unPion.getNom() ) ;
		}
			// Affichage attendu :
			// 8- Pions mauves :
			// - 1 : Rat	
		
		
	
	}
	
}
