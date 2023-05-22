package tas_kagit_makas;

import java.util.Random;

public class Bilgisayar extends Oyuncu {

    public Bilgisayar(String oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;

    }

    public Bilgisayar() {
        this("yok", "yok", 0);
    }

    @Override
    public int nesneSec() {

        int j = (int) (Math.random() * 5);
        return j;
    }
}
