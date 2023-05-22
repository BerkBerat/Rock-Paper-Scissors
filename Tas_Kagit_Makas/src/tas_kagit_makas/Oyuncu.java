package tas_kagit_makas;

import java.util.ArrayList;

public abstract class Oyuncu {

    public String oyuncuAdi;
    public int skor;
    public String oyuncuID;
    public ArrayList <Nesne> nesneListesi = new ArrayList <Nesne>();

    public Oyuncu(String oyuncuID, String oyuncuAdi, int skor) {

        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    public Oyuncu() {
        this("yok","yok",0);
    }

    public void SkorGoster() {

    }

    public abstract int nesneSec();

}
