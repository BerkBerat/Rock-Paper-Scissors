package tas_kagit_makas;

import static tas_kagit_makas.Oyun.agirtas2;
import static tas_kagit_makas.Oyun.kullanici1;
import static tas_kagit_makas.Oyun.nesne0butonuDeger;
import static tas_kagit_makas.Oyun.nesne1butonuDeger;
import static tas_kagit_makas.Oyun.nesne2butonuDeger;
import static tas_kagit_makas.Oyun.nesne3butonuDeger;
import static tas_kagit_makas.Oyun.nesne4butonuDeger;

public class AgirTas extends Tas {

    static double sicaklik = 2;

    public AgirTas() {
        super(2);
        this.sicaklik = 2;
    }

    public AgirTas(double sicaklik) {
        super(2);
        this.sicaklik = sicaklik;
    }

    @Override
    public double etkiHesapla(int index, Oyuncu oyuncu) {
        double j;
        if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("Tas")) {
            return 2;
        } else if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("Kagit")) {
            j = (katilik * sicaklik) / ((1 - a) * (Kagit.nufuz));
            return j;
        } else if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("Makas")) {
            j = (katilik * sicaklik) / (a * (Makas.keskinlik));
            return j;
        } else if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("AgirTas")) {
            j = 0;
            return j;

        } else if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("OzelKagit")) {
            j = (katilik * sicaklik) / ((1 - a) * (OzelKagit.nufuz) * (OzelKagit.kalinlik));
            return j;
        } else if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("UstaMakas")) {
            j = (katilik * sicaklik) / (a * (UstaMakas.keskinlik) * (UstaMakas.direnc));
            return j;
        }

        return 0;
    }

    @Override
    public void durumGuncelle(Oyuncu bilgisayar1, int bilgisayarsecimiindexi, Oyuncu kullanici1, int oyuncusecimiindexi) {

        bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).setDayaniklilik(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getDayaniklilik() - agirtas2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1));
        kullanici1.nesneListesi.get(oyuncusecimiindexi).setDayaniklilik(kullanici1.nesneListesi.get(oyuncusecimiindexi).getDayaniklilik() - agirtas2.etkiHesapla(oyuncusecimiindexi, kullanici1));

    }

    @Override
    public void nesnePuaniGoster(int index, Oyuncu oyuncu) {

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

    public double getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(double sicaklik) {
        this.sicaklik = sicaklik;
    }

}
