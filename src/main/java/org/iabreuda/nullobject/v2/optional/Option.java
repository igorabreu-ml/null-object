package org.iabreuda.nullobject.v2.optional;

import java.util.function.Consumer;

public interface Option<T> {
    T get();

    boolean isPresent();

    @SuppressWarnings("unchecked")
    static <T> Option<T> empty() { return (Option<T>) EmptyOption.EMPTY; }

    static <T> Option<T> of(T value) { return new PresentOption<>(value); }

    static <T> Option<T> ofNullable(T value) {
        return value == null ? empty() : of(value);
    }

    default void ifPresent(Consumer<? super T> action) {
        if (isPresent()) {
            action.accept(get());
        }
    }
}
