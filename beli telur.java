package com.mycompany.tumbal;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Toko Handika - Daftar Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 100);

        // Membuat panel utama
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Membuat panel atas dengan gambar
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        ImageIcon icon;
        try {
            BufferedImage image = ImageIO.read(new File("hg"));
            icon = new ImageIcon(image.getScaledInstance(500, 200, Image.SCALE_SMOOTH));
        } catch (IOException e) {
            icon = new ImageIcon();
        }

        JLabel labelAtas = new JLabel(icon);
        labelAtas.setHorizontalAlignment(JLabel.CENTER);
        topPanel.add(labelAtas, BorderLayout.CENTER);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // Membuat panel bawah dengan label dan tombol
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 1));

        // Membuat label bawah
        JLabel labelBawah1 = new JLabel("Telur Ayam adalah pilihan yang baik", SwingConstants.CENTER);
        labelBawah1.setFont(new Font("Serif", Font.BOLD, 14));
        bottomPanel.add(labelBawah1);

        JLabel labelBawah2 = new JLabel("Toko Handika menjual kualitas terbaik dengan berbagai jenis pilihan telur", SwingConstants.CENTER);
        labelBawah2.setFont(new Font("Serif", Font.BOLD, 14));
        bottomPanel.add(labelBawah2);

        // Membuat tombol
        JButton beliButton = new JButton("Beli Telur");
        beliButton.setFont(new Font("Serif", Font.BOLD, 14));
        beliButton.setPreferredSize(new Dimension(30, 25));
        beliButton.setMinimumSize(new Dimension(30, 25));
        beliButton.setMaximumSize(new Dimension(30, 25));
        
        bottomPanel.add(beliButton);

        // Membuat tombol about
        JButton aboutButton = new JButton("About");
        aboutButton.setFont(new Font("Serif", Font.BOLD, 14));
        aboutButton.setPreferredSize(new Dimension(30, 25));
        aboutButton.setMinimumSize(new Dimension(30, 25));
        aboutButton.setMaximumSize(new Dimension(30, 25));
        bottomPanel.add(aboutButton);

        mainPanel.add(bottomPanel, BorderLayout.EAST);

        // Menambahkan background warna abu-abu
        mainPanel.setBackground(new Color(204, 204, 204));

        // Menampilkan frame
        frame.setContentPane(mainPanel);
        frame.setVisible(true);
    }
    
}