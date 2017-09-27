package cpa.subos.user.dataaccess.files;

import cpa.subos.io.file.FileIOBase;
import cpa.subos.user.dataaccess.core.ReadDataAccessorBase;
import io.github.coalangsoft.lib.data.Func;
import io.github.coalangsoft.lib.sequence.SequenceTool;
import io.github.coalangsoft.lib.sequence.basic.BasicSequence;

import java.util.List;

public class DirectoryReadDataAccessor extends ReadDataAccessorBase<FileIOBase,DirectoryReadDataAccessor> {

    public DirectoryReadDataAccessor(FileIOBase... values) {
        super(new SequenceTool<>(new Func<FileIOBase[], DirectoryReadDataAccessor>() {
            @Override
            public DirectoryReadDataAccessor call(FileIOBase[] fileIOBases) {
                return new DirectoryReadDataAccessor(fileIOBases);
            }
        }, new Func<Integer, FileIOBase[]>() {
            @Override
            public FileIOBase[] call(Integer integer) {
                return new FileIOBase[integer];
            }
        }), values);
    }

    protected String makeSearchKey(FileIOBase value) {
        return value.getPath();
    }

}
