import java.io.*;

public class searchAndFilter {
    private static void searchMusicFIles(String directoryPath) {
        File directory = new File(directoryPath);

        if(directory.isDirectory()) {
            FileFilter musicFilesFilter = file -> {
                String fileName = file.getName().toLowerCase();
                return fileName.endsWith(".flac") || fileName.endsWith("mp3") || fileName.endsWith(".wav");
            };

            File[] musicFiles = directory.listFiles(musicFilesFilter);
            if(musicFiles != null) {
                for(File musicFile : musicFiles) {
                    System.out.println("Found music files: " + musicFile.getAbsolutePath());
                }
            } else {
                System.out.println("Music files not found in the directory: ");
            }

        } else {
            System.out.println("Invalid file path: ");
        }
    }
}
