public class AppServeurJeu {

	public static void main( String [] args ) {
		
		// Création du serveur
		
		Serveur srv = new Serveur( 1 , "SRV-GAMES-1" ) ;
		
		
		// Affichage du nombre de jeux hébergés par le serveur
		
		System.out.println( "\n1 - Nombre de jeux hébergés : " + srv.getLesJeux().size() ) ;
			// Doit afficher : 1 - Nombre de jeux hébergés : 0
		
		
		// Création du premier jeu
		
		Jeu j1 = new Jeu( 1 , "Waterloo" ) ;
		
		
		// Ajout du premier jeu au serveur
		
		srv.ajouterJeu( j1 ) ;
		
		// Ajout du second jeu au serveur
		
		srv.ajouterJeu( new Jeu( 2 , "Verdun 1916" ) ) ;
		
		
		// Affichage du nombre de jeux hébergés par le serveur
		
		System.out.println( "\n2 - Nombre de jeux hébergés : " + srv.getLesJeux().size() ) ;
			// Doit afficher : 2 - Nombre de jeux hébergés : 2
		
		
		// Affichage du titre des jeux hébergés par le serveur
		
		System.out.println( "\n3 - Les jeux hébergés :" ) ;
		for( Jeu unJeu : srv.getLesJeux() ){
			System.out.println( "> " + unJeu.getTitre() ) ;
		}
			// Doit afficher :
			// 3 - Les jeux hébergés :
			// > Waterloo
			// > Verdun 1916
		
		
		// Suppression du premier jeu du serveur
		
		srv.supprimerJeu( j1 ) ;
		
		
		// Affichage du nombre de jeux hébergés par le serveur
		
		System.out.println( "\n4 - Nombre de jeux hébergés : " + srv.getLesJeux().size() ) ;
			// Doit afficher : 4 - Nombre de jeux hébergés : 1
		
		
		// Affichage du titre des jeux hébergés par le serveur
		
		System.out.println( "\n5 - Les jeux hébergés :" ) ;
		for( Jeu unJeu : srv.getLesJeux() ){
			System.out.println( "> " + unJeu.getTitre() ) ;
		}
			// Doit afficher :
			// 5 - Les jeux hébergés :
			// > Verdun 1916
		
	}
	
}
