import com.sun.scenario.effect.impl.sw.java.JSWBlend_GREENPeer;
import javafx.scene.layout.Background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {

    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_HEIGHT = 560;
    private static final int WINDOW_POS_X = 650;
    private static final int WINDOW_POS_Y = 250;

    private MainForm mainForm;
    private GameSettings gameSettingsForm;

    MainForm() {

        setTitle("Крестики Нолики");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);

        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainGameForm gameField = MainGameForm.getInstance();
        JPanel buttonPanel = new JPanel(new GridLayout());
        add(gameField, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        JButton btnStart = new JButton("Начать Новую игру!");
        JButton btnEnd = new JButton("Выход");
        buttonPanel.add(btnStart);
        buttonPanel.add(btnEnd);

        setBackground(Color.blue);
        setVisible(true);

        gameSettingsForm = new GameSettings(this);


        btnEnd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnStart.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Начать новую игру");
                gameSettingsForm.setVisible(true);
            }
        });
    }
}