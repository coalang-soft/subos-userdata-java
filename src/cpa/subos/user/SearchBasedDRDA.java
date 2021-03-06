package cpa.subos.user;

import cpa.subos.io.file.FileIOBase;
import cpa.subos.user.dataaccess.core.IEasyAccessReadData;
import cpa.subos.user.dataaccess.files.DirectoryReadDataAccessor;
import io.github.coalangsoft.jsearch.JSearchEngine;
import io.github.coalangsoft.jsearch.JSearchResult;

import java.util.ArrayList;

public class SearchBasedDRDA extends DirectoryReadDataAccessor{

    private final ArrayList<FileIOBase> files;

    public SearchBasedDRDA(ArrayList<JSearchResult<FileIOBase>> music) {
        this.files = new ArrayList<FileIOBase>();
        music.forEach((f) -> f.getValue().listFilesDeep().forEach((m) -> {
            files.add(m);
            return null;
        }));
        values = files.toArray(new FileIOBase[0]);
    }

}
