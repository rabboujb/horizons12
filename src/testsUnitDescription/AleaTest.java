package testsUnitDescription;

import static description.Couleur.ROUGE;
import static description.TypeAlea.DELAI;
import description.Alea;
import description.Couleur;
import description.TypeAlea;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * @author Ismerie
 */

public class AleaTest {
	
	private final Alea exampleAlea;
	private Alea autreAlea;
		
	/**
	 * Test du constructeur Alea
	 */
	public AleaTest() {
		this.exampleAlea = new Alea(TypeAlea.DELAI, Couleur.ROUGE, 1, "A");
		this.autreAlea = new Alea(TypeAlea.COUT, Couleur.VERT, 1, "a");
	}
		
	@BeforeClass
	public static void setUpClass() {
		System.out.println("***** Début du test de Alea *****" + "\n");
		System.out.println("Alea de référence: " + new Alea(DELAI,ROUGE,1,"A") + "\n");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("\n" + "***** Fin du test de Alea *****" + "\n");
	}
	
	@Before
	public void setUp() {
		this.autreAlea = new Alea(DELAI,ROUGE,1,"A");
    }
	
	@After
	public void tearDown() {
		autreAlea = null;
	}
		
	
	/**
	 * Test de la methode getTYPE() de la class Alea
	 */
	@Test
	public void testGetTYPE() {
		System.out.println("Test méthode : getTYPE");
		assertEquals(TypeAlea.DELAI,autreAlea.getTYPE());
	}
	
	/**
	 * Test de la methode getCOULEUR() de la class Alea
	 */
	@Test
	public void testGetCOULEUR() {
		System.out.println("Test méthode : getCOULEUR");
		System.out.println(autreAlea);
		assertEquals(Couleur.ROUGE,autreAlea.getCOULEUR());
	}
	
	/**
	 * Test de la methode getGRAVITE() de la class Alea
	 */
	@Test
	public void testGetGRAVITE() {
		System.out.println("Test méthode : getGRAVITE");
		assertEquals(1,autreAlea.getGRAVITE());
	}
	
	/**
	 * Test de la methode getNOM() de la class Alea
	 */
	@Test
	public void testGetNOM() {
		System.out.println("Test méthode : getNOM");
		assertEquals("A",autreAlea.getNOM());
	}
	
	/**
	 * Test de la methode equals() de la class Alea
	 */
	@Test
	public void testEquals_True() {
		System.out.println("Test equals: true");
		Alea instance = new Alea(TypeAlea.DELAI, Couleur.ROUGE, 1, "A");
		//System.out.println(instance);
		//System.out.println(exampleAlea);
		assertTrue(instance.equals(exampleAlea));
	}
	
	/**
	 * Test de la methode equals() de la class Alea
	 */
	@Test
	public void testEquals_False(){
		System.out.println("Test equals: false");
		assertFalse(autreAlea.equals(exampleAlea));
	}
	
	/**
	 * Test de la methode equals() de la class Alea avec null
	 */
	@Test
	public void testEquals_Null_Object() {
		System.out.println("Test equals avec null");
		Alea instance = null;
		assertFalse(exampleAlea.equals(instance));
	}
	
	/**
	 * Test de la methode equals() de la class Alea avec un autre objet
	 */
	@Test
	public void testEquals_Other_Object() {
		System.out.println("Test equals avec un autre objet");
		String instance = "DELAI,ROUGE,1,A";
		assertFalse(instance.equals(exampleAlea));
	}
	
	/**
	 * Test de la methode toString() de la class Alea
	 */
	@Test
	public void testToString() {
		System.out.println("Test méthode : toString");
		Alea instance = new Alea(TypeAlea.DELAI, Couleur.ROUGE, 1, "A");
		String expResult = "ROUGE	:	\"A\" 	Délai	Gravité 1";
		assertEquals(expResult, instance.toString());
	}
	
	

}
