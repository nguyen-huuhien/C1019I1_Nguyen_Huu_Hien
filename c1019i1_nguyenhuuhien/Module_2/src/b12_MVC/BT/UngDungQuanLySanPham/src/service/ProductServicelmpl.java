package service;

import model.Product;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServicelmpl implements ProductService {
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"IPHONE","2019","USA"));
        productMap.put(2,new Product(2,"NOKIA","2019","CHINA"));
        productMap.put(3,new Product(3,"SAMSUNG","2019","KOREA"));
        productMap.put(4,new Product(4,"HTC","2019","USA"));
        productMap.put(5,new Product(5,"IPHONE","2016","USA"));
        productMap.put(6,new Product(5,"IPHONE","2016","USA"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
    productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id) ;
    }

    @Override
    public void update(int id, Product product) {
    productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
    productMap.remove(id);
    }
}
