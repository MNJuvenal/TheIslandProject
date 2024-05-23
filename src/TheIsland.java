import java.util.ArrayList;
import java.util.List;

class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    
    public void destroy(){
    	this.x = -1;
    	this.y = -1;
    }
}


class FaceCachée extends Position {
    String typeFaceCachée;

    public FaceCachée(int x, int y, String typeFaceCachée) {
        super(x, y);
        this.typeFaceCachée = typeFaceCachée;
    }

    public void bonus() {
    }

    public void évènement() {
    }

    @Override
    public void setX(int x) {
    }
    
    @Override
    public void setY(int y) {
    }
}

class AjouterRequin extends FaceCachée {
    public static int exemplaireTuilesPlage = 3;
    public static int exemplaireTuilesForêt = 2;
    public static int exemplaireTuilesMontagne = 1;      

    public AjouterRequin(int x, int y) {
        super(x, y, "AjouterRequin");     
    }

    @Override
    public void évènement() {
    }
}

class AjouterBaleine extends FaceCachée {
    public static int exemplaireTuilesPlage = 3;
    public static int exemplaireTuilesForêt = 2;
    public static int exemplaireTuilesMontagne = 1; 

    public AjouterBaleine(int x, int y) {
        super(x, y, "AjouterBaleine");     
    }

    @Override
    public void évènement() {
       
    }
}

class AjouterBateau extends FaceCachée {
    public static int exemplaireTuilesPlage = 1;
    public static int exemplaireTuilesForêt = 3;

    public AjouterBateau(int x, int y) {
        super(x, y, "AjouterBateau");     
    }

    @Override
    public void évènement() {
    }
}

class Tourbillon extends FaceCachée {
    public static int exemplaireTuilesForêt = 2;
    public static int exemplaireTuilesMontagne = 1;

    public Tourbillon(int x, int y) {
        super(x, y, "Tourbillon");     
    }

    @Override
    public void évènement() {
	// Supprimer tous les pions de la tuile
    }
}

class EruptionVolcanique extends FaceCachée {
    public static boolean GameNotYetOver = true; 

    public EruptionVolcanique(int x, int y) {
        super(x, y, "EruptionVolcanique");     
    }

    @Override
    public void évènement() {
        // Dans la boucle while qui va faire tourner le jeu
        GameNotYetOver = false;
    }
}

class DéplacerRequin extends FaceCachée {
    public static int exemplaireTuilesPlage = 1;
    public static int exemplaireTuilesForêt = 1;

    public DéplacerRequin(int x, int y) {
        super(x, y, "DéplacerRequin");     
    }

    @Override
    public void évènement() {
        // Logique pour déplacer un requin
    }
}

class DéplacerBaleine extends FaceCachée {
    public static int exemplaireTuilesPlage = 1;
    public static int exemplaireTuilesForêt = 1;

    public DéplacerBaleine(int x, int y) {
        super(x, y, "DéplacerBaleine");     
    }

    @Override
    public void évènement() {
        // Logique pour déplacer une baleine
    }
}

class DéplacerBateau extends FaceCachée {
    public static int exemplaireTuilesPlage = 2;

    public DéplacerBateau(int x, int y) {
        super(x, y, "DéplacerBateau");     
    }

    @Override
    public void évènement() {
        // Logique pour déplacer un bateau
    }
}

class DéplacerSerpentDeMer extends FaceCachée {
    public static int exemplaireTuilesPlage = 1;
    public static int exemplaireTuilesForêt = 1;

    public DéplacerSerpentDeMer(int x, int y) {
        super(x, y, "DéplacerSerpentDeMer");     
    }

    @Override
    public void évènement() {
        // Logique pour déplacer un serpent de mer
    }
}

class UtiliserDauphin extends FaceCachée {
    public static int exemplaireTuilesPlage = 3;
    public static int exemplaireTuilesForêt = 1;

    public UtiliserDauphin(int x, int y) {
        super(x, y, "UtiliserDauphin");     
    }

    @Override
    public void évènement() {
        // Logique pour utiliser un dauphin
    }
}

class EliminerRequin extends FaceCachée {
    public static int exemplaireTuilesPlage = 1;
    public static int exemplaireTuilesForêt = 1;
    public static int exemplaireTuilesMontagne = 1; 

    public EliminerRequin(int x, int y) {
        super(x, y, "EliminerRequin");     
    }

    @Override
    public void évènement() {
        // Logique pour éliminer un requin
    }
}

class EliminerBaleine extends FaceCachée {
    public static int exemplaireTuilesForêt = 2;
    public static int exemplaireTuilesMontagne = 1;

    public EliminerBaleine(int x, int y) {
        super(x, y, "EliminerBaleine");     
    }

    @Override
    public void évènement() {
        // Logique pour éliminer une baleine
    }
}



class Tuile extends Position {
    int niveauEngloutissement;
    FaceCachée faceCachée;
    List<Integer> listeDePions = new ArrayList<>();

    public Tuile(int x, int y, int niveauEngloutissement, FaceCachée faceCachée, List<Integer> listeDePions) {
        super(x, y);
        this.niveauEngloutissement = niveauEngloutissement;
        this.faceCachée = faceCachée;
        this.listeDePions = listeDePions;
    }

    public int getNiveauEngloutissement() {
        return niveauEngloutissement;
    }

    public Tuile getTuile() {
        return this;
    }
    
  
    public FaceCachée getFaceCachée() {
        return faceCachée;
    }
    
     //On rééecris la fonction qui change les coordonnées en une fonction qui ne fais rien car cet élément ne se déplace pas.

    @Override
    public void setX(int x) {
	
    }

    @Override
    public void setY(int y) {
    }

}

class Plage extends Tuile {
    public Plage(int x, int y, FaceCachée faceCachée, List<Integer> listeDePions) {
        super(x, y, 1, faceCachée, listeDePions);
    }
}

class Forêt extends Tuile {
    public Forêt(int x, int y, FaceCachée faceCachée, List<Integer> listeDePions) {
        super(x, y, 2, faceCachée, listeDePions);
    }
}

class Montagne extends Tuile {
    public Montagne(int x, int y, FaceCachée faceCachée, List<Integer> listeDePions) {
        super(x, y, 3, faceCachée, listeDePions);
    }
}


class Monstre extends Position {
    String nomMonstre;

    public Monstre(int x, int y, String nomMonstre) {
        super(x, y);
        this.nomMonstre = nomMonstre;
    }

    public String getNomMonstre() {
        return nomMonstre;
    }
}

class SerpentDeMer extends Monstre {
    private static int nombreDeSerpent = 5;

    private SerpentDeMer(int x, int y) {
        super(x, y, "Serpent de mer");
    }

    public static SerpentDeMer créerSerpentDeMer(int x, int y) {
        if (nombreDeSerpent > 0) {
            nombreDeSerpent--;
            return new SerpentDeMer(x, y);
        } else {
            return null;
        }
    }

    public static int getNombreDeSerpent() {
        return nombreDeSerpent;
    }

    public void devorerExplorateursEtBateaux() {
        // Implémentation de la méthode
    }
}


class Requin extends Monstre {
    private static int nombreDeRequin = 6;

    private Requin(int x, int y) {
        super(x, y, "Requin");
    }

    public static Requin créerRequin(int x, int y) {
        if (nombreDeRequin > 0) {
            nombreDeRequin--;
            return new Requin(x, y);
        } else {
            return null;
        }
    }

    public static int getNombreDeRequin() {
        return nombreDeRequin;
    }

    public void devorerExplorateurs() {
        // Implémentation de la méthode
    }
}


class Baleine extends Monstre {
    private static int nombreDeBaleine = 5;

    private Baleine(int x, int y) {
        super(x, y, "Baleine");
    }

    public static Baleine créerBaleine(int x, int y) {
        if (nombreDeBaleine > 0) {
            nombreDeBaleine--;
            return new Baleine(x, y);
        } else {
            return null;
        }
    }

    public static int getNombreDeBaleine() {
        return nombreDeBaleine;
    }

    public void coulerBateau() {
        // Implémentation de la méthode
    }
}




class Bateau extends Position {
    private static int nombreDeBateaux = 12;
    private int capaciteBateau = 3;

    private Bateau(int x, int y) {
        super(x, y);
    }

    public static Bateau créerBateau(int x, int y) {
        if (nombreDeBateaux > 0) {
            nombreDeBateaux--;
            return new Bateau(x, y);
        } else {
            return null;
        }
    }

    public static int getNombreDeBateaux() {
        return nombreDeBateaux;
    }

    public int getCapaciteBateau() {
        return capaciteBateau;
    }

    public boolean diminuerCapaciteBateau() {
        if (capaciteBateau > 0) {
            capaciteBateau--;
            //Oui on peut ajouter explorateur sur le bateau
            return true;
        } else {
	    //Non on ne peut pas ajouter explorateur sur le bateau
	    return false;
        }
    }
}

class Explorateur extends Position {
    int pointsDeTresor;

    public Explorateur(int x, int y, int pointsDeTresor) {
        super(x, y);
        this.pointsDeTresor = pointsDeTresor;
    }

    public int getPointsDeTresor() {
        return pointsDeTresor;
    }
}
