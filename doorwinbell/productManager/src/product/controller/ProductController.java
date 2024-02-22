package product.controller;

import java.util.ArrayList;

import product.exception.ProductException;
import product.model.dto.Product;
import product.model.service.ProductService;

public class ProductController {
	public ProductController() {
	}

	private ProductService prodService = new ProductService();

	// Method
	public ArrayList<Product> selectList() throws ProductException {
		return prodService.sellectAll();
	}

	public int insertProduct(Product prod) throws ProductException {
		return prodService.insertProduct(prod);
	}

	public Product selectByName(String pName) throws ProductException {
		return prodService.selectByName(pName);
	}
	public Product selectById(String productId) throws ProductException {
		return prodService.selectById(productId);
	}

	public int updatePorduct(int updatePrice, String productId) throws ProductException {
		return prodService.updateProduct(updatePrice, productId);
	}

	public int deleteProduct(String productId) throws ProductException {
		return prodService.deleteProduct(productId);
	}

	

}
