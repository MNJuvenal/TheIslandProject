import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Hexagon extends JPanel {
    private Image image;

    public Hexagon() {
        setPreferredSize(new Dimension(500, 500));
        // Charger l'image
        ImageIcon icon = new ImageIcon("image.png"); // Remplacer "image.png" par le chemin de votre image
        image = icon.getImage();
        // Redimensionner l'image pour correspondre à la largeur de l'hexagone
        image = image.getScaledInstance(300, -1, Image.SCALE_SMOOTH); // 300 est la largeur de l'hexagone
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] xPoints = {200, 300, 350, 300, 200, 150};
        int[] yPoints = {350, 350, 250, 150, 150, 250};
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.fillPolygon(xPoints, yPoints, xPoints.length);
        g2d.dispose();
        // Dessiner l'image centrée à l'intérieur de l'hexagone
        int imageX = 200 + (300 - image.getWidth(this)) / 2; // 200 est la coordonnée x du coin supérieur gauche de l'hexagone
        int imageY = 150 + (200 - image.getHeight(this)) / 2; // 150 est la coordonnée y du coin supérieur gauche de l'hexagone
        g.drawImage(image, imageX, imageY, this);
    }
}
