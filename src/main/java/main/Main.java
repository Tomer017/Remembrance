package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static BufferedImage loadIcon() {
        File file = new File("src/main/resources/icon.png");
        BufferedImage image;
        {
            try {
                image = ImageIO.read((file));
                System.out.println("Icon read");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return image;
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Remembrance");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        GamePanel gamePanel = new GamePanel();

        window.add(gamePanel);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setSize(800, 600);
        window.setVisible(true);

        window.setIconImage(loadIcon());
    }
}
