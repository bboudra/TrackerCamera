package ninjapiratestudios.trackercamera.FileContent;

import java.io.File;

/**
 * Created by benjamin on 3/15/16.
 */
public class FileHolder {

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
}
