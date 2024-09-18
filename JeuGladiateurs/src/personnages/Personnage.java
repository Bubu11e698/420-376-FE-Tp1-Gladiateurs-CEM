package personnages;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
   public String nomPersonnage;
   public int ptsDeVie;
   public int valeurMaxAttaque;
   public int valeurDefense;
   public int initiative;
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        nomPersonnage = nom;
        valeurMaxAttaque = attaqueMax;
        valeurDefense = defense;
        ptsDeVie = pvs;
        initiative = ini;
    }

    public Personnage() {
       nomPersonnage = "";
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        ptsDeVie = 0;
        initiative = 0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public String getNomPersonnage() {
        return nomPersonnage;
    }

    public int getPtsDeVie() {
        return ptsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }
    
    public void setNomPersonnage(String nomPersonnage) {
        this.nomPersonnage = nomPersonnage;
    }

    public void setPtsDeVie(int ptsDeVie) {
        this.ptsDeVie = ptsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("\n");
        System.out.println(nomPersonnage);
        System.out.println("    Attaque : " + valeurMaxAttaque);
        System.out.println("    Défense : " + valeurDefense);
        System.out.println("    Points de vie : " + ptsDeVie);
        System.out.println("    Initiative : " + initiative);
        if (ptsDeVie > 0 ) {
              System.out.println("    Statut : Vivant " );
        }
        else 
        {
               System.out.println("Statut : Mort" );  
        }
    }
    
    public void setNewInitiativeRandom() {
        initiative  = (int)(Math.random()*(initiative - 1));
    }

    protected int attaqueCalcul() {
         int rand = (int)(Math.random()*(valeurMaxAttaque - 1));
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return rand;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int attaque = attaqueCalcul();
        System.out.println("\n");
         System.out.println(nomPersonnage + " attaque avec une puissance de : " + attaque);
         System.out.println(personnageCible.getNomPersonnage() + " a une défense de : " + personnageCible.getValeurDefense());
        attaque = attaque - personnageCible.getValeurDefense();
        
        if (attaque < 0) {
            attaque = 0;
        }
        
        System.out.println("Les dommages sont donc de :" + attaque);
        
        personnageCible.ptsDeVie -= attaque;
        
        if (personnageCible.getPtsDeVie() < 0) {
            personnageCible.setPtsDeVie(0);
        }
        
       
    }

    // </editor-fold>
    
    
}
