package com.ninjapiratestudios.trackercamera.fileContent;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by benjamin on 3/15/16.
 */
public class FileContent {
    private ArrayList<FileHolder> fileContentList;

    public FileContent(){
        fileContentList = new ArrayList<>();
    }

    public FileContent(File[] files){
        for(File file:files)
        {
            fileContentList.add(new FileHolder(file));
        }
        Collections.sort(fileContentList);
    }

    public void addItem(FileHolder fH){
        this.fileContentList.add(fH);
        Collections.sort(fileContentList);
    }

    public ArrayList<FileHolder> getItems()
    {
        return fileContentList;
    }

    /**
     * Created by benjamin on 3/15/16.
     */
    public static class FileHolder implements Comparable {

        public File videoFile;

        public FileHolder(File f)
        {
            this.videoFile = f;
        }

        public File getVideoFile()
        {
            return this.videoFile;
        }

        @Override
        public int compareTo(Object another) {
            FileHolder fileToCompare = null;
            try {
                fileToCompare = (FileHolder) another;
            } catch (Exception e) {
                System.out.println("The object passed in wasn't able to be converted to a FileHolder object. \n" +
                        "Are you sure that you provided an object of type FileHolder?");
                System.exit(1);
            }
            return this.getVideoFile().getName().compareToIgnoreCase(fileToCompare.getVideoFile().getName());
        }

    }
}
