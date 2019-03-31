public class AppServeurJeu {

	public static void main( String [] args ) {
		
		// Création du serveur
		Serveur srv = new Serveur( 1 , "SRV-GAMES-1" ) ;
		
		// Affichage du nombre de jeux hébergés par le serveur
		System.out.println( "1 - " + srv.getLesJeux().size() ) ;
		// Doit afficher : 1 - 0
		
		// Création du premier jeu
		Jeu j1 = new Jeu( 1 , "Waterloo" ) ;
		
		// Ajout du premier jeu au serveur
		srv.ajouterJeu( j1 ) ;
		
		// Ajout du second jeu au serveur
		srv.ajouterJeu( new Jeu( 2 , "Verdun 1916" ) ) ;
		
		// Affichage du nombre de jeux hébergés par le serveur
		System.out.println( "2 - " + srv.getLesJeux().size() ) ;
		// Doit afficher : 2 - 2
		
		// Affichage du titre des jeux hébergés par le serveur
		for( Jeu unJeu : srv.getLesJeux() ){
			System.out.println( "3> " + unJeu.getTitre() ) ;
		}
		// Doit afficher :
		// 3> Waterloo
		// 3> Verdun 1916
		
		// Suppression du premier jeu du serveur
		srv.supprimerJeu( j1 ) ;
		
		// Affichage du nombre de jeux hébergés par le serveur
		System.out.println( "4 - " + srv.getLesJeux().size() ) ;
		// Doit afficher : 4 - 1
		
		// Affichage du titre des jeux hébergés par le serveur
		for( Jeu unJeu : srv.getLesJeux() ){
			System.out.println( "5> " + unJeu.getTitre() ) ;
		}
		// Doit afficher :
		// 5> Verdun 1916
		
	}
	
}
