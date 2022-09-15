package The.Geeks.task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import The.Geeks.task.models.ProductModel;
import The.Geeks.task.servies.ProductServiesImp;

@RestController
@RequestMapping("/api/v1")

public class ProductController {
    @Autowired
    ProductServiesImp productServiesImp;

    @RequestMapping(value = "/fetchProducts", method = RequestMethod.GET)
    public Object fetchProducts() {

        return productServiesImp.fetchProducts();

    }

    @RequestMapping(value = "/createProduct", method = RequestMethod.POST)
    public Object createProduct(@RequestBody  ProductModel productModel) {

        return productServiesImp.createProduct(productModel);

    }

    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    public Object updateProduct(@RequestBody ProductModel productModel) {

        return productServiesImp.updateProduct(productModel);

    }
}
