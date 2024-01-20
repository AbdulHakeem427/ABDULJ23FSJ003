package jdbc;

import java.util.Collection;
import java.util.List;

public class TestDaoImpl {
	public static void main(String[] args) {
		
		UserDAO dao=new UserDAOImpl();
		UserDTO user;
      
//		UserDTO user=dao.findByPrimaryKey(200);
//      System.out.println(user);
        
        
       
//      user=dao.findByName("hakeem");
//      System.out.println(user);
		
//		List<UserDTO> users=(List<UserDTO>)dao.findAll();
//		System.out.println(users);
		
		
//		UserDTO insert=new UserDTO(600, "adil", "secret", 6000, 0);
//		 dao.insertUser(insert);
//		 System.out.println(insert);
		
		
//		// Update user noot working 
//		UserDTO updateById = dao.findByPrimaryKey(200);        
//        updateById.setSalary(6000);
//        dao.updateUser(updateById);
        
        //Delete by name 
//		UserDAO delete=new UserDAOImpl();
//	    delete.deleteUserByName("adil");
       
		   //Delete by name 
		UserDAO deleteById=new UserDAOImpl();
	    deleteById.deleteUser(200);
        
        
	}

}
