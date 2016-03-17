package com.ninjapiratestudios.trackercamera.fileContent;
import java.io.File;

/**
 * Created by benjamin on 3/15/16.
 */
public class FileHolder implements Comparable {

    private File videoFile;
    private Integer location;

    public FileHolder(File f, Integer loc)
    {
        this.videoFile = f;
        this.location = loc;
    }

    public File getVideoFile()
    {
        return this.videoFile;
    }

    public Integer getVideoLocation()
    {
        return this.location;
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
