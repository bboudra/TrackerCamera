package com.ninjapiratestudios.trackercamera.fileContent;
import android.provider.MediaStore;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by benjamin on 3/15/16.
 */
public class FileContent {
    private ArrayList<FileHolder> fileContentList;

    public FileContent(){
        fileContentList = new ArrayList<>();
    }
    public FileContent(File[] files){
        fileContentList = new ArrayList<>();
        Log.d("FileLength", new Integer(files.length).toString());
        for(File file:files)
        {
            Log.d("Exists",new Boolean(file.exists()).toString());
            Log.d("FileName", file.getName());
            Log.d("FileContents",file.toString());
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
    public class FileHolder implements Comparable {

        public final String id;
        public final String content;
        public final File videoFile;
        public FileHolder(File f)
        {
            this.id = f.getAbsolutePath();
            this.content = f.getName();
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
