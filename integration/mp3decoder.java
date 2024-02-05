import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class mp3decoder {
  public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
    File file = new File("Sample Song/Amazing.mp3");
  AudioInputStream mp3in = AudioSystem.getAudioInputStream(file);
  AudioInputStream mp3d = null;
  AudioFormat format = mp3in.getFormat();
  AudioFormat decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,format.getSampleRate(),16,format.getChannels(),format.getChannels()*2,format.getSampleRate(),false);
  mp3d = AudioSystem.getAudioInputStream(decodedFormat,mp3in);
  Clip clip = AudioSystem.getClip();
  clip.open(mp3d);
  clip.start();
boolean flag = true;
while(flag){
  System.out.print(".");
}
  }
}
