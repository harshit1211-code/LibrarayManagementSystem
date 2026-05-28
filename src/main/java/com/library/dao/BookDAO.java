     package com.library.dao;
      import java.sql.Connection;
      import java.sql.PreparedStatement;
      import java.sql.ResultSet;
      import java.util.ArrayList;
  	  import java.util.List;
      import com.library.model.Book;
      


	public class BookDAO {

	    // Insert book
	    public static int save(Book b) {

	        int status = 0;

	        try {

	            Connection con = DBconnection.getConnection();

	            String sql = "INSERT INTO books(name,author,quantity) VALUES(?,?,?)";

	            PreparedStatement ps = con.prepareStatement(sql);

	            ps.setString(1, b.getName());
	            ps.setString(2, b.getAuthor());
	            ps.setInt(3, b.getQuantity());

	            status = ps.executeUpdate();

	            con.close();

	        } catch(Exception e) {
	            e.printStackTrace();
	        }

	        return status;
	    }

	    // View all books
	    public static List<Book> getAllBooks() {

	        List<Book> list = new ArrayList<Book>();

	        try {

	            Connection con = DBconnection.getConnection();
                String sql="SELECT * FROM books";
	            PreparedStatement ps =  con.prepareStatement(sql);

	            ResultSet rs = ps.executeQuery();

	            while(rs.next()) {

	                Book b = new Book();

	                b.setId(rs.getInt("id"));
	                b.setName(rs.getString("name"));
	                b.setAuthor(rs.getString("author"));
	                b.setQuantity(rs.getInt("quantity"));

	                list.add(b);
	            }

	            con.close();

	        } catch(Exception e) {
	            e.printStackTrace();
	        }

	        return list;
	    }
	}

