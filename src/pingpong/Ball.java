package pingpong;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JOptionPane;

import java.awt.Rectangle;

/**
 * Enemy
 */
public class Ball {

    public double x, y;
    public int width, height;
    public double dx, dy;
    public double speed = 1.8;
    public boolean statusGame = true;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 4;
        this.height = 4;

        int angle = new Random().nextInt(120 - 45) + 46;

        dx = Math.cos(Math.toRadians(angle));
        dy = Math.sin(Math.toRadians(angle));
    }

    public void tick() {
        if (x + dx * speed + width >= Game.WIDTH || x + dx * speed < 0)
            dx *= -1;

        if (y >= Game.HEIGHT) {
            // Ponto COMPUTADOR
            System.out.println("Ponto do inimigo!");
            if (JOptionPane.showConfirmDialog(null, "Você perdeu!!OOOOOH\nJogar de novo pequenino?", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                new Game();
                return;
            } else {
                statusGame = false;
            }

        } else if (y < 0) {
            // Ponto JOGADOR
            System.out.println("Ponto do jogador!! UHUHUUU");
            if (JOptionPane.showConfirmDialog(null, "Você venceu!! UHUUUU\nJogar de novo campeão?", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                new Game();
                return;
            } else {
                statusGame = false;
            }
        }
        Rectangle bounds = new Rectangle((int) (x + dx * speed), (int) (y + dy * speed), width, height);

        Rectangle boundsPlayer = new Rectangle(Game.player.x, Game.player.y, Game.player.width, Game.player.height);
        Rectangle boundsEnemy = new Rectangle((int) Game.enemy.x, (int) Game.enemy.y, Game.enemy.width,
                Game.enemy.height);

        if (bounds.intersects(boundsPlayer)) {
            int angle = new Random().nextInt(120 - 45) + 46;

            dx = Math.cos(Math.toRadians(angle));
            dy = Math.sin(Math.toRadians(angle));
            if (dy > 0)
                dy *= -1;
        } else if (bounds.intersects(boundsEnemy)) {
            int angle = new Random().nextInt(120 - 45) + 46;

            dx = Math.cos(Math.toRadians(angle));
            dy = Math.sin(Math.toRadians(angle));

            if (dy < 0)
                dy *= -1;
        }
        x += (dx) * speed;
        y += (dy) * speed;

    }

    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect((int) x, (int) y, width, height);
    }
}