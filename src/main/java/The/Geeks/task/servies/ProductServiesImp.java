package The.Geeks.task.servies;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import The.Geeks.task.entities.Category;
import The.Geeks.task.entities.Product;
import The.Geeks.task.entities.Sales;
import The.Geeks.task.models.ProductModel;
import The.Geeks.task.models.SalesModel;
import The.Geeks.task.models.UserModel;
import The.Geeks.task.repository.SalesRepo;
import The.Geeks.task.repository.categoryRepo;
import The.Geeks.task.repository.productRepo;

@Service
public class ProductServiesImp implements ProductServies {

    @Autowired
    productRepo productRepo;
    @Autowired
    categoryRepo categoryRepo;

    @Autowired
    SalesRepo salesRepo;

    @Override
    public List<ProductModel> fetchProducts() {
        List<Product> Products = new ArrayList();
        Products = productRepo.findAll();
        List<ProductModel> ProductsModel = new ArrayList();

        for (Product p : Products) {
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

    public ProductModel createProduct(ProductModel p) {
        Product product = new Product();

        LocalDate date = LocalDate.parse(p.getCreationDate());
        product.setCreationDate(date);

        Category category = categoryRepo.findByName(p.getCategory());
        product.setCategory(category);

        product.setDescription(p.getDescription());

        product.setName(p.getName());

        product = productRepo.save(product);

        p.setId(product.getId());
        return p;

    }

    public ProductModel updateProduct(ProductModel p) {
        Optional<Product> product = productRepo.findById(p.getId());

        LocalDate date = LocalDate.parse(p.getCreationDate());
        product.get().setCreationDate(date);

        Category category = categoryRepo.findByName(p.getCategory());
        product.get().setCategory(category);

        product.get().setDescription(p.getDescription());

        product.get().setName(p.getName());

        productRepo.save(product.get());

        return p;

    }

    public List<SalesModel> fetchAllSales() {
        List<Sales> Sales = new ArrayList();
        Sales = salesRepo.findAll();

        List<SalesModel> salesModels = new ArrayList();


        for ( int i = 0; i < Sales.size(); i++) {

            SalesModel  saleModel = new SalesModel();

            if(Sales.get(i).getUsers().get(i).isSaller()==true) 
            saleModel.setSaller(Sales.get(i).getUsers().get(i).getName());

            saleModel.setId(Sales.get(i).getId());
            saleModel.setCreationDate(Sales.get(i).getCreationDate());
            saleModel.setTotal(Sales.get(i).getTotal());


            if (Sales.get(i).getUsers().get(i+1).isSaller() == false)
                saleModel.setClient(Sales.get(i).getUsers().get(i+1).getName());

            salesModels.add(saleModel);

        }

        return salesModels;

    }

}
