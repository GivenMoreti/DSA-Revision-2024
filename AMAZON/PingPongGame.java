import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PingPongGame extends JFrame {
    private Ball ball;
    private Paddle player1, player2;
    private int player1Score = 0, player2Score = 0;

    public PingPongGame() {
        setTitle("Ping Pong Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);

        ball = new Ball(400, 300);
        player1 = new Paddle(20, 250);
        player2 = new Paddle(760, 250);

        GamePanel panel = new GamePanel();
        add(panel);
        addKeyListener(new KeyHandler());
        setVisible(true);

        Timer timer = new Timer(10, e -> {
            ball.move();
            checkCollision();
            panel.repaint();
        });
        timer.start();
    }

    private void checkCollision() {
        // Ball hits top or bottom wall
        if (ball.y <= 0 || ball.y >= 580) {
            ball.reverseY();
        }

        // Ball hits paddles
        if (ball.getBounds().intersects(player1.getBounds()) || ball.getBounds().intersects(player2.getBounds())) {
            ball.reverseX();
        }

        // Ball goes out of bounds
        if (ball.x <= 0) {
            player2Score++;
            resetGame();
        } else if (ball.x >= 800) {
            player1Score++;
            resetGame();
        }

        
    }

    private void resetGame() {
        ball.reset(400, 300);
        player1.y = 250;
        player2.y = 250;
    }

    private class GamePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.GREEN);
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.WHITE);
            g.drawLine(400, 0, 400, 600);

            // Draw scores
            g.setFont(new Font("Arial", Font.BOLD, 36));
            g.drawString(String.valueOf(player1Score), 350, 50);
            g.drawString(String.valueOf(player2Score), 420, 50);

            // Draw ball and paddles
            ball.draw(g);
            player1.draw(g);
            player2.draw(g);
        }
    }

    private class KeyHandler implements KeyListener {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_W -> player1.moveUp();
                case KeyEvent.VK_S -> player1.moveDown();
                case KeyEvent.VK_UP -> player2.moveUp();
                case KeyEvent.VK_DOWN -> player2.moveDown();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // Stop paddles when keys are released
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }
    }

    private static class Ball {
        int x, y, xSpeed = 3, ySpeed = 3, size = 20;

        public Ball(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void move() {
            x += xSpeed;
            y += ySpeed;
        }

        public void reverseX() {
            xSpeed = -xSpeed;
        }

        public void reverseY() {
            ySpeed = -ySpeed;
        }

        public void reset(int x, int y) {
            this.x = x;
            this.y = y;
            xSpeed = -xSpeed; // Alternate serve direction
        }

        public void draw(Graphics g) {
            g.fillOval(x, y, size, size);
        }

        public Rectangle getBounds() {
            return new Rectangle(x, y, size, size);
        }
    }

    private static class Paddle {
        int x, y, width = 20, height = 100, speed = 10;

        public Paddle(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void moveUp() {
            if (y > 0) {
                y -= speed;
            }
        }

        public void moveDown() {
            if (y < 500) {
                y += speed;
            }
        }

        public void draw(Graphics g) {
            g.fillRect(x, y, width, height);
        }

        public Rectangle getBounds() {
            return new Rectangle(x, y, width, height);
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(PingPongGame::new);
    }
}
