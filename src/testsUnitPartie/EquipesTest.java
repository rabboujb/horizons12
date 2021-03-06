package testsUnitPartie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import partie.Equipes;

/**
 * @author Ismerie
 */


public class EquipesTest {
	
	private static final Class<? extends Throwable> instanceException = null;
	private final Equipes exampleEquipes;
	private Equipes autreEquipes;
	

	
	public EquipesTest() {
		this.exampleEquipes = new Equipes("Equipe 1", 300, 100);
		this.autreEquipes = new Equipes("Equipe 2", 300, 100);
	}
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("***** Début du test de la class Equipes *****" + "\n");
		System.out.println("Tour de référence: " + "\n" + new Equipes("Equipe 1", 300, 100));
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("\n" + "***** Fin du test de la class Equipes *****" + "\n");
	}
	
	@Before
	public void setUp() {
		this.autreEquipes = new Equipes("Equipe 2", 300, 100);
	}
	
	@After
	public void tearDown() {
		autreEquipes = null;
	}
	
	
	/**
	 * Test de la methode getCaisse() de la class Equipes
	 */
	@Test
	public void testGetCaisse() {
		System.out.println("Test méthode : getCaisse");
		assertEquals(300,exampleEquipes.getCaisse());
	}
	
	/**
	 * Test de la methode getNom() de la class Equipes
	 */
	@Test
	public void testGetNom() {
		System.out.println("Test méthode : getNom");
		assertEquals("Equipe 1",exampleEquipes.getNom());
	}
	
	/**
	 * Test de la methode getQualite() de la class Equipes
	 */
	@Test
	public void testGetQualite() {
		System.out.println("Test méthode : getQualite");
		assertEquals(100,exampleEquipes.getQualite());
	}
	
	/**
	 * Test de la methode getBaisseQualite() de la class Equipes
	 */
	@Test
	public void testGetBaisseQualite() {
		System.out.println("Test méthode : getBaisseQualite");
		assertEquals(autreEquipes.getQualite(),exampleEquipes.getQualite());
	}
	
	/**
	 * Test de la methode depense(int somme) de la class Equipes
	 */
	@Test
	public void testdepense() {
		System.out.println("Test méthode : depense");
		autreEquipes.depense(10);
		assertEquals(290,autreEquipes.getCaisse());
	}	
	
	/**
	 * Test de la methode equals() de la class Equipes
	 * ne sera jamais true car les id des tours sont differents
	 */
	@Test
	public void testEquals_True() {
		System.out.println("Test equals: true");
		Equipes instance = new Equipes("Equipe 2", 300, 100);
		System.out.println(instance);
		System.out.println(autreEquipes);
		assertTrue(instance.equals(autreEquipes));
	}
	
	/**
	 * Test de la methode equals() de la class Equipes
	 */
	@Test
	public void testEquals_False() {
		System.out.println("Test equals: false");
		assertFalse(autreEquipes.equals(exampleEquipes));
	}
	
	/**
	 * Test de la methode equals() de la class Equipes avec null
	 */
	@Test
	public void testEquals_Null_Object() {
		System.out.println("Test equals avec null");
		Equipes instance = null;
		assertFalse(autreEquipes.equals(instance));
	}
	
	/**
	 * Test de la methode equals() de la class Equipes avec un autre objet
	 */
	@Test
	public void testEquals_Other_Object() {
		System.out.println("Test equals avec un autre objet");
		String instance = "Equipe 1, 300, 100";
		assertFalse(instance.equals(autreEquipes));
	}
	
	/**
	 * Test de la methode toString() de la class Equipes
	 */
	@Test
	public void testToString() {
		System.out.println("Test méthode : toString");
		Equipes instance = new Equipes("Equipe 1", 300, 100);
	    String chaine = "Equipes{nomEquipe='Equipe 1', caisse=300, qualite=100}";
		assertEquals(chaine, instance.toString());
	}
	

}
