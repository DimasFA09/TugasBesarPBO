package TugasAkhir_PBO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Masuk extends Main{
    private JTextField UsernameText;
    private JPasswordField PasswordText;
    private JButton loginButton;
    private JButton exitButton;
    public JPanel panelMasuk;

    public Masuk() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(UsernameText.getText().equals("Admin")){
                    if(PasswordText.getText().equals("123")){
                        JFrame frame = new JFrame("Jawa Ekspress");
                        frame.setContentPane(new Tampilan().PanelTampil);
                        frame.setSize(150,500);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.pack();
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);

                    }else{
                        JOptionPane.showMessageDialog(null,"Password salah, Silahkan Ulangi");
                        PasswordText.setText("");
                        PasswordText.requestFocus();
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Username salah, Silahkan Ulangi");
                    UsernameText.setText("");
                    PasswordText.setText("");
                    UsernameText.requestFocus();
                }
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
