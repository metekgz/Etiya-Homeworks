package org.etiya;

import java.util.ArrayList;
import java.util.List;

public class JDBCProductDao {
    List<Product> products;

    public  JDBCProductDao(){
        products = new ArrayList<>();
    }

    public   void add(Product product){}
    public  List<Product> getAll(){
        return  products;
    }
    public  Product getById(int id){return  null;}
}
