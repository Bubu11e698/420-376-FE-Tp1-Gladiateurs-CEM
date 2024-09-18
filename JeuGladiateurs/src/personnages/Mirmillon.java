/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 202080112
 */
public class Mirmillon extends Personnage {
    private String classe;

    public Mirmillon(String classe) {
        super();
        this.classe = classe;
    }
    
    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        this.initiative = 30;
        this.classe = "Mirmillon";
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
        super.frapperPersonnage(personnageCible);
        if (personnageCible.getPtsDeVie() == 0) {
            personnageCible.setPtsDeVie(0);
            System.out.println(nomPersonnage + " décapite " + personnageCible.getNomPersonnage());
        }else
        {
            System.out.println(nomPersonnage + " attaque de nouveau!");
            super.frapperPersonnage(personnageCible);
        }
     }
}
