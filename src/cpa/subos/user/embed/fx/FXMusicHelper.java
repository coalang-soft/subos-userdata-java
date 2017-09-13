package cpa.subos.user.embed.fx;

import cpa.subos.io.file.FileExtensionFilter;
import cpa.subos.io.file.FileFilters;
import cpa.subos.user.MusicStorage;
import cpa.subos.user.dataaccess.files.DirectoryReadDataAccessor;
import javafx.scene.media.Media;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class FXMusicHelper {

    public static List<Media> convert(DirectoryReadDataAccessor music){
        ArrayList<Media> res = new ArrayList<>();
        FileExtensionFilter filter = FileFilters.AUDIO;
        for(int i = 0; i < music.length(); i++){
            if(filter.call(music.get(i))){
                try {
                    res.add(new Media(music.get(i).toUrl()));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }

}
