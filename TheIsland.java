import java.util.HashMap;

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
}

class FaceCachée extends Position {
    String type;

    public FaceCachée(int x, int y, String type) {
        super(x, y);
        this.type = type;
    }

    public static void bonus() {
    }

    public static void évènement() {
    }

    @Override
    public void setX(int x) {

    }
    
    @Override
    public void setY(int y) {
    }
}

class Tuile extends Position {
    int niveauEngloutissement;
    FaceCachée faceCachée;

    public Tuile(int x, int y, int niveauEngloutissement, FaceCachée faceCachée) {
        super(x, y);
        this.niveauEngloutissement = niveauEngloutissement;
        this.faceCachée = faceCachée;
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

    @Override
    public void setX(int x) {

    }

    @Override
    public void setY(int y) {
    }

}

class Plage extends Tuile {
    public Plage(int x, int y, FaceCachée faceCachée) {
        super(x, y, 1, faceCachée);
    }
}

class Forêt extends Tuile {
    public Forêt(int x, int y, FaceCachée faceCachée) {
        super(x, y, 2, faceCachée);
    }
}

class Montagne extends Tuile {
    public Montagne(int x, int y, FaceCachée faceCachée) {
        super(x, y, 3, faceCachée);
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
    public SerpentDeMer(int x, int y) {
        super(x, y, "Serpent de mer");
    }

    public void devorerExplorateursEtBateaux() {

    }
}

class Requin extends Monstre {
    public Requin(int x, int y) {
        super(x, y, "Requin");
    }

    public void devorerExplorateurs() {

    }
}

class Baleine extends Monstre {
    public Baleine(int x, int y) {
        super(x, y, "Baleine");
    }

    public void coulerBateau() {

    }
}

class Bateau extends Position {
    int capaciteBateau = 3;

    public Bateau(int x, int y) {
        super(x, y);
    }

    public int getCapaciteBateau() {
        return capaciteBateau;
    }

    public void diminuerCapaciteBateau() {
        capaciteBateau--;
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

class Explorateurs extends HashMap<String, Explorateur> {

}

public class TheIsland{
    
}