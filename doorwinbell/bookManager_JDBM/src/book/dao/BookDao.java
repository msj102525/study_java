package book.dao;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import book.dto.Book;

public class BookDao {

	// 1. 도서 추가
	public int insertBook(Book book) {
		int result = 0;
		String query = "INSERT INTO BOOK VALUES (seq_bid.nextval, ?, ?, ?, ?, ?)";

		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {

			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setString(3, book.getPublisher());
			pstmt.setDate(4, book.getPublishDate());
			pstmt.setInt(5, book.getPrice());

			result = pstmt.executeUpdate();

			if (result > 0) {
				commit(conn);
			} else {
				rollback(conn);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

		return result;
	}

	// 2. 도서 정보 수정
	public int update(Book book) {
		int result = 0;
		String query = "UPDATE BOOK SET title = ?, author = ?, publisher = ?, publish_date = ?, price = ?"
				+ "WHERE book_id = ?";

		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setString(3, book.getPublisher());
			pstmt.setDate(4, book.getPublishDate());
			pstmt.setInt(5, book.getPrice());
			pstmt.setInt(6, book.getBookId());

			result = pstmt.executeUpdate();

			if (result > 0) {
				commit(conn);
			} else {
				rollback(conn);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

		return result;
	}

	// 3. 도서 삭제

	public int delete(int bookId) {
		int result = 0;
		System.out.println(bookId);
		String query = "DELETE FROM BOOK WHERE book_id = ?";

		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		try {

			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bookId);

			result = pstmt.executeUpdate();

			if (result > 0) {
				commit(conn);
			} else {
				rollback(conn);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

		return result;
	}
	
	// 4. 도서 아이디로 찾기

		public Book selectBookId(int bookId) {
			Book book = null;
			String query = "SELECT * FROM BOOK WHERE book_id = ?";

			Connection conn = getConnection();
			PreparedStatement pstmt = null;
			ResultSet rset = null;

			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, bookId);

				rset = pstmt.executeQuery();

				if (rset.next()) {
					book = new Book();
					
					book.setBookId(rset.getInt("book_id"));
					book.setTitle(rset.getString("title"));
					book.setAuthor(rset.getString("author"));
					book.setPublisher(rset.getString("publisher"));
					book.setPublishDate(rset.getDate("publish_date"));
					book.setPrice(rset.getInt("price"));
				}

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(rset);
				close(pstmt);
				close(conn);
			}

			return book;
		}
		
	// 5. 도서명으로 조회
		

	// 6. 도서 전체 조회
	public ArrayList<Book> selectAll() {
		ArrayList<Book> list = new ArrayList<Book>();
		String query = "SELECT * FROM BOOK";

		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {

			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();

			while (rset.next()) {
				Book book = new Book();

				book.setBookId(rset.getInt("book_id"));
				book.setTitle(rset.getString("title"));
				book.setAuthor(rset.getString("author"));
				book.setPublisher(rset.getString("publisher"));
				book.setPublishDate(rset.getDate("publish_date"));
				book.setPrice(rset.getInt("price"));

				list.add(book);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
			close(conn);
		}

		return list;
	}

	public ArrayList<Book> searchBookTitle(String bookTitle) {
		ArrayList<Book> list = new ArrayList<Book>();
		
		String query = "SELECT * FROM BOOK WHERE title LIKE ?";
		
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, "%" + bookTitle + "%");
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Book book = new Book();
				
				book.setBookId(rset.getInt("book_id"));
				book.setTitle(rset.getString("title"));
				book.setAuthor(rset.getString("author"));
				book.setPublisher(rset.getString("publisher"));
				book.setPublishDate(rset.getDate("publish_date"));
				book.setPrice(rset.getInt("price"));
				
				list.add(book);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
			close(conn);
		}
		
		return list;
	}

	

}
