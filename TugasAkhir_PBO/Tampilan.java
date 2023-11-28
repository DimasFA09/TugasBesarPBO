package TugasAkhir_PBO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tampilan extends Masuk {
    private JTextField NoResiText;
    private JTextField NamaPengirimText;
    private JTextField AlamatTujuanText;
    private JTextField KecamatanText;
    private JTextField KodePosText;
    private JTextField TotalText;
    private JComboBox KotaTujuanCombo;
    private JTextField AlamatPengirimText;
    private JTextField NamaPenerimaText;
    private JTextField NoHppenerimaText;
    private JRadioButton Berat1;
    private JRadioButton Berat2;
    private JRadioButton Berat3;
    private JRadioButton regulerRB;
    private JRadioButton expressRB;
    private JButton hitungButton;
    private JTextField HBerat;
    private JTextField HKelas;
    private JTextField JmlhBarang;
    private JButton hapusButton;
    private JButton bayarButton;
    public JPanel PanelTampil;
    private JButton keluarButton;
    private JLabel EmailPenerima;
    private JTextField JmlhTunai;
    private JTextField KembalianText;
    private JTextArea Hasil;
    private JButton simpanButton;
    private JTextField EmailPenerimaText;
    private JLabel strukLabel;

    public Tampilan() {
        Berat1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Berat1.isSelected()){
                    HBerat.setText("10000");
                }
            }
        });
        Berat3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Berat3.isSelected()){
                    HBerat.setText("25000");
                }
            }
        });
        Berat2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Berat2.isSelected()){
                    HBerat.setText("55000");
                }
            }
        });
        regulerRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(KotaTujuanCombo.getSelectedItem().equals("Semarang")){
                    HKelas.setText("3000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Demak")){
                    HKelas.setText("3000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Gubug")){
                    HKelas.setText("3000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Godong")){
                    HKelas.setText("5000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Purwodadi")){
                    HKelas.setText("5000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Blora")){
                    HKelas.setText("5000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Pati")){
                    HKelas.setText("5000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Solo")){
                    HKelas.setText("5000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Pemalang")) {
                    HKelas.setText("6000");
                }
            }
        });
        expressRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(KotaTujuanCombo.getSelectedItem().equals("Semarang")){
                    HKelas.setText("5000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Demak")){
                    HKelas.setText("5000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Gubug")){
                    HKelas.setText("5000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Godong")){
                    HKelas.setText("8000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Purwodadi")){
                    HKelas.setText("8000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Blora")){
                    HKelas.setText("8000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Pati")){
                    HKelas.setText("8000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Solo")){
                    HKelas.setText("9000");
                }if (KotaTujuanCombo.getSelectedItem().equals("Pemalang")) {
                    HKelas.setText("10000");
                }
            }
        });
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(JmlhBarang.getText());
                int b = Integer.parseInt(HKelas.getText());
                int c = Integer.parseInt(HBerat.getText());
                int hasil = (b+c)*a;
                TotalText.setText(String.valueOf(hasil));
            }
        });
        hapusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NoResiText.setText(null);
                NamaPengirimText.setText(null);
                AlamatPengirimText.setText(null);
                NamaPenerimaText.setText(null);
                EmailPenerimaText.setText(null);
                AlamatTujuanText.setText(null);
                KecamatanText.setText(null);
                KodePosText.setText(null);
                NoHppenerimaText.setText(null);
                JmlhBarang.setText(null);
                HKelas.setText(null);
                HBerat.setText(null);
                TotalText.setText(null);
                JmlhTunai.setText(null);
                KembalianText.setText(null);
                Hasil.setText(null);
            }
        });
        bayarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = Integer.parseInt(TotalText.getText());
                int Tunai = Integer.parseInt(JmlhTunai.getText());
                int kb = Tunai-total;
                KembalianText.setText(String.valueOf(kb));
                JOptionPane.showMessageDialog(null,"Transaksi Berhasil");
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(regulerRB.isSelected()){
                Hasil.setText("\n Pengiriman paket "+regulerRB.getText()+" dengan Nomor Resi : "+NoResiText.getText()+"\n Nama Pengirim : "
                        +NamaPengirimText.getText()+"\n Alamat Pengirim : "+AlamatPengirimText.getText()+"\n Nama Penerima"
                        +NamaPenerimaText.getText()+"\n Alamat Penerima : "+AlamatTujuanText.getText()+" "
                        +KotaTujuanCombo.getSelectedItem()+"\n Kecamatan "
                        +KecamatanText.getText()+"\n Kode Pos "+KodePosText.getText()+"\n Nomor HP Penerima : "+NoHppenerimaText.getText()+
                        "\n Alamat email : "+EmailPenerimaText.getText());
                }
                if(expressRB.isSelected()){
                    Hasil.setText("\n Pengiriman paket "+expressRB.getText()+" dengan Nomor Resi : "+NoResiText.getText()+"\n Nama Pengirim : "
                            +NamaPengirimText.getText()+"\n Alamat Pengirim : "+AlamatPengirimText.getText()+"\n Nama Penerima"
                            +NamaPenerimaText.getText()+"\n Alamat Penerima : "+AlamatTujuanText.getText()+" "
                            +KotaTujuanCombo.getSelectedItem()+"\n Kecamatan "
                            +KecamatanText.getText()+"\n Kode Pos "+KodePosText.getText()+"\n Nomor HP Penerima : "+NoHppenerimaText.getText()+
                            "\n Alamat email : "+EmailPenerimaText.getText());
                }
            }
        });
    }

}
