package cpa.subos.user.dataaccess.core;

import io.github.coalangsoft.jsearch.JSearchEngine;

public interface IEasyAccessReadData<T> extends ReadDataAccessor<T> {

    JSearchEngine<T> makeSearchEngine();

}
