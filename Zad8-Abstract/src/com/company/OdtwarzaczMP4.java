package com.company;

public class OdtwarzaczMP4 implements OdtwarzaczWideo {
    @Override
    public void odtwarzaj(String nazwaPliku) {
        System.out.println("odtwarzaj format mp4 z pliku " + nazwaPliku);
    }

}
