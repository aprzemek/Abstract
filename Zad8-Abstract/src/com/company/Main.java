package com.company;

public class Main {

    public static void main(String[] args) {
        FabrykaOdtwarzaczy fabryka = new FabrykaOdtwarzaczy();
        OdtwarzaczWideo odtwarzacz = fabryka.zwrocOdtwarzaczWideo("Sample.avi");
        if (odtwarzacz != null) {
            odtwarzacz.odtwarzaj("Sample.avi");
        }
    }
}