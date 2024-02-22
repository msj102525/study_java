package product.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import product.exception.ProductException;
import product.model.dao.ProductDao;
import product.model.dto.Product;

public class ProductService {
	public ProductService() {}
	
	private ProductDao prodDao = new ProductDao();
	
	public ArrayList<Product> sellectAll() throws ProductException {
		Connection conn = getConnection();
		ArrayList<Product> list = prodDao.selectAll(conn);
		close(conn);
		
		return list;
	}
	
	public int insertProduct(Product prod) throws ProductException {
		Connection conn = getConnection();
		int result = prodDao.insertProduct(conn, prod);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public Product selectByName(String pName) throws ProductException {
		Connection conn = getConnection();
		Product prod = prodDao.selectByName(conn, pName);
		close(conn);
		return prod;
	}
	
	public Product selectById(String productId) throws ProductException {
		Connection conn = getConnection();
		Product prod = prodDao.selectById(conn, productId);
		close(conn);
		return prod;
	}

	public int updateProduct(int updatePrice, String productId) throws ProductException {
		Connection conn = getConnection();
		int result = prodDao.updateProduct(conn, updatePrice, productId);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int deleteProduct(String productId) throws ProductException {
		Connection conn = getConnection();
		int result = prodDao.deleteProduct(conn, productId);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
}
