package org.etiya;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    List<Product> getAll();
    Product getById(int id);
}
