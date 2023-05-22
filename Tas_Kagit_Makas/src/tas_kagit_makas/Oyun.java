package tas_kagit_makas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static tas_kagit_makas.Oyun.bilgisayarVSbilgisayar;

public class Oyun {

    static int sayac = 0;
    static boolean kontrol = true;
    static Kullanici kullanici1 = new Kullanici();
    static Bilgisayar bilgisayar1 = new Bilgisayar();
    static Bilgisayar bilgisayar2 = new Bilgisayar();
    static int oyuncusecimiindexi;
    static int bilgisayarsecimiindexi;
    static JLabel bilgisayarsecimilabel = new JLabel();
    static JFrame oyunekrani = new JFrame();
    static JLabel nesne0butonuDeger = new JLabel();
    static JLabel nesne1butonuDeger = new JLabel();
    static JLabel nesne2butonuDeger = new JLabel();
    static JLabel nesne3butonuDeger = new JLabel();
    static JLabel nesne4butonuDeger = new JLabel();
    static Tas tas2 = new Tas();
    static Kagit kagit2 = new Kagit();
    static Makas makas2 = new Makas();
    static AgirTas agirtas2 = new AgirTas();
    static UstaMakas ustamakas2 = new UstaMakas();
    static OzelKagit ozelkagit2 = new OzelKagit();
    static JLabel nesne0butonuSeviyePuani = new JLabel();
    static JLabel nesne1butonuSeviyePuani = new JLabel();
    static JLabel nesne2butonuSeviyePuani = new JLabel();
    static JLabel nesne3butonuSeviyePuani = new JLabel();
    static JLabel nesne4butonuSeviyePuani = new JLabel();
    static JButton nesne0butonu = new JButton();
    static JButton nesne1butonu = new JButton();
    static JButton nesne2butonu = new JButton();
    static JButton nesne3butonu = new JButton();
    static JButton nesne4butonu = new JButton();
    static JButton oynaButonu = new JButton();
    static ArrayList<Integer> bilgisayarsecimiaraligi = new ArrayList<Integer>();
    static int hamle = 0;
    static JFrame sonucekrani = new JFrame();

    public static void sonucEkrani() {

        sonucekrani.setBounds(600, 250, 300, 300);
        sonucekrani.setVisible(true);
    }

    public static void oyunEkrani() {

        JPanel nesnePaneli = new JPanel();

        nesnePaneli.setBounds(1200, 0, 300, 500);
        oyunekrani.add(nesnePaneli);
        nesnePaneli.setBackground(new Color(255, 218, 185));

        nesne0butonu.setText(kullanici1.nesneListesi.get(0).getClass().getSimpleName());
        nesne1butonu.setText(kullanici1.nesneListesi.get(1).getClass().getSimpleName());
        nesne2butonu.setText(kullanici1.nesneListesi.get(2).getClass().getSimpleName());
        nesne3butonu.setText(kullanici1.nesneListesi.get(3).getClass().getSimpleName());
        nesne4butonu.setText(kullanici1.nesneListesi.get(4).getClass().getSimpleName());
        oynaButonu.setText("OYNA");

        nesne0butonuDeger.setBounds(150, 10, 100, 50);
        nesnePaneli.add(nesne0butonuDeger);

        nesne1butonuDeger.setBounds(150, 80, 100, 50);
        nesnePaneli.add(nesne1butonuDeger);

        nesne2butonuDeger.setBounds(150, 150, 100, 50);
        nesnePaneli.add(nesne2butonuDeger);

        nesne3butonuDeger.setBounds(150, 220, 100, 50);
        nesnePaneli.add(nesne3butonuDeger);

        nesne4butonuDeger.setBounds(150, 290, 100, 50);
        nesnePaneli.add(nesne4butonuDeger);

        nesne0butonuSeviyePuani.setBounds(130, 25, 150, 50);
        nesnePaneli.add(nesne0butonuSeviyePuani);

        nesne1butonuSeviyePuani.setBounds(130, 95, 150, 50);
        nesnePaneli.add(nesne1butonuSeviyePuani);

        nesne2butonuSeviyePuani.setBounds(130, 165, 150, 50);
        nesnePaneli.add(nesne2butonuSeviyePuani);

        nesne3butonuSeviyePuani.setBounds(130, 235, 150, 50);
        nesnePaneli.add(nesne3butonuSeviyePuani);

        nesne4butonuSeviyePuani.setBounds(130, 305, 150, 50);
        nesnePaneli.add(nesne4butonuSeviyePuani);

        nesnePaneli.add(nesne0butonu);
        nesne0butonu.setBounds(20, 20, 100, 50);

        nesnePaneli.add(nesne1butonu);
        nesne1butonu.setBounds(20, 90, 100, 50);

        nesnePaneli.add(nesne2butonu);
        nesne2butonu.setBounds(20, 160, 100, 50);

        nesnePaneli.add(nesne3butonu);
        nesne3butonu.setBounds(20, 230, 100, 50);

        nesnePaneli.add(nesne4butonu);
        nesne4butonu.setBounds(20, 300, 100, 50);

        oyunekrani.add(oynaButonu);
        oynaButonu.setBounds(550, 400, 100, 50);

        nesnePaneli.setLayout(null);
        JLabel oyuncusecimilabel = new JLabel();

        oyuncusecimilabel.setBounds(900, 100, 200, 150);
        oyuncusecimilabel.setFont(new Font("Times New Roman", Font.BOLD, 25));

        nesne0butonu.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                oyuncusecimiindexi = 0;
                oyunekrani.add(oyuncusecimilabel);
                oyuncusecimilabel.setText(kullanici1.nesneListesi.get(0).getClass().getSimpleName());
            }
        });

        nesne1butonu.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                oyuncusecimiindexi = 1;
                oyunekrani.add(oyuncusecimilabel);
                oyuncusecimilabel.setText(kullanici1.nesneListesi.get(1).getClass().getSimpleName());
            }
        });

        nesne2butonu.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ex) {

                oyuncusecimiindexi = 2;
                oyunekrani.add(oyuncusecimilabel);
                oyuncusecimilabel.setText(kullanici1.nesneListesi.get(2).getClass().getSimpleName());
            }
        });

        nesne3butonu.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent exc) {

                oyuncusecimiindexi = 3;
                oyunekrani.add(oyuncusecimilabel);
                oyuncusecimilabel.setText(kullanici1.nesneListesi.get(3).getClass().getSimpleName());
            }
        });

        nesne4butonu.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent excv) {

                oyuncusecimiindexi = 4;
                oyunekrani.add(oyuncusecimilabel);
                oyuncusecimilabel.setText(kullanici1.nesneListesi.get(4).getClass().getSimpleName());
            }
        });

        oynaButonu.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent excb) {

                oynaButonunaBas();
                hamle = hamle + 1;
                if (hamle == 10) {
                    oyunekrani.setVisible(false);
                    sonucEkrani();
                }
            }
        });

        oyunekrani.getContentPane().setBackground(new Color(210, 180, 140));
        oyunekrani.setSize(1500, 500);
        oyunekrani.setResizable(false);
        oyunekrani.setLayout(null);
        oyunekrani.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        oyunekrani.setVisible(true);
    }

    public static void oyunEkraniBilgisayar() {

        JFrame oyunEkraniBilgisayar = new JFrame("OYUN EKRANI");
        oynaButonu.setText("OYNA");
        oyunEkraniBilgisayar.add(oynaButonu);
        oynaButonu.setBounds(550, 400, 100, 50);

        oyunEkraniBilgisayar.getContentPane().setBackground(new Color(210, 180, 140));
        oyunEkraniBilgisayar.setSize(1000, 500);
        oyunEkraniBilgisayar.setResizable(false);
        oyunEkraniBilgisayar.setLayout(null);
        oyunEkraniBilgisayar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        oyunEkraniBilgisayar.setVisible(true);

    }

    public static void oynaButonunaBas() {

        bilgisayarsecimiindexi = bilgisayar1.nesneSec();
        oyunekrani.add(bilgisayarsecimilabel);
        bilgisayarsecimilabel.setText(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getClass().getSimpleName());
        bilgisayarsecimilabel.setBounds(300, 100, 200, 150);
        bilgisayarsecimilabel.setFont(new Font("Times New Roman", Font.BOLD, 25));

        System.out.println(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getClass().getSimpleName());
        switch (kullanici1.nesneListesi.get(oyuncusecimiindexi).getClass().getSimpleName()) {
            case "Tas":
                
                tas2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
                System.out.println(tas2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1));
                break;

            case "Kagit":
                
                kagit2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
                System.out.println(kagit2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1));
                break;

            case "Makas":
                
                makas2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
                System.out.println(makas2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1));
                break;

            case "AgirTas":

                agirtas2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
                System.out.println(agirtas2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1));
                break;

            case "OzelKagit":

                ozelkagit2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
                System.out.println(ozelkagit2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1));
                break;

            case "UstaMakas":

                ustamakas2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
                System.out.println(ustamakas2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1));
                break;

        }

        System.out.println(kullanici1.nesneListesi.get(oyuncusecimiindexi).getClass().getSimpleName());

        if (bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getClass().getSimpleName().equals("Tas")) {

            tas2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
            System.out.println(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getDayaniklilik());

        } else if (bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getClass().getSimpleName().equals("Kagit")) {

            kagit2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
            System.out.println(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getDayaniklilik());

        } else if (bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getClass().getSimpleName().equals("Makas")) {

            makas2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
            System.out.println(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getDayaniklilik());

        } else if (bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getClass().getSimpleName().equals("AgirTas")) {

            agirtas2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
            System.out.println(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getDayaniklilik());

        } else if (bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getClass().getSimpleName().equals("OzelKagit")) {

            ozelkagit2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
            System.out.println(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getDayaniklilik());

        } else if (bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getClass().getSimpleName().equals("UstaMakas")) {

            ustamakas2.durumGuncelle(bilgisayar1, bilgisayarsecimiindexi, kullanici1, oyuncusecimiindexi);
            System.out.println(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getDayaniklilik());

        }

        nesne0butonuDeger.setText("Dayanıklılık: " + kullanici1.nesneListesi.get(0).getDayaniklilik());
        nesne1butonuDeger.setText("Dayanıklılık: " + kullanici1.nesneListesi.get(1).getDayaniklilik());
        nesne2butonuDeger.setText("Dayanıklılık: " + kullanici1.nesneListesi.get(2).getDayaniklilik());
        nesne3butonuDeger.setText("Dayanıklılık: " + kullanici1.nesneListesi.get(3).getDayaniklilik());
        nesne4butonuDeger.setText("Dayanıklılık: " + kullanici1.nesneListesi.get(4).getDayaniklilik());

        nesne0butonuSeviyePuani.setText("Seviye Puanı: " + kullanici1.nesneListesi.get(0).getSeviyePuani());
        nesne1butonuSeviyePuani.setText("Seviye Puanı: " + kullanici1.nesneListesi.get(1).getSeviyePuani());
        nesne2butonuSeviyePuani.setText("Seviye Puanı: " + kullanici1.nesneListesi.get(2).getSeviyePuani());
        nesne3butonuSeviyePuani.setText("Seviye Puanı: " + kullanici1.nesneListesi.get(3).getSeviyePuani());
        nesne4butonuSeviyePuani.setText("Seviye Puanı: " + kullanici1.nesneListesi.get(4).getSeviyePuani());

        if (kullanici1.nesneListesi.get(oyuncusecimiindexi).getClass().getSimpleName() == "Tas") {
            tas2.nesnePuaniGoster(oyuncusecimiindexi, kullanici1);
        } else if (kullanici1.nesneListesi.get(oyuncusecimiindexi).getClass().getSimpleName() == "Kagit") {
            kagit2.nesnePuaniGoster(oyuncusecimiindexi, kullanici1);

        } else if (kullanici1.nesneListesi.get(oyuncusecimiindexi).getClass().getSimpleName() == "Makas") {
            makas2.nesnePuaniGoster(oyuncusecimiindexi, kullanici1);

        } else if (kullanici1.nesneListesi.get(oyuncusecimiindexi).getClass().getSimpleName() == "AgirTas") {
            agirtas2.nesnePuaniGoster(oyuncusecimiindexi, kullanici1);

        } else if (kullanici1.nesneListesi.get(oyuncusecimiindexi).getClass().getSimpleName() == "OzelKagit") {
            ozelkagit2.nesnePuaniGoster(oyuncusecimiindexi, kullanici1);

        } else if (kullanici1.nesneListesi.get(oyuncusecimiindexi).getClass().getSimpleName() == "UstaMakas") {
            ustamakas2.nesnePuaniGoster(oyuncusecimiindexi, kullanici1);
        }

        if (kullanici1.nesneListesi.get(oyuncusecimiindexi).getDayaniklilik() <= 0) {
            switch (oyuncusecimiindexi) {
                case 0:
                    kullanici1.nesneListesi.get(0).setDayaniklilik(0);
                    nesne0butonu.setVisible(false);
                    nesne0butonuDeger.setVisible(false);
                    nesne0butonuSeviyePuani.setVisible(false);
                    break;
                case 1:
                    kullanici1.nesneListesi.get(1).setDayaniklilik(0);
                    nesne1butonu.setVisible(false);
                    nesne1butonuDeger.setVisible(false);
                    nesne1butonuSeviyePuani.setVisible(false);
                    break;
                case 2:
                    kullanici1.nesneListesi.get(2).setDayaniklilik(0);
                    nesne2butonu.setVisible(false);
                    nesne2butonuDeger.setVisible(false);
                    nesne2butonuSeviyePuani.setVisible(false);
                    break;
                case 3:
                    kullanici1.nesneListesi.get(3).setDayaniklilik(0);
                    nesne3butonu.setVisible(false);
                    nesne3butonuDeger.setVisible(false);
                    nesne3butonuSeviyePuani.setVisible(false);
                    break;
                case 4:
                    kullanici1.nesneListesi.get(4).setDayaniklilik(0);
                    nesne4butonu.setVisible(false);
                    nesne4butonuDeger.setVisible(false);
                    nesne4butonuSeviyePuani.setVisible(false);
                    break;
            }
        }
    }

    public static void oyunTuruSecimEkrani() {
        JFrame oyunTuruSecimi = new JFrame();
        JLabel baslik = new JLabel("TAŞ KAĞIT MAKAS");
        JButton bilgisayarvskullanici = new JButton("Bilgisayar vs Kullanıcı");
        JButton bilgisayarvsbilgisayar = new JButton("Bilgisayar vs Bilgisayar");

        baslik.setBounds(350, 50, 500, 40);
        oyunTuruSecimi.add(baslik);
        baslik.setForeground(new Color(210, 105, 30));
        baslik.setFont(new Font("Times New Roman", Font.BOLD, 36));

        bilgisayarvskullanici.setBounds(100, 200, 300, 200);
        oyunTuruSecimi.add(bilgisayarvskullanici);
        bilgisayarvskullanici.setBackground(new Color(255, 218, 185));
        bilgisayarvskullanici.setForeground(new Color(244, 164, 96));
        bilgisayarvskullanici.setFont(new Font("Times New Roman", Font.BOLD, 25));

        bilgisayarvsbilgisayar.setBounds(580, 200, 300, 200);
        oyunTuruSecimi.add(bilgisayarvsbilgisayar);
        bilgisayarvsbilgisayar.setBackground(new Color(255, 218, 185));
        bilgisayarvsbilgisayar.setForeground(new Color(244, 164, 96));
        bilgisayarvsbilgisayar.setFont(new Font("Times New Roman", Font.BOLD, 25));

        oyunTuruSecimi.getContentPane().setBackground(new Color(210, 180, 140));
        oyunTuruSecimi.setSize(1000, 500);
        oyunTuruSecimi.setResizable(false);
        oyunTuruSecimi.setLayout(null);
        oyunTuruSecimi.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        oyunTuruSecimi.setVisible(true);

        bilgisayarvskullanici.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                oyunTuruSecimi.setVisible(false);
                bilgisayarVSkullanici();

            }
        });

        bilgisayarvsbilgisayar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ex) {

                oyunTuruSecimi.setVisible(false);
                bilgisayarVSbilgisayar();
            }
        });
    }

    public static void bilgisayarVSkullanici() {

        JFrame nesneSecme = new JFrame();

        JButton tas = new JButton("TAŞ");
        JButton kagit = new JButton("KAĞIT");
        JButton makas = new JButton("MAKAS");
        JLabel baslik2 = new JLabel("5 ADET NESNE SEÇİNİZ");
        JPanel panel = new JPanel();
        
        JTextField kullaniciId = new JTextField();
        JLabel kullaniciIdLabel = new JLabel("Kullanıcı ID");
        JTextField kullaniciadi = new JTextField();
        JLabel kullaniciadiLabel = new JLabel("Kullanıcı Adı");
        JLabel a = new JLabel();

        kullaniciIdLabel.setBounds(20, 10, 100, 30);
        nesneSecme.add(kullaniciIdLabel);
        
        kullaniciId.setBounds(20, 50, 100, 30);
        nesneSecme.add(kullaniciId);
        
        kullaniciadi.setBounds(20, 130, 100, 30);
        nesneSecme.add(kullaniciadi);
        
        kullaniciadiLabel.setBounds(20, 90, 100, 30);
        nesneSecme.add(kullaniciadiLabel);
        
        nesneSecme.add(a);
            
        
        String oyuncuId = kullaniciId.getText();

        int count = 0;
        while (count < 5) {
            int j = (int) (Math.random() * 3) + 1;
            if (j == 1) {
                Tas tas1 = new Tas();
                bilgisayar1.nesneListesi.add(tas1);
            } else if (j == 2) {
                Kagit kagit1 = new Kagit();
                bilgisayar1.nesneListesi.add(kagit1);
            } else if (j == 3) {
                Makas makas1 = new Makas();
                bilgisayar1.nesneListesi.add(makas1);
            }
            count++;
        }

        tas.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if (kontrol == true) {
                    Tas tas = new Tas();
                    JLabel nesne = new JLabel("TAŞ ");
                    panel.add(nesne);
                    nesne.setFont(new Font("Times New Roman", Font.BOLD, 25));
                    panel.add(nesne);
                    kullanici1.nesneListesi.add(tas);
                    sayac++;
                    if (sayac == 5) {
                        kontrol = false;
                        nesneSecme.setVisible(false);
                        oyunEkrani();
                    }
                }
            }
        });

        kagit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ex) {

                if (kontrol == true) {
                    Kagit kagit = new Kagit();
                    JLabel nesne = new JLabel("KAĞIT ");
                    panel.add(nesne);
                    nesne.setFont(new Font("Times New Roman", Font.BOLD, 25));
                    kullanici1.nesneListesi.add(kagit);
                    sayac++;
                    if (sayac == 5) {
                        kontrol = false;
                        nesneSecme.setVisible(false);
                        oyunEkrani();
                    }
                }
            }
        });

        makas.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent exp) {

                if (kontrol == true) {

                    Makas makas = new Makas();
                    JLabel nesne = new JLabel("MAKAS ");
                    panel.add(nesne);
                    nesne.setFont(new Font("Times New Roman", Font.BOLD, 25));
                    kullanici1.nesneListesi.add(makas);
                    sayac++;
                    if (sayac == 5) {
                        kontrol = false;
                        nesneSecme.setVisible(false);
                        oyunEkrani();
                    }
                }
            }
        });

        nesneSecme.setVisible(true);
        nesneSecme.getContentPane().setBackground(new Color(210, 180, 140));
        nesneSecme.setSize(1000, 500);
        nesneSecme.setResizable(false);
        nesneSecme.setLayout(null);
        nesneSecme.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        baslik2.setBounds(350, 40, 300, 40);
        nesneSecme.add(baslik2);
        baslik2.setForeground(new Color(210, 105, 30));
        baslik2.setFont(new Font("Times New Roman", Font.BOLD, 24));

        tas.setBounds(150, 120, 180, 180);
        nesneSecme.add(tas);
        tas.setBackground(new Color(255, 218, 185));
        tas.setForeground(new Color(244, 164, 96));
        tas.setFont(new Font("Times New Roman", Font.BOLD, 25));

        makas.setBounds(650, 120, 180, 180);
        nesneSecme.add(makas);
        makas.setBackground(new Color(255, 218, 185));
        makas.setForeground(new Color(244, 164, 96));
        makas.setFont(new Font("Times New Roman", Font.BOLD, 25));

        kagit.setBounds(400, 120, 180, 180);
        nesneSecme.add(kagit);
        kagit.setBackground(new Color(255, 218, 185));
        kagit.setForeground(new Color(244, 164, 96));
        kagit.setFont(new Font("Times New Roman", Font.BOLD, 25));

        panel.setBounds(150, 350, 700, 100);
        nesneSecme.add(panel);
        panel.setBackground(new Color(255, 218, 185));

    }

    public static void bilgisayarVSbilgisayar() {

        int count = 0;
        while (count < 5) {
            int j = (int) (Math.random() * 3) + 1;
            if (j == 1) {
                Tas tas1 = new Tas();
                bilgisayar1.nesneListesi.add(tas1);
            } else if (j == 2) {
                Kagit kagit1 = new Kagit();
                bilgisayar1.nesneListesi.add(kagit1);
            } else if (j == 3) {
                Makas makas1 = new Makas();
                bilgisayar1.nesneListesi.add(makas1);
            }
            count++;
        }

        int co = 0;
        while (count < 5) {
            int j = (int) (Math.random() * 3) + 1;
            if (j == 1) {
                Tas tas1 = new Tas();
                bilgisayar2.nesneListesi.add(tas1);
            } else if (j == 2) {
                Kagit kagit1 = new Kagit();
                bilgisayar2.nesneListesi.add(kagit1);
            } else if (j == 3) {
                Makas makas1 = new Makas();
                bilgisayar2.nesneListesi.add(makas1);
            }
            co++;
        }
        oyunEkraniBilgisayar();
    }

    public static void main(String[] args) {

        oyunTuruSecimEkrani();
    }
}
