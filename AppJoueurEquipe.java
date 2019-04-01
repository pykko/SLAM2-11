public class AppJoueurEquipe {

	public static void main( String [] args ) {
		
		// Création du joueur Hamza
		
		Joueur jr1 = new Joueur( 1 , "Hamza" ) ;
		
		
		// Affichage de l'appartenance du joueur Hamza à une équipe
		
		if( jr1.estDansUneEquipe() ==  true ){
			System.out.println( "\n1 - Hamza est dans une équipe." ) ;
		}
		else {
			System.out.println( "\n1 - Hamza n'est pas dans une équipe." ) ;
		}
			// Doit afficher : 1 - Hamza n'est pas dans une équipe.
		
		
		// Création de l'équipe orange
		
		Equipe eqp = new Equipe( 3 , "Orange" ) ;
		
		
		// Le joueur Hamza intègre l'équipe orange
		
		jr1.setSonEquipe( eqp ) ;
		
		
		// Affichage de l'appartenance du joueur Hamza à une équipe
		
		if( jr1.estDansUneEquipe() ==  true ){
			System.out.println( "\n2 - Hamza est dans une équipe." ) ;
		}
		else {
			System.out.println( "\n2 - Hamza n'est pas dans une équipe." ) ;
		}
			// Doit afficher : 2 - Hamza est dans une équipe.
		
		
		// Affichage de la couleur de l'équipe du joueur Hamza
		
		System.out.println( "\n3 - Hamza est dans l'équipe " + jr1.getSonEquipe().getCouleur() ) ;
			// Doit afficher : 3 - Hamza est dans l'équipe Orange
		
		
		// Création de la joueuse Ilona
		
		Joueur jr2 = new Joueur( 2 , "Ilona" , eqp) ;
		
		
		// Affichage de l'appartenance de la joueuse Ilona à une équipe
		
		if( jr2.estDansUneEquipe() ==  true ){
			System.out.println( "\n4 - Ilona est dans une équipe." ) ;
		}
		else {
			System.out.println( "\n4 - Ilone n'est pas dans une équipe." ) ;
		}
			// Doit afficher : 4 - Ilona est dans une équipe.
		
		
		// Affichage de la couleur de l'équipe de la joueuse Ilona
		
		System.out.println( "\n5 - Ilona est dans l'équipe " + jr2.getSonEquipe().getCouleur() ) ;
			// Doit afficher : 5 - Ilona est dans l'équipe Orange
		
		
		// La joueuse Ilona quitte son équipe
		
		jr2.setSonEquipe( null ) ;
		
		
		// Affichage de l'appartenance de la joueuse Ilona à une équipe
		
		if( jr2.estDansUneEquipe() ==  true ){
			System.out.println( "\n6 - Ilona est dans une équipe." ) ;
		}
		else {
			System.out.println( "\n6 - Inona n'est pas dans une équipe." ) ;
		}
			// Doit afficher : 6 - Ilona n'est pas dans une équipe.
		
	}
		
}
