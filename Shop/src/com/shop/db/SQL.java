package com.shop.db;

public class SQL {
	
	
	// customer
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custid` =?";
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` SET `custid` =?, `name` =?, `hp`=?,`addr`=?,`rdate`=NOW()";
	//order
	public static final String INSERT_ORDER = "INSERT INTO `order` SET `orderId` =?, `orderProduct`=?, `orderCount`=?, `orderDate`=NOW()";
	public static final String SELECT_ORDERS = "SELECT "
			+ "a.*,"
			+ "b.`name`,"
			+ "c.`prodName` "
			+ "FROM `Order` AS a "
			+ "JOIN `Customer` AS b ON a.orderId = b.custId "
			+ "JOIN `Product` AS c ON a.orderProduct = c.prodNo "
			+ "WHERE `orderId`=?";
	
	
	//product
	
	public static final String SELECT_PRODUCT = "SELECT * FROM `product` WHERE `stock` > 0";
	public static final String SELECT_PRODUCTNO ="SELECT * FROM `product` WHERE `prodNo` =?";
	public final static String UPDATE_PRODUCT_STOCK = "UPDATE `Product` SET `stock` = `stock` - ? WHERE `prodNo` = ?"; 

	
}
