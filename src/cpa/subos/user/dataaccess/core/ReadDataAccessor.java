package cpa.subos.user.dataaccess.core;

import io.github.coalangsoft.jsearch.JSearchEngine;

public interface ReadDataAccessor<T> {

    int length();
    T at(int index);
    JSearchEngine<T> makeSearchEngine();

}
