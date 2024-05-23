import java.awt.*;
import javax.swing.*;

class HexagonalButton extends JButton {
    private Polygon hexagon;

    public HexagonalButton(String label) {
        super(label);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);
        initHexagon();
    }

    private void initHexagon() {
        int[] xPoints = {48, 22, 22, 48, 74, 74}; // Doublé pour agrandir l'hexagone
        int[] yPoints = {20, 36, 60, 76, 60, 36}; // Doublé pour agrandir l'hexagone
        hexagon = new Polygon(xPoints, yPoints, 6);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Fill the hexagon with a color
        if (getModel().isArmed()) {
            g2.setColor(Color.LIGHT_GRAY);
        } else {
            g2.setColor(getBackground());
        }
        g2.fill(hexagon);

        // Draw the label
        g2.setColor(getForeground());
        FontMetrics fm = g2.getFontMetrics();
        Rectangle rect = hexagon.getBounds();
        int x = rect.x + (rect.width - fm.stringWidth(getText())) / 2;
        int y = rect.y + ((rect.height - fm.getHeight()) / 2) + fm.getAscent();
        g2.drawString(getText(), x, y);

        g2.dispose();
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawPolygon(hexagon);
    }

    @Override
    public boolean contains(int x, int y) {
        return hexagon.contains(x, y);
    }

    public static void main(String[] args) {
        HexagonalButton h = new HexagonalButton("");
        JFrame frame = new JFrame("Hexagonal Button");
        frame.setSize(150, 150); // Ajuster la taille pour s'adapter à l'hexagone agrandi
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(h);
        frame.setVisible(true);
    }
}
