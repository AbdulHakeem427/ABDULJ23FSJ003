package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class UserDAOImpl extends UserDAO {
	  @Override
	  public UserDTO findByPrimaryKey(int uid) {
		  try (Connection connection = DBUtility.getCon();
	            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where userid = ?")) {
	            preparedStatement.setInt(1, uid);
	            try (ResultSet rs = preparedStatement.executeQuery()) {
	                if (rs.next()) {
	                	UserDTO userObj=new UserDTO();
	        			userObj.setUid(rs.getInt(1));
	        			userObj.setUname(rs.getString(2));
	        			userObj.setUpass(rs.getString(3));
	        			userObj.setSalary(rs.getInt(4));
	        			userObj.setFlag(rs.getInt(5));
	        			return userObj;
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    @Override
	    public Collection<UserDTO> findAll() {
	        Collection<UserDTO> users = new ArrayList<>();
	        try (Connection connection = DBUtility.getCon();
	             Statement statement = connection.createStatement();
	             ResultSet rs = statement.executeQuery("select * from users")) {

	            while (rs.next()) {
	            	UserDTO userObj=new UserDTO();
					userObj.setUid(rs.getInt(1));
					userObj.setUname(rs.getString(2));
					userObj.setUpass(rs.getString(3));
					userObj.setSalary(rs.getInt(4));
					userObj.setFlag(rs.getInt(5));
					users.add(userObj);
				}
				return users;
	            }
	         catch (Exception e) {
	            e.printStackTrace();
	        }
	        return users;
	    }

	    @Override
	    public UserDTO findByName(String uname) {
	        try (Connection connection = DBUtility.getCon();
	             PreparedStatement preparedStatement = connection.prepareStatement("select * from users where username = ?")) {

	            preparedStatement.setString(1, uname);
	            try (ResultSet rs = preparedStatement.executeQuery()) {
	                if (rs.next()) {
	                	UserDTO userObj = new UserDTO();
	                    userObj.setUid(rs.getInt(1));
	                    userObj.setUname(rs.getString(2));
	                    userObj.setUpass(rs.getString(3));
	                    userObj.setSalary(rs.getInt(4));
	                    userObj.setFlag(rs.getInt(5));
	                    return userObj;
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    @Override
	    public void insertUser(UserDTO user) {
	        try (Connection connection = DBUtility.getCon();
	             PreparedStatement preparedStatement = connection.prepareStatement("insert into users (userid, username, password, salary, flag) values (?, ?, ?, ?, ?)")) {

	            preparedStatement.setInt(1, user.getUid());
	            preparedStatement.setString(2, user.getUname());
	            preparedStatement.setString(3, user.getUpass());
	            preparedStatement.setInt(4, user.getSalary());
	            preparedStatement.setInt(5, user.getFlag());

	            preparedStatement.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void updateUser(UserDTO user) {
	    	String updateSQL="update users set username=?, password=?, salary=?, flag=? where userid=?";
	        try (
	           Connection connection = DBUtility.getCon();
	          PreparedStatement ps = connection.prepareStatement(updateSQL)) {

	            ps.setString(1, user.getUname());
	            ps.setString(2, user.getUpass());
	            ps.setInt(3, user.getSalary());
	            ps.setInt(4, user.getFlag());
	            ps.setInt(5, user.getUid());

	            ps.executeUpdate();
	         
	            } 
	    	catch (Exception e) {
	            e.printStackTrace();
	        }
	    	
	    }

	    @Override
	    public void deleteUser(int userid) {
	        try (Connection connection = DBUtility.getCon();
	             PreparedStatement preparedStatement = connection.prepareStatement(" delete from  users where userid=?")) {

	            preparedStatement.setInt(1, userid);
	            preparedStatement.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteUserByName(String uname) {
	        try (Connection connection = DBUtility.getCon();
	             PreparedStatement preparedStatement = connection.prepareStatement("delete from  users where username=?")) {

	            preparedStatement.setString(1, uname);
	            preparedStatement.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
