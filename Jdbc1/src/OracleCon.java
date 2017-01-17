import java.sql.*;  
class OracleCon{  
public static void main(String args[]){  
try{  

Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");   
Statement stmt=con.createStatement();  
  
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())
{
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7)+"  "+rs.getString(8));

} 
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  