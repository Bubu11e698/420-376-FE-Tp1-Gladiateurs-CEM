package jeugladiateurs;

import personnages.Personnage;
import personnages.Mirmillon;
import personnages.Retiaire;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Mirmillon Bob = new Mirmillon("Bob le malchanceux", 15, 15, 70, 15);
    Retiaire Igor = new Retiaire("Igor l'empaleur", 25, 5, 100, 30);
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pr�-combat">
    Bob.afficherInfosPersonnage();
    Igor.afficherInfosPersonnage();
    affichage.afficherDebutCombat();
    // </editor-fold>
  
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="M�canique de combat">
    // TODO : La boucle contenant les �tapes du combat
        for (int i = 0; i < 50; i++) {
            tour.afficheTour();
            
            for (int j = 0; j < 100; j++) {
                if (Bob.getInitiative() == j) {
                    Bob.frapperPersonnage(Igor);
                }
                if (Igor.getInitiative() == j) {
                    Igor.frapperPersonnage(Bob);
                }
            }
            
            affichage.afficherSeparateurInfosPerso();
            Bob.afficherInfosPersonnage();
            Igor.afficherInfosPersonnage();
            
            Bob.setNewInitiativeRandom();
            Igor.setNewInitiativeRandom();
            
            tour.augmenteTour();
            affichage.afficherSeparateurDeTour();
            
            if (Bob.getPtsDeVie() == 0 || Igor.getPtsDeVie() == 0) {
                break;
            }
        }
        affichage.afficheVictoire(Bob, Igor);
        // </editor-fold>
    }

}
