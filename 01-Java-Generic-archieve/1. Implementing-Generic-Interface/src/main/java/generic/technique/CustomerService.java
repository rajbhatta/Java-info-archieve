package generic.technique;

import java.util.List;

public interface CustomerService<T> {
    void save(T t);
    List<T> get();
    T getById(T t);
    void delete(T t);
}
