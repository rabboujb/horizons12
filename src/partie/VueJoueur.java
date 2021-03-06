package partie;
import description.Couleur;
import description.Description;

import java.util.ArrayList;
import java.util.List;

/**
 * L'interface VueJoueur décrit toutes les opérations que peut demander un acteur (RobotObsolete ou Joueur via son IHM) lors du
 * jeu. Ces opérations sont formées en 3 groupes:
 *
 * @author mickael
 */

public interface VueJoueur {
    void ajouterEquipe(VueJoueur equipe);

    /**Termine le tour pour le joueur courant.*/
    void finDuTour();

    /**
     * Fournit le montant actuel de la caisse de l'équipe (en euros).
     * @return Le montant de la caisse de l'équipe.
     */
    int getCaisse();

    /**
     * Fournit l'état d'avancement de la réalisation d'une tâche pour l'équipe (en semaines).
     * @param id - l'identifiant de la tâche
     * @return la durée réelle de la tâche
     */
    int getCurrent(String id);

    /**
     * Fournit l'identifiant de la première tâche du PERT.
     * @return l'indentifiant de la première tâche du pert
     */
    String getDebutId();

    /**
     * Retourne l'objet permettant d'acquérir la description de la configuration de jeu.
     * @return L'objet contenant la description statique du jeu.
     */
    Description getPlateau();

    /**
     * Fournit la durée réelle d'une tâche pour l'équipe.
     * @param id - l'identifiant de la tâche
     * @return La durée réelle d'une tâche pour l'équipe (en semaines).
     */
    int getDuree(int id);

    /**
     * Fournit l'identifiant de la dernière tâche du PERT.
     * @return l'identifiant de la dernière tâche.
     */
    String getFinId();

    /**
     * Fournit le nom de l'équipe.
     * @return le nom de l'équipe
     */
    String getNom();

    /**
     * Fournit le numéro du tour courant.
     * @return le numéro du tour courant
     */
    int getNumeroTour();

    /**
     * Fournit la qualité actuelle du produit.
     * @return le pourcentage de qualité du produit
     */
    int getQualite();

    /** Récupère la vue de l'équipe passée en paramètre.
      * @param nomEquipe le nom de l'équipe
      */
	VueJoueur getEquipe(String nomEquipe);

	List<VueJoueur> getEquipes();

	DonneesJoueur getDonneesEquipe();

	Realisation getRealisation(int idTache);
	
	ArrayList<Realisation> getRealisations();

	int getNumeroTache();

    void finDeTache();
}
