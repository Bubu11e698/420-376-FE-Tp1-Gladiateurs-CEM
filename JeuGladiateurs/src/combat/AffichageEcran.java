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
        if (personnage1.ptsDeVie == 0) {
            System.out.println("\n");
            System.out.println(personnage2.nomPersonnage + " gagne le combat");
            System.out.println("\n");
        }else if (personnage2.ptsDeVie == 0) {
            System.out.println("\n");
            System.out.println(personnage1.nomPersonnage + " gagne le combat");
            System.out.println("\n");
        }
    }
    // </editor-fold>
}
