package cpa.subos.user.dataaccess.core;

public abstract class ReadAndWriteDataAccessorBase<T> implements ReadAndWriteDataAccessor<T> {

    @Override
    public ReadDataAccessor<T> asReadOnly() {
        return new ReadDataAccessorBase<T>() {
            @Override
            public int length() {
                return ReadAndWriteDataAccessorBase.this.length();
            }

            @Override
            public T get(int index) {
                return ReadAndWriteDataAccessorBase.this.get(index);
            }

            @Override
            protected String makeSearchKey(T value) {
                return ReadAndWriteDataAccessorBase.this.makeSearchKey(value);
            }
        };
    }

    protected abstract String makeSearchKey(T value);

}
