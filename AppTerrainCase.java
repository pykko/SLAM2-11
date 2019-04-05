public class AppTerrainCase {

	public static void main( String [] args ) {
		
		// Création du terrain
		
		System.out.println( "\nCRÉATION DU TERRAIN" ) ;
		Terrain trn = new Terrain( 3 , "Marais" ) ;
		
		
		// 1- Nombre de cases de type Marais
		
		System.out.println( "\n1- Nombre de cases de type Marais : " + trn.getLesCases().size() ) ;
			// Affichage attendu : 1- Nombre de cases de type Marais : 0
			
			
		// Création de la case c(1,2)
		
		System.out.println( "\nCRÉATION DE LA CASE c(1,2)" ) ;
		Case c12 = new Case( 1 , 2 ) ;
		
		
		// La case c(1,2) est un de type Marais
		
		System.out.println( "\nLA CASE c(1,2) EST DE TYPE MARAIS" ) ;
		trn.ajouterCase( c12 ) ;
		
		
		// 2- Nombre de cases de type Marais
		
		System.out.println( "\n2- Nombre de cases de type Marais : " + trn.getLesCases().size() ) ;
			// Affichage attendu : 2- Nombre de cases de type Marais : 1
			
		
		// 3- Type de la case c(1,2)
		
		System.out.println( "\n3- Type de la case c(1,2) : " + c12.getLeTerrain().getLibelle() ) ;
			// Affichage attendu : 3- Type de la case c(1,2) : Marais
			
		
		// 4- Coordonnées de la première case de type Marais
		
		System.out.println( "\n4- Coordonnées de la première case de type Marais : " + trn.getLesCases().get( 0 ).getLigne() + "," + trn.getLesCases().get( 0 ).getColonne() ) ;
			// Affichage attendu : 4- Coordonnées de la première case de type Marais : 1,2
		
		
		// Création de la case c(1,3)
		
		System.out.println( "\nCRÉATION DE LA CASE c(1,3)" ) ;
		Case c13 = new Case( 1 , 3 ) ;
		
		
		// La case c(1,3) est un de type Marais
		
		System.out.println( "\nLA CASE c(1,3) EST DE TYPE MARAIS" ) ;
		trn.ajouterCase( c13 ) ;
		
		
		// 5- Nombre de cases de type Marais
		
		System.out.println( "\n5- Nombre de cases de type Marais : " + trn.getLesCases().size() ) ;
			// Affichage attendu : 5- Nombre de cases de type Marais : 2
			
			
		// 6- Liste des cases de type Marais
		
		System.out.println( "\n7- Cases de type Marais :" ) ;
		for( Case uneCase : trn.getLesCases() ){
			System.out.println( "- " + uneCase.getLigne() + "," + uneCase.getColonne() ) ;
		}
			// Affichage attendu :
			// 6- Cases de type Marais :
			// - 1,2
			// - 1,3
			
			
		// Suppression de la case c(1,2)
		
		System.out.println( "\nSUPPRESSION DE LA CASE c(1,2)" ) ;
		trn.supprimerCase( c12 ) 
		
		
		// 7- Affichage du type de terrain de la case c(1,2)
		
		System.out.println( "\n7- Type de terrain de la case c(1,2) : " + c12.getLeTerrain() ) ;
			// Affichage attendu : 7- Type de terrain de la case c(1,2) : null
		
		
		// 8- Liste des cases de type Marais
		
		System.out.println( "\n8- Cases de type Marais :" ) ;
		for( Case uneCase : trn.getLesCases() ){
			System.out.println( "- " + uneCase.getLigne() + "," + uneCase.getColonne() ) ;
		}
			// Affichage attendu :
			// 8- Cases de type Marais :
			// - 1,3
		
		
	}
	
}
