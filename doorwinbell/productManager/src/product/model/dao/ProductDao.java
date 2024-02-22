package product.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

import product.exception.ProductException;
import product.model.dto.Product;

public class ProductDao {
	private Properties prop = new Properties();

	public ProductDao() {
		try {
			prop.load(new FileReader("resources/query.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 1. 상품 전체 조회

	public ArrayList<Product> selectAll(Connection conn) throws ProductException {
		ArrayList<Product> list = new ArrayList<Product>();
		String query = prop.getProperty("selectall");
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();

			while (rset.next()) {
				Product prod = new Product();

				prod.setProductId(rset.getString("product_id"));
				prod.setpName(rset.getString("p_name"));
				prod.setPrice(rset.getInt("price"));
				prod.setDescription(rset.getString("description"));

				list.add(prod);
			}

		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	// 2 상품 등록
	public int insertProduct(Connection conn, Product prod) throws ProductException {
		int result = 0;
		String query = prop.getProperty("insertproduct");
		
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, prod.getProductId());
			pstmt.setString(2, prod.getpName());
			pstmt.setInt(3, prod.getPrice());
			pstmt.setString(4, prod.getDescription());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	// 5.
	public Product selectByName (Connection conn, String pName) throws ProductException {
		Product prod = null;
		String query = prop.getProperty("selectbyname");
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pName);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				prod = new Product();
				
				prod.setProductId(rset.getString("product_id"));
				prod.setpName(rset.getString("p_name"));
				prod.setPrice(rset.getInt("price"));
				prod.setDescription(rset.getString("description"));
			}
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return prod;
	}
	
	public Product selectById (Connection conn, String productId) throws ProductException {
		Product prod = null;
		String query = prop.getProperty("selectbyid");
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, productId);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				prod = new Product();
				
				prod.setProductId(rset.getString("product_id"));
				prod.setpName(rset.getString("p_name"));
				prod.setPrice(rset.getInt("price"));
				prod.setDescription(rset.getString("description"));
			}
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return prod;
	}
	
	public int updateProduct(Connection conn, int updatePrice, String productId) throws ProductException {
		int result = 0;
		
		String query = prop.getProperty("updatePrice");
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, updatePrice);
			pstmt.setString(2, productId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		}
		
		return result;
	}

	public int deleteProduct(Connection conn, String productId) throws ProductException {
		int result = 0;
		String query = prop.getProperty("deletebyid");
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, productId);
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		}
		
		return result;
	}

}
