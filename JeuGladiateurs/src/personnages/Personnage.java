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
    // <editor-fold defaultstate="collapsed" desc="M�canique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("\n");
        System.out.println(nomPersonnage);
        System.out.println("Attaque : " + valeurMaxAttaque);
        System.out.println("D�fense : " + valeurDefense);
        System.out.println("Points de vie : " + ptsDeVie);
        System.out.println("Initiative : " + initiative);
        if (ptsDeVie > 0 ) {
              System.out.println("Statut : Vivant " );
        }
        else 
        {
               System.out.println("Statut : Mort" );  
        }
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouv�e al�atoirement et doit se situer entre Z�RO et valeurMaxAttaque.
        return 0;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : R�cup�rer la valeur d'attaque pour ce tour, calculer les d�gats,
        //modifier les points de vie du personnage cible, afficher les d�tails
        // sur l'attaque, tel que montr� dans l'�nonc�.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de fa�on al�atoire la valeur INI du personnage.
    }
    // </editor-fold>
    
    
}
