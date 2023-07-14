package sub5;

public class SQL {
	
	public final static String INSERT_USER = "INSERT INTO `user3` VALUES (?,?,?,?)";
	public final static String SELECT_USERS = "SELECT * FROM `user3`";
	public final static String SELECT_USER = "SELECT * FROM `user3` WHERE `uid`=?";
	public final static String UPDATE_USER = "UPDATE `user3` SET `name`=?,`hp`=?,`age`=? WHERE `uid` =?";
	public final static String DELETE_USER = "DELETE FROM `user3` WHERE `uid`=?";
	
	

}
