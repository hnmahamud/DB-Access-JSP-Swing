<%@ page errorPage="Error.jsp" %>
<%@ page import ="java.sql.*" %>

<%
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
    
    Statement st = con.createStatement();
    
    ResultSet rs = st.executeQuery(" select * from members ");
      while(rs.next()){
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first_name = rs.getString("first_name");
         String last_name = rs.getString("last_name");

         out.print("ID: " + id);
         out.print(", First_Name: " + first_name);
         out.print(", Last_Name: " + last_name);
         out.print(", Age: " + age);
         out.print("<BR>");
      }
%>