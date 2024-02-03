import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class function {
    static File musicFile = new File("/home/phyo/Downloads/StarWars3.wav");
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{

        
        AudioInputStream audioOut = AudioSystem.getAudioInputStream(musicFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioOut);
        System.out.println(clip.getMicrosecondLength()/1000000);
        clip.start();
        int gg = 0;
        while (gg==0) {
            Thread.sleep(clip.getMicrosecondLength());
            gg=1;
        }


    }
}
