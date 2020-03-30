package pingpong;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;

public class Game extends Canvas implements Runnable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static int WIDTH = 240;
    public static int HEIGHT = 120;
    public static int SCALE = 3;

    public Game() {
        this.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
    }

    public static void main(String[] args) {
        Game game = new Game();
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLocationRelativeTo(null) -> A ordem importa
        // Depois de adicionar o game, o Java precisa recalcular as dimensões
        frame.add(game);
        frame.pack();
        frame.setVisible(true);
        // Então melhor colocar as definições de localização após adicionar o game e os
        // novos calculos do Java
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void run() {

    }
}