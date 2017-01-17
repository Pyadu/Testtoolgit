import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;  
class Jdbc2{  
public static void main(String args[]){  
try{  

Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");   
PreparedStatement stmt=con.prepareStatement("insert into stud values(?,?)");  
stmt.setInt(1,1012);
stmt.setString(2, "e");
  int i=stmt.executeUpdate();
  System.out.println("row inserted"+i);

con.close();  
}
catch(Exception e){ System.out.println(e);}  
  
}  
}  