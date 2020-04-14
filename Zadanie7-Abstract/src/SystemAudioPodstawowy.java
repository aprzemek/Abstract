public abstract class SystemAudioPodstawowy implements SystemAudio,OdtwarzaczRadio{

    @Override
    public void nagrywaj() {
        System.out.printf("nagrywaj audio");
    }

    @Override
    public void odtwarzaj() {
        System.out.printf("odtwarzaj audio");
    }



}
