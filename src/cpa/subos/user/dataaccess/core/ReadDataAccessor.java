package cpa.subos.user.dataaccess.core;

import io.github.coalangsoft.jsearch.JSearchEngine;

public interface ReadDataAccessor<T> {

    int length();
    T get(int index);
    JSearchEngine<T> makeSearchEngine();

}
