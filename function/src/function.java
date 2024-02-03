import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class function {
    //music file location
    static File musicFile = new File("/file-location/music-name.wav");
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{

        //get music file frome file location
        AudioInputStream audioOut = AudioSystem.getAudioInputStream(musicFile);

        //decode the music (but only wav work)
        Clip clip = AudioSystem.getClip();
        clip.open(audioOut);

        //music length in seconds
        System.out.println(clip.getMicrosecondLength()/1000000 + "s");
        
        //start the music
        clip.start();
        int gg = 0;

        //this loop is for continuation of music because computer process the program faster than human
        while (gg==0) {
            Thread.sleep(clip.getMicrosecondLength());
            gg=1;
        }


    }
}
