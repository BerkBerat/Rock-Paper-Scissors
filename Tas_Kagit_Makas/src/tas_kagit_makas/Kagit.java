package tas_kagit_makas;

import static tas_kagit_makas.Oyun.kagit2;
import static tas_kagit_makas.Oyun.nesne0butonuDeger;
import static tas_kagit_makas.Oyun.nesne1butonuDeger;
import static tas_kagit_makas.Oyun.nesne2butonuDeger;
import static tas_kagit_makas.Oyun.nesne3butonuDeger;
import static tas_kagit_makas.Oyun.nesne4butonuDeger;

public class Kagit extends Nesne {

    static double nufuz = 2;

    public Kagit() {
        super(20, 0);
        this.nufuz = 2;
    }

    public Kagit(double nufuz) {
        super(20, 0);
        this.nufuz = nufuz;
    }

    @Override
    public void durumGuncelle(Oyuncu bilgisayar1, int bilgisayarsecimiindexi, Oyuncu kullanici1, int oyuncusecimiindexi) {
        
        bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).setDayaniklilik(bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).getDayaniklilik() - kagit2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1));
        kullanici1.nesneListesi.get(oyuncusecimiindexi).setDayaniklilik(kullanici1.nesneListesi.get(oyuncusecimiindexi).getDayaniklilik() - kagit2.etkiHesapla(oyuncusecimiindexi, kullanici1));

        if (kagit2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1) > kagit2.etkiHesapla(oyuncusecimiindexi, kullanici1)) {
            kullanici1.nesneListesi.get(oyuncusecimiindexi).seviyePuani += 20;

        } else if (kagit2.etkiHesapla(bilgisayarsecimiindexi, bilgisayar1) < kagit2.etkiHesapla(oyuncusecimiindexi, kullanici1)) {
            bilgisayar1.nesneListesi.get(bilgisayarsecimiindexi).seviyePuani += 20;
        }
    }

    @Override
    public double etkiHesapla(int index, Oyuncu oyuncu) {
        double j;
        switch (oyuncu.nesneListesi.get(index).getClass().getSimpleName()) {
            case "Tas":
                j = nufuz / (a * (Tas.katilik));
                return j;
            case "Kagit":
                j = 0;
                return j;
            case "Makas":
                j = nufuz / ((1 - a) * (Makas.keskinlik));
                return j;
            case "AgirTas":
                j = nufuz / (a * (AgirTas.katilik) * (AgirTas.sicaklik));
                return j;
            case "OzelKagit":
                j = 2;
                return j;
            case "UstaMakas":
                j = nufuz / ((1 - a) * (UstaMakas.keskinlik) * (UstaMakas.direnc));
                return j;
        }

        return 0;
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

    public static double getNufuz() {
        return nufuz;
    }

    public static void setNufuz(double nufuz) {
        Kagit.nufuz = nufuz;
    }
}
