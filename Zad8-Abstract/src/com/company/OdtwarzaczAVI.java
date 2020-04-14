package com.company;

public class OdtwarzaczAVI implements OdtwarzaczWideo {

    @Override
    public void odtwarzaj(String nazwaPliku) {
        System.out.println("odtwarzaj format avi z pliku " + nazwaPliku);
    }
}

