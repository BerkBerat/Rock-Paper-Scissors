package tas_kagit_makas;

import static tas_kagit_makas.Oyun.kullanici1;
import static tas_kagit_makas.Oyun.nesne0butonuDeger;
import static tas_kagit_makas.Oyun.nesne1butonuDeger;
import static tas_kagit_makas.Oyun.nesne2butonuDeger;
import static tas_kagit_makas.Oyun.nesne3butonuDeger;
import static tas_kagit_makas.Oyun.nesne4butonuDeger;
import static tas_kagit_makas.Oyun.ozelkagit2;

public class OzelKagit extends Kagit {

    public static double kalinlik = 2;

    public OzelKagit() {
        super(2);
        this.kalinlik = 2;
    }

    public OzelKagit(double kalinlik) {
        super(2);
        this.kalinlik = kalinlik;
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

    @Override
    public double etkiHesapla(int index, Oyuncu oyuncu) {
        double j;
        if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("Tas")) {
            j = (nufuz * kalinlik) / (a * (Tas.katilik));
            return j;
        } else if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("Kagit")) {
            return 2;
        } else if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("Makas")) {
            j = (nufuz * kalinlik) / ((1 - a) * (Makas.keskinlik));
            return j;
        } else if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("AgirTas")) {
            j = (nufuz * kalinlik) / (a * (AgirTas.katilik) * (AgirTas.sicaklik));
            return j;
        } else if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("OzelKagit")) {
            return 0;
        } else if (Oyun.bilgisayar1.nesneListesi.get(index).getClass().getSimpleName().equals("UstaMakas")) {
            j = (nufuz * kalinlik) / ((1 - a) * (UstaMakas.keskinlik) * (UstaMakas.direnc));
            return j;
        }

        return 0;
    }

    @Override
    public void durumGuncelle(Oyuncu bilgisayar1, int bilgisayarsecimiindexi, Oyuncu kullanici1, int oyuncusecimiindexi) {

        bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).setDayaniklilik(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getDayaniklilik() - ozelkagit2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1));
        kullanici1.nesneListesi.get(oyuncusecimiindexi).setDayaniklilik(kullanici1.nesneListesi.get(oyuncusecimiindexi).getDayaniklilik() - ozelkagit2.etkiHesapla(oyuncusecimiindexi, kullanici1));

        if (ozelkagit2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1) > ozelkagit2.etkiHesapla(oyuncusecimiindexi, kullanici1)) {
            kullanici1.nesneListesi.get(oyuncusecimiindexi).seviyePuani += 20;

        } else if (ozelkagit2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1) < ozelkagit2.etkiHesapla(oyuncusecimiindexi, kullanici1)) {
            bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).seviyePuani += 20;
        }
    }

    public double getKalinlik() {
        return kalinlik;
    }

    public void setKalinlik(double kalinlik) {
        this.kalinlik = kalinlik;
    }

}
