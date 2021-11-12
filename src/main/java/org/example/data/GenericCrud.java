package org.example.data;

import java.util.Collection;
import java.util.Optional;

public interface GenericCrud <T, ID>{
    T persist (T t);
    Collection<T> findAll();
    Optional<T> findByID(ID id);
    void remove(ID id);
}
