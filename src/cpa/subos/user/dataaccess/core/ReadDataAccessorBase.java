package cpa.subos.user.dataaccess.core;

import io.github.coalangsoft.jsearch.JSearchEngine;
import io.github.coalangsoft.lib.data.Func;

public abstract class ReadDataAccessorBase<T> implements ReadDataAccessor<T> {

    @Override
    public JSearchEngine<T> makeSearchEngine() {
        JSearchEngine<T> engine = new JSearchEngine<>();
        for(int i = 0; i < length(); i++){
            T value = get(i);
            engine.add(makeSearchKey(value), value);
        }
        return engine;
    }

    protected abstract String makeSearchKey(T value);

}
