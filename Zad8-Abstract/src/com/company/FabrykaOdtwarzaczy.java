package com.company;

public class FabrykaOdtwarzaczy {


    public OdtwarzaczWideo zwrocOdtwarzaczWideo(String nazwaPliku) {
        if (nazwaPliku.endsWith(".mp4")) {
            OdtwarzaczMP4 odtwarzaczMP4 = new OdtwarzaczMP4();
            return odtwarzaczMP4;
        } else if (nazwaPliku.endsWith(".avi")) {
            OdtwarzaczAVI odtwarzaczAVI = new OdtwarzaczAVI();
            return odtwarzaczAVI;
        } else { return null; }
    }
}
