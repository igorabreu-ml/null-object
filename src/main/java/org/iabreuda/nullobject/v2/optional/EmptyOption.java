package org.iabreuda.nullobject.v2.optional;

import java.util.NoSuchElementException;

public class EmptyOption<T> implements Option<T> {
    static final EmptyOption<?> EMPTY = new EmptyOption<>();

    private EmptyOption() {}

    @Override public T get() { throw new NoSuchElementException(); }

    @Override public boolean isPresent() { return false; }
}
