package cpa.subos.user.dataaccess.core;

public interface ReadAndWriteDataAccessor<T> extends ReadDataAccessor<T> {

    void add(T t);
    void remove(int index);

}
