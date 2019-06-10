package agh.edu;

import java.util.List;

public interface Dao<K, E> {
    void create(E entity);
    void remove(E entity);
    E findById(K id);
    void update(E entity);
    List<E> list(final int offset, final int limit);
}
