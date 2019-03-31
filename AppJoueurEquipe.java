public class AppJoueurEquipe {

	public static void main( String [] args ) {
		
		// Création du joueur Hamza
		Joueur jr1 = new Joueur( 1 , "Hamza" ) ;
		
		// Affichage de l'appartenance du joueur Hamza à une équipe
		if( jr1.estDansUneEquipe() ==  true ){
			System.out.print( "1 - Hamza est dans une équipe." ) ;
		}
		else {
			System.out.print( "1 - Hamza n'est pas dans une équipe." ) ;
		}
		// Doit afficher : 1 - Hamza n'est pas dans une équipe.
		
		
		// Création de l'équipe orange
		Equipe eqp = new Equipe( 3 , "Orange" ) ;
		
		// Le joueur Hamza intère l'équipe orange
		jr1.setSonEquipe( eqp ) ;
		
		// Affichage de l'appartenance du joueur Hamza à une équipe
		if( jr1.estDansUneEquipe() ==  true ){
			System.out.print( "2 - Hamza est dans une équipe." ) ;
		}
		else {
			System.out.print( "2 - Hamza n'est pas dans une équipe." ) ;
		}
		// Doit afficher : 2 - Hamza est dans une équipe.
		
		
		// Affichage de la couleur de l'équipe du joueur Hamza
		System.out.print( "3 - " + jr1.getSonEquipe().getCouleur() ) ;
		// Doit afficher : 3 - Orange
		
		
		// Création de la joueuse Ilona
		Joueur jr2 = new Joueur( 2 , "Ilona" , eqp) ;
		
		// Affichage de l'appartenance de la joueuse Ilona à une équipe
		if( jr2.estDansUneEquipe() ==  true ){
			System.out.print( "4 - Ilona est dans une équipe." ) ;
		}
		else {
			System.out.print( "4 - Ilone n'est pas dans une équipe." ) ;
		}
		// Doit afficher : 4 - Ilona est dans une équipe.
		
		// Affichage de la couleur de l'équipe de la joueuse Ilona
		System.out.print( "5 - " + jr2.getSonEquipe().getCouleur() ) ;
		// Doit afficher : 5 - Orange
		
		
		// La joueuse Ilona quitte son équipe
		jr2.setSonEquipe( null ) ;
		
		// Affichage de l'appartenance de la joueuse Ilona à une équipe
		if( jr2.estDansUneEquipe() ==  true ){
			System.out.print( "6 - Ilona est dans une équipe." ) ;
		}
		else {
			System.out.print( "6 - Inona n'est pas dans une équipe." ) ;
		}
		// Doit afficher : 6 - Ilona n'est pas dans une équipe.
		
	}
		
}
