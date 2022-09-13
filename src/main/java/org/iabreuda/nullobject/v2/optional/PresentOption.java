package org.iabreuda.nullobject.v2.optional;

import static java.util.Objects.requireNonNull;

public class PresentOption<T> implements Option<T> {
    private final T value;

    PresentOption(T value) { this.value = requireNonNull(value); }

    @Override public T get() { return value; }

    @Override
    public boolean isPresent() { return true; }

}
