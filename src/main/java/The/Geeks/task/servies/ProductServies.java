package The.Geeks.task.servies;

import java.util.List;

import org.springframework.stereotype.Service;

import The.Geeks.task.models.ProductModel;

@Service
public interface ProductServies {

    public List<ProductModel> fetchProducts();
    
}
