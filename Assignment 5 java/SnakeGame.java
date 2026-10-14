
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Random;

public class SnakeGame extends JPanel implements ActionListener {

    private final int TILE_SIZE = 25;
    private final int GRID_WIDTH = 20;
    private final int GRID_HEIGHT = 20;
    private final int BOARD_WIDTH = TILE_SIZE * GRID_WIDTH;
    private final int BOARD_HEIGHT = TILE_SIZE * GRID_HEIGHT;

    private LinkedList<Point> snake;
    private Point food;
    private char direction = 'R'; // U, D, L, R
    private boolean running = false;
    private Timer timer;
    private int score = 0;
    private Random random = new Random();

    public SnakeGame() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new SnakeKeyAdapter());
        startGame();
    }

    private void startGame() {
        snake = new LinkedList<>();
        snake.add(new Point(5, 5));
        snake.add(new Point(4, 5));
        snake.add(new Point(3, 5));
        direction = 'R';
        score = 0;
        spawnFood();
        running = true;
        if (timer != null) {
            timer.stop();
        }
        timer = new Timer(120, this);
        timer.start();
    }

    private void spawnFood() {
        int x, y;
        do {
            x = random.nextInt(GRID_WIDTH);
            y = random.nextInt(GRID_HEIGHT);
        } while (snake.contains(new Point(x, y)));
        food = new Point(x, y);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        if (running) {
            // Draw food
            g.setColor(Color.RED);
            g.fillOval(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

            // Draw snake
            for (int i = 0; i < snake.size(); i++) {
                Point p = snake.get(i);
                if (i == 0) {
                    g.setColor(Color.GREEN);
                } else {
                    g.setColor(new Color(0, 180, 0));
                }
                g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }

            // Draw score
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 18));
            g.drawString("Score: " + score, 10, 20);
        } else {
            gameOverScreen(g);
        }
    }

    private void gameOverScreen(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        FontMetrics metrics = getFontMetrics(g.getFont());
        String msg = "Game Over";
        g.drawString(msg, (BOARD_WIDTH - metrics.stringWidth(msg)) / 2, BOARD_HEIGHT / 2 - 20);

        g.setFont(new Font("Arial", Font.PLAIN, 18));
        String scoreMsg = "Score: " + score;
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString(scoreMsg, (BOARD_WIDTH - metrics2.stringWidth(scoreMsg)) / 2, BOARD_HEIGHT / 2 + 10);

        String restartMsg = "Press SPACE to restart";
        FontMetrics metrics3 = getFontMetrics(g.getFont());
        g.drawString(restartMsg, (BOARD_WIDTH - metrics3.stringWidth(restartMsg)) / 2, BOARD_HEIGHT / 2 + 40);
    }

    private void move() {
        Point head = snake.getFirst();
        Point newHead;

        switch (direction) {
            case 'U': newHead = new Point(head.x, head.y - 1); break;
            case 'D': newHead = new Point(head.x, head.y + 1); break;
            case 'L': newHead = new Point(head.x - 1, head.y); break;
            default:  newHead = new Point(head.x + 1, head.y); break;
        }

        // Check wall collision
        if (newHead.x < 0 || newHead.x >= GRID_WIDTH || newHead.y < 0 || newHead.y >= GRID_HEIGHT) {
            running = false;
            timer.stop();
            return;
        }

        // Check self collision
        if (snake.contains(newHead)) {
            running = false;
            timer.stop();
            return;
        }

        snake.addFirst(newHead);

        if (newHead.equals(food)) {
            score++;
            spawnFood();
        } else {
            snake.removeLast();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
        }
        repaint();
    }

    private class SnakeKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (!running && key == KeyEvent.VK_SPACE) {
                startGame();
                return;
            }

            switch (key) {
                case KeyEvent.VK_UP:
                case KeyEvent.VK_W:
                    if (direction != 'D') direction = 'U';
                    break;
                case KeyEvent.VK_DOWN:
                case KeyEvent.VK_S:
                    if (direction != 'U') direction = 'D';
                    break;
                case KeyEvent.VK_LEFT:
                case KeyEvent.VK_A:
                    if (direction != 'R') direction = 'L';
                    break;
                case KeyEvent.VK_RIGHT:
                case KeyEvent.VK_D:
                    if (direction != 'L') direction = 'R';
                    break;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame();

        frame.add(game);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        game.requestFocusInWindow();
    }
}