package ninjapiratestudios.trackercamera.FileContent;

import java.io.File;
import java.util.ArrayList;

import ninjapiratestudios.trackercamera.dummy.DummyContent;

/**
 * Created by benjamin on 3/15/16.
 */
public class FileContent {
    private ArrayList<FileHolder> fileContentList;

    public FileContent(){
        fileContentList = new ArrayList<>();
    }

    public FileContent(FileHolder fH){
        fileContentList = new ArrayList<>();
        this.fileContentList.add(fH);
    }

    public void addItem(FileHolder fH){
        this.fileContentList.add(fH);
    }




}
