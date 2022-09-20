package The.Geeks.task.servies;

import java.util.List;

import org.springframework.stereotype.Service;

import The.Geeks.task.models.ProductModel;
import The.Geeks.task.models.SalesModel;
import The.Geeks.task.models.UserModel;

@Service
public interface ProductServies {

    public List<ProductModel> fetchProducts();

    public ProductModel createProduct(ProductModel productModel);

    public ProductModel updateProduct(ProductModel productModel);

    public List<SalesModel> fetchAllSales(   );



}
