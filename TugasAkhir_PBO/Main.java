package TugasAkhir_PBO;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Selamat Datang Di Jasa Ekspedisi Jawa Ekspress");
        JFrame frame = new JFrame( "Jawa Ekspress");
        frame.setContentPane(new Masuk().panelMasuk);
        frame.setSize(800,800);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    };
}
