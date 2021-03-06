package com.linkedin.parseq.function;

import java.util.Objects;
import com.linkedin.parseq.function.Function1;

@FunctionalInterface
public interface Function6<T1, T2, T3, T4, T5, T6, R> {

    R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) throws Exception;

    default <V> Function6<T1, T2, T3, T4, T5, T6, V> andThen(Function1<? super R, ? extends V> f) {
        Objects.requireNonNull(f);
        return (T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) ->
          f.apply(apply(t1, t2, t3, t4, t5, t6));
    }

}
