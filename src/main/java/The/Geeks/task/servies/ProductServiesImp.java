package The.Geeks.task.servies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import The.Geeks.task.entities.Product;
import The.Geeks.task.models.ProductModel;
import The.Geeks.task.repository.productRepo;

@Service
public class ProductServiesImp  implements ProductServies{

    @Autowired
    productRepo productRepo;
    @Override
    public List<ProductModel> fetchProducts() {
        List <Product> Products= new ArrayList();
        Products = productRepo.findAll();
        List<ProductModel> ProductsModel = new ArrayList();

        for (Product p : Products)
        {
            ProductModel productModel = new ProductModel();
            productModel.setId(p.getId()); 
            productModel.setCreationDate(p.getCreationDate().toString());
            productModel.setCategory(p.getCategory().getName());
            productModel.setDescription(p.getDescription());
            productModel.setName(p.getName());


            ProductsModel.add(productModel);

        }
        

        return ProductsModel;
    }

    
}
