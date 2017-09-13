package cpa.subos.user.dataaccess.files;

import cpa.subos.io.file.FileIOBase;
import cpa.subos.user.dataaccess.core.ReadDataAccessorBase;
import io.github.coalangsoft.lib.sequence.basic.BasicSequence;

import java.util.List;

public class DirectoryReadDataAccessor extends ReadDataAccessorBase<FileIOBase> {

    private List<FileIOBase> files;

    protected void setFiles(List<FileIOBase> files){
        this.files = files;
    }

    @Override
    public int length() {
        return files.size();
    }

    @Override
    public FileIOBase get(int index) {
        return files.get(index);
    }

    protected String makeSearchKey(FileIOBase value) {
        return value.getPath();
    }

}
