package tas_kagit_makas;

public abstract class Nesne {

    public double dayaniklilik=20;
    public double seviyePuani=0;
    public double a=0.2;
    
    public Nesne() {

        this.dayaniklilik = 20;
        this.seviyePuani = 0;
        this.a=0.2;
    }

    public Nesne(double dayaniklilik, double seviyePuani) {

        this.dayaniklilik = dayaniklilik;
        this.seviyePuani = seviyePuani;
    }

    abstract void nesnePuaniGoster(int index, Oyuncu oyuncu);

    abstract double etkiHesapla(int index, Oyuncu oyuncu);

    abstract void durumGuncelle(Oyuncu bilgisayar1, int bilgisayarsecimiindexi, Oyuncu kullanici1, int oyuncusecimiindexi);

    public double getDayaniklilik() {
        return dayaniklilik;
    }

    public void setDayaniklilik(double dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }

    public double getSeviyePuani() {
        return seviyePuani;
    }

    public void setSeviyePuani(double seviyePuani) {
        this.seviyePuani = seviyePuani;
    }

    
    
}
