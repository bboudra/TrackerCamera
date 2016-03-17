package com.ninjapiratestudios.trackercamera.fileContent;
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

    public void addItem(FileHolder fH){
        this.fileContentList.add(fH);
        Collections.sort(fileContentList);
    }
}
