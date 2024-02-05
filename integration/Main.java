import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;
import java.io.IOException;
import javax.media.*;
import javax.media.Player;
import java.net.URL;

public class Main {
  private static boolean Error = false;
  private static Player play = null;
  private static String music0;

  private static void searchMusicFIles(String directoryPath) {
    File directory = new File(directoryPath);

    if (directory.isDirectory()) {
      FileFilter musicFilesFilter = file -> {
        String fileName = file.getName().toLowerCase();
        return fileName.endsWith(".flac") || fileName.endsWith("mp3") || fileName.endsWith(".wav");
      };

      File[] musicFiles = directory.listFiles(musicFilesFilter);
      if (musicFiles != null) {
        for (File musicFile : musicFiles) {
          System.out.println("Found music files: " + musicFile.getAbsolutePath());
          music0 = directory.getAbsoluteFile().toString();
        }
      } else {
        System.out.println("Music files not found in the directory: ");
      }

    } else {
      System.out.println("Invalid file path.");
      System.out.println("Exitting program...");
      Error = true;
    }
  }

  private static void playMusic(String musicInput) {
    try {
      URL url = new File(musicInput).toURL();
      play = Manager.createRealizedPlayer(url);
      play.start();
    } catch (Exception e) {

    }
  }

  public static void main(String[] args) throws InterruptedException{
    Scanner userInput = new Scanner(System.in);
    Scanner command = new Scanner(System.in);

    System.out.println("Enter the directory path: ");
    String directoryPath = userInput.nextLine();
    searchMusicFIles(directoryPath);
    if (Error) {
      return;
    }
    ;
    System.out.println();
    System.out.println("Select the command in Number: ");
    System.out.println("1. Play music");
    System.out.println("2. Pause music");
    System.out.println("3. Resume music");
    System.out.println("4. Stop music");
    System.out.println("5. Exit");
    int commandNum = command.nextInt();
    if (commandNum == 1) {
      playMusic(music0);
      boolean gg = true;
      System.out.println("Playing music");
      while(gg){
        Thread.sleep(60000);
        gg = false;
      }
    }

  }

}