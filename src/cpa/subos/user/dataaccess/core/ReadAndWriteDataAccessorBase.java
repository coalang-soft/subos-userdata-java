package cpa.subos.user.dataaccess.core;

public abstract class ReadAndWriteDataAccessorBase<T> implements ReadAndWriteDataAccessor<T> {

    protected abstract String makeSearchKey(T value);

}
