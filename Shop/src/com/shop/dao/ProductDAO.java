package com.shop.dao;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHepler;
import com.shop.db.SQL;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHepler {
	
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {};
	
	public int insertProduct (ProductVO vo) {
		return 0;
	}
	public ProductVO selectProduct (int prodNo) {
		
		ProductVO vo = null;
		
		try {
			
			conn =getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCTNO);
			psmt.setInt(1, prodNo);
			rs= psmt.executeQuery();
			
			if(rs.next()) {
				vo = new ProductVO();
				vo.setProdNo(rs.getInt(1));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
				
			}
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	public List<ProductVO> selectProducts () {
		
		List<ProductVO> products = new ArrayList<>();
		
		try {
			
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCT);
			
			while(rs.next()) {
				
				ProductVO vo = new ProductVO();
				vo.setProdNo(rs.getInt("prodNo"));
				vo.setProdName(rs.getString("prodName"));
				vo.setStock(rs.getInt("stock"));
				vo.setPrice(rs.getInt("price"));
				vo.setCompany(rs.getString("company"));
				
				products.add(vo);
				
			}
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return products;
	}
	public int updateProduct (ProductVO vo) {
		return 0;
	}
	
	public void updateProductStock(int prodNo, int prodCount) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_PRODUCT_STOCK);
			psmt.setInt(1, prodCount);
			psmt.setInt(2, prodNo);
			
			psmt.executeUpdate();
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int deleteProduct (int prodNo) {
		return 0;
	}

}
