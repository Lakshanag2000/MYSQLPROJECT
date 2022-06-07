package crud_operations;
import java.sql.*;
public class Mysqlproject {
	public static void select(){
		try
		{ 
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Lakshana@2000");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Employee");
		
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
		}
		}
		catch(Exception e)
		{
		System.out.println(e.toString());}
	}
static void insert() {
				try{ Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Lakshana@2000");
				Statement st=con.createStatement();
				st.executeUpdate("insert into Employee values(6789,chikku,ceo,120000,9)");
				con.close();
				}
				catch(Exception e)
				{
				System.out.println(e.getMessage());}
			
			}
static void update() {
				try{ Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Lakshana@2000");
				Statement st=con.createStatement();
				st.executeUpdate("update employee set Employee_POST='program manager' where Employee_ID=1103");
				con.close();
				}
				catch(Exception e)
				{
				System.out.println(e.getMessage());}
				
			}
static void delete() {
				
				try{ Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Lakshana@2000");
				String s="delete from employee where Employee_ID=?";
				PreparedStatement ps=con.prepareStatement(s);
				ps.setInt(1,8470);
				ps.execute();
				con.close();
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());}

				} 

public static void main(String args []) {
			    int a = 3;
				switch(a) {
				case 1:
				   Mysqlproject.select();
					break;
				case 2:
					Mysqlproject.insert();
					break;
				case 3:
					Mysqlproject.update();
					break;
				case 4:
					Mysqlproject.delete();
					
					break;
				}
				
			}

	}


