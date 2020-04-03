import java.sql.*;
public class Select_Data {
   public static void main(String[] args) {  
   try{
       
      Class.forName("com.mysql.jdbc.Driver");
      
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing","root", "");
      
      Statement st = con.createStatement();
      
      ResultSet rs = st.executeQuery(" select * from members ");
      while(rs.next()){
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first_name = rs.getString("first_name");
         String last_name = rs.getString("last_name");

         System.out.print("ID: " + id);
         System.out.print(", First_Name: " + first_name);
         System.out.print(", Last_Name: " + last_name);
         System.out.println(", Age: " + age);
      }

   }catch(Exception e){
      e.printStackTrace();
   }
}
}