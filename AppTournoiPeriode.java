public class AppTournoiPeriode {

	public static void main( String [] args ) {
		
		// Création de la période
		Periode prd = new Periode() ;
		prd.setDebut( LocalDate.of( 2019 , 7 , 5 ) ) ;
		prd.setFin( LocalDate.of( 2019 , 7 , 22 ) ) ;
		
		// Affichage de l'année de la période
		System.out.println( "1- " + prd.getDebut().getYear() ) ;
		// Doit afficher : 1 - 2019
		
		
		// Création du tournoi
		Tournoi trn = new Tournoi( 1 , 'Waterloo' , prd ) ;
		
		// Affichage de l'année de la période du tournoi
		System.out.println( "2- " + trn.getLaPeriode().getDebut().getYear() ) ;
		// Doit afficher : 2 - 2019
		
	}

}
