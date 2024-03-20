package affichage;
import java.awt.*;
import javax.swing.*;
public class GrilleJeu extends JFrame{
    private JPanel grillePanel;
    private JButton[][] boutons;

    public GrilleJeu() {
        // Configuration de la fenêtre principale
        setTitle("Grille de jeu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Initialisation de la grille
        grillePanel = new JPanel();
        grillePanel.setLayout(new GridLayout(6, 7));
        boutons = new JButton[6][7];

        // Création des boutons et ajout à la grille
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                boutons[i][j] = new JButton();
                grillePanel.add(boutons[i][j]);
            }
        }

        // Ajout de la grille à la fenêtre principale
        add(grillePanel, BorderLayout.CENTER);

        // Affichage de la fenêtre
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GrilleJeu();
            }
        });
    }
}
