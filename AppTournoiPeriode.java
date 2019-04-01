public class AppTournoiPeriode {

	public static void main( String [] args ) {
		
		// Création de la période
		
		Periode prd = new Periode() ;
		prd.setDebut( LocalDate.of( 2019 , 7 , 5 ) ) ;
		prd.setFin( LocalDate.of( 2019 , 7 , 22 ) ) ;
		
		
		// Affichage de l'année du début de la période
		
		System.out.println( "\n1 - Année de début de la période : " + prd.getDebut().getYear() ) ;
			// Doit afficher : 1 - Année de début de la période : 2019
		
		
		// Création du tournoi
		
		Tournoi trn = new Tournoi( 1 , 'Waterloo' , prd ) ;
		
		
		// Affichage de l'année du début de la période du tournoi
		
		System.out.println( "\n2 - Année de début de la période du tournoi : " + trn.getLaPeriode().getDebut().getYear() ) ;
			// Doit afficher : 2 - Année de début de la période du tournoi : 2019
		
	}

}
