package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="M�thodes d'affichage">
    public void afficherDebutCombat() {
        System.out.println("\n");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println("\n");

    }
    
    public void afficherSeparateurDeTour() {
         System.out.println("\n");
         System.out.println("**************************************");
    }

    public void afficherSeparateurInfosPerso() {
        System.out.println("\n");
        System.out.println("--------------------------");
        System.out.println("INFOS PERSONNAGES");
        System.out.println("--------------------------");
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        // TODO : Afficher le gagnant du combat, tel que montr� dans l'�nonc�
    }
    // </editor-fold>
}
