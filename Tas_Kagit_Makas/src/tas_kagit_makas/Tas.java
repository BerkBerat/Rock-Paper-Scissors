package tas_kagit_makas;

import static tas_kagit_makas.Oyun.nesne0butonuDeger;
import static tas_kagit_makas.Oyun.nesne1butonuDeger;
import static tas_kagit_makas.Oyun.nesne2butonuDeger;
import static tas_kagit_makas.Oyun.nesne3butonuDeger;
import static tas_kagit_makas.Oyun.nesne4butonuDeger;
import static tas_kagit_makas.Oyun.tas2;

public class Tas extends Nesne {

    static double katilik = 2;

    public Tas() {
        super(20, 0);
        this.katilik = 2;

    }

    public Tas(double katilik) {
        super(20, 0);
        this.katilik = katilik;

    }

    @Override
    public void nesnePuaniGoster(int index, Oyuncu kullanici1) {

        if (index == 0) {
            nesne0butonuDeger.setText("Dayanıklılık: " + kullanici1.nesneListesi.get(0).getDayaniklilik());
        } else if (index == 1) {
            nesne1butonuDeger.setText("Dayanıklılık: " + kullanici1.nesneListesi.get(1).getDayaniklilik());
        } else if (index == 2) {
            nesne2butonuDeger.setText("Dayanıklılık: " + kullanici1.nesneListesi.get(2).getDayaniklilik());
        } else if (index == 3) {
            nesne3butonuDeger.setText("Dayanıklılık: " + kullanici1.nesneListesi.get(3).getDayaniklilik());
        } else if (index == 4) {
            nesne4butonuDeger.setText("Dayanıklılık: " + kullanici1.nesneListesi.get(4).getDayaniklilik());
        }

    }

    @Override
    public void durumGuncelle(Oyuncu bilgisayar1, int bilgisayarsecimiindexi, Oyuncu kullanici1, int oyuncusecimiindexi) {
        
        bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).setDayaniklilik(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getDayaniklilik() - tas2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1));
        kullanici1.nesneListesi.get(oyuncusecimiindexi).setDayaniklilik(kullanici1.nesneListesi.get(oyuncusecimiindexi).getDayaniklilik() - tas2.etkiHesapla(oyuncusecimiindexi, kullanici1));

    }

    @Override
    public double etkiHesapla(int index, Oyuncu oyuncu) {

        double j;
        switch (oyuncu.nesneListesi.get(index).getClass().getSimpleName()) {
            case "Tas":
                j = 0;
                return j;

            case "Kagit":
                j = katilik / ((1 - a) * (Kagit.nufuz));
                return j;

            case "Makas":
                j = katilik / (a * (Makas.keskinlik));
                return j;
            case "AgirTas":
                j = 2;
                return j;

            case "OzelKagit":
                j = katilik / ((1 - a) * (OzelKagit.nufuz) * (OzelKagit.kalinlik));
                return j;
            case "UstaMakas":
                j = katilik / (a * (UstaMakas.keskinlik) * (UstaMakas.direnc));
                return j;
        }
        return 0;
    }

    public double getKatilik() {
        return katilik;
    }

    public void setKatilik(double katilik) {
        this.katilik = katilik;
    }

}
