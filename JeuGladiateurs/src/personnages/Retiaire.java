/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 202080112
 */
public class Retiaire extends Personnage {
        private String classe;
        private boolean filetEnMain;

public Retiaire(String classe, boolean filet) {
        super();
        this.classe = classe;
        this.filetEnMain = filet;
    }
    
    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        this.classe = "Retiaire";
        this.filetEnMain = true;
    }

@Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("    Classe : " + classe);
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }
    
     @Override
     public void frapperPersonnage(Personnage personnageCible) {
         if (filetEnMain) {
            int filet =  (int)(Math.random()*(10 - 1));
             System.out.println("\n");
             System.out.println(nomPersonnage +" lance son filet");
             if (filet == 5) {
                personnageCible.setPtsDeVie(0);
                System.out.println("Son filet attrape " + personnageCible.getNomPersonnage() + " il l'empale sauvagement avec sa lance");
             } else {
                System.out.println("le filet n'atteint pas sa cible");
                filetEnMain = false;
                super.frapperPersonnage(personnageCible);
            }
         } else {
             filetEnMain = true;
             super.frapperPersonnage(personnageCible);
         }
        
     }
}
