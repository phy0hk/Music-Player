import javax.sound.sampled.*;
import java.io.File;


public class function {
    static File musicFile = new File("Sample song");
    public static void main(String[] args){

        String[] songs = new String[musicFile.list().length];
        songs = musicFile.list();
    }
}
