public  abstract class Pion1 {
    private int nb_case_parcourable;
    private int position;
    private int coord_x;
    private int coord_y;

    // Constructeur
    public Pion1(int nb_case_parcourable, int position, int coord_x, int coord_y) {
        this.nb_case_parcourable = nb_case_parcourable;
        this.position = position;
        this.coord_x = coord_x;
        this.coord_y = coord_y;
    }







    // Getters et Setters
    public int getNb_case_parcourable() {
        return nb_case_parcourable;
    }

    public void setNb_case_parcourable(int nb_case_parcourable) {
        this.nb_case_parcourable = nb_case_parcourable;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(int coord_x) {
        this.coord_x = coord_x;
    }

    public int getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(int coord_y) {
        this.coord_y = coord_y;
    }

    // Méthodes
    public abstract void deplacer();
    public abstract void creation_pion_explorateur();
    public abstract void deplacer_limite();






















}