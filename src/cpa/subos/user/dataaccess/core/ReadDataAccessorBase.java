package cpa.subos.user.dataaccess.core;

import io.github.coalangsoft.jsearch.JSearchEngine;
import io.github.coalangsoft.lib.data.Func;
import io.github.coalangsoft.lib.sequence.AbstractSequence;
import io.github.coalangsoft.lib.sequence.SequenceTool;
import io.github.coalangsoft.lib.sequence.basic.BasicSequence;

public abstract class ReadDataAccessorBase<T,S extends ReadDataAccessorBase<T,? extends S>> extends AbstractSequence<T,S> implements ReadDataAccessor<T> {

    public ReadDataAccessorBase(SequenceTool<T, S> tool, T... values) {
        super(tool, values);
    }

    @Override
    public JSearchEngine<T> makeSearchEngine() {
        JSearchEngine<T> engine = new JSearchEngine<>();
        for(int i = 0; i < length(); i++){
            T value = at(i);
            engine.add(makeSearchKey(value), value);
        }
        return engine;
    }

    protected abstract String makeSearchKey(T value);

}
