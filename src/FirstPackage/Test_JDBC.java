package FirstPackage;

import java.sql.*;
public class Test_JDBC {
	
	public static Connection getConn(){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sham","deva");
		return con;
		}catch(Exception e)
		{
			e.printStackTrace();
	}
		return null;
	}
	public static void main(String [] args) 
	{
		try{
			Connection con = Test_JDBC.getConn();
			Statement st=con.createStatement();
			
			//select query
			//ResultSet rs=st.executeQuery("select * from  student");
			/*ResultSet rs=st.executeQuery("select * from student order by id desc");
			System.out.println("connected succesfully");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  ");
			}*/
			
			
			
		//insert query
	/*int insert =st.executeUpdate("insert into Employee values(16,'vinny',67)");
			System.out.println(insert +"row inserted ");*/
			
			
			//how to find sum of the marks
			
			/*ResultSet  rs=st.executeQuery("select  sum(marks) from Employee");
			while(rs.next())
			{
				System.out.println("the sum of the total marks::"+rs.getInt(1));
			}*/
	//sum 
	//avg 
    //min
	//max 
	//count
			
			
			
			/*ResultSet rs=st.executeQuery("select count (marks) from Employee");
			while(rs.next())
			{
				//System.out.println("the avg of marks "+rs.getInt(1)+"%");
				//System.out.println("total number of employee:::"+rs.getInt(1)+":::");
			}*/
			
			
			/*ResultSet rs=st.executeQuery("select max (marks) as largestmarks from employee");
			while(rs.next())
			{
				System.out.println("largest marks:::"+rs.getInt(1));
			}*/
			
			
			
			//delete query
			/*int delet =st.executeUpdate("delete from Employee where name='sunny'");
			System.out.println(delet+"row deleted");*/
		/*int update =st.executeUpdate("update Employee set name='sunny' where name ='vinny'");
			System.out.println(update +"row updated");
			*/
			//update query
			/*int update=st.executeUpdate("update employee set marks=60 where name='raja'");
			System.out.println(update+"row updated");*/
			
			
			//ResultSet rs=st.executeQuery("select count(id) from student");
			/*ResultSet rs=st.executeQuery("select min(id) as smallestid from student ");
			while(rs.next())
			{
				System.out.println("total number of student "+rs.getInt(1));
			}
			*/
			
		  //find the sum of marks
//			ResultSet rs=st.executeQuery("select sum(marks) from employee");
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1));
//			}
			
			
			
			//find out avg  0f marks 
			/*ResultSet rs=st.executeQuery("select avg(marks) from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"%");
			}
			*/
			
			//like
			/*ResultSet rs=st.executeQuery("select * from employee where name like '___g%'");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
			}*/
			
			
			//BETWEEN 
			/*ResultSet rs=st.executeQuery("select * from  employee where marks IN (70,80)");
			while(rs.next())
			{
				System.out.println("  "+rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
			}*/
			
			
			ResultSet rs=st.executeQuery("select * from employeedemo ");
			while(rs.next())
			{
				System.out.println("id of the emplyee::"+rs.getInt(1)+" name "+rs.getString(2)+" salary "+rs.getInt(3));
			}
			
			
			//fetch duplicate record from table
			/*ResultSet rs=st.executeQuery("select empid,empname,empsalary ,count(*) from wipro Group by empid,empname,empsalary HAVING count(*)>1");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
			}*/

			
			//remove duplicate
			/*ResultSet rs=st.executeQuery("delete   from wipro where empid=100 IN (select empid from wipro group by id HAVING count(*)>1");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
			}*/
			
			
			
			st.close();
			con.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
	}
		

}
}