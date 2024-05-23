import java.awt.*;
import javax.swing.*;

public class HexagonalGrid extends JPanel {
    private static final int HEX_SIZE = 50; // Taille de l'hexagone
    private static final int VERT_DIST = (int) (HEX_SIZE * 0.80); // Distance verticale entre les hexagones
    private static final int HOR_DIST = (int) (HEX_SIZE * 1.05); // Distance horizontale entre les hexagones

    public HexagonalGrid() {
        this.setLayout(null); // Utilise un layout null pour un positionnement personnalisé
        this.setOpaque(false); // Ne dessine pas l'arrière-plan
        createHexagonalGrid();
    }

    private void createHexagonalGrid() {
        int[] elements = {7, 10, 11, 10, 11, 12, 11, 12, 11, 10, 11, 10, 7}; // Nombre d'hexagones par rangée

        for (int i = 0; i < 13; i++) {
            int m = (elements[i] - elements[0]) * HOR_DIST / 2; // Décalage horizontal pour chaque rangée
            for (int j = 0; j < elements[i]; j++) {
                int x = 150 + j * HOR_DIST - m; // Coordonnée x de l'hexagone
                int y = 30 +  i * VERT_DIST; // Coordonnée y de l'hexagone
                HexagonalButton hexButton = new HexagonalButton("");
                hexButton.setBounds(x, y, HEX_SIZE * 2, HEX_SIZE * 2); // Définit la taille de l'hexagone
                hexButton.setBackground(Color.WHITE);
                hexButton.setForeground(Color.BLACK);
                hexButton.addActionListener(e -> System.out.println("Hexagon button clicked!"));
                this.add(hexButton); // Ajoute l'hexagone au panneau
            }
        }
    }

    // Crée un panneau avec un fond d'image
    static JPanel createBackgroundPanel(String imagePath) {
        ImageIcon backgroundIcon = new ImageIcon(imagePath);
        Image background = backgroundIcon.getImage();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics); // Appelle la méthode de la superclasse pour un rendu correct
                graphics.drawImage(background, 0, 0, getWidth(), getHeight(), this);
            }
        };

        return panel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hexagonal Grid");
        frame.setSize(710, 635);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crée un panneau de fond
        JPanel backgroundPanel = createBackgroundPanel("TheIsland.jpeg");

        // Crée le panneau d'hexagones
        HexagonalGrid hex = new HexagonalGrid();

        // Utilise un JLayeredPane pour superposer les panneaux
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(710, 635));
        backgroundPanel.setBounds(0, 0, 710, 635);
        hex.setBounds(0, 0, 710, 635);

        // Ajoute les panneaux au JLayeredPane
        layeredPane.add(backgroundPanel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(hex, JLayeredPane.PALETTE_LAYER);

        frame.add(layeredPane); // Ajoute le JLayeredPane à la fenêtre
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
