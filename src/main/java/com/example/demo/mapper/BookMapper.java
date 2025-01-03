package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Book;

@Mapper
public interface BookMapper {
	/** 全権取得 */
	List<Book> getAllBooks();
	/** idで1件取得 */
	Book getBookById(int id);
	/** 登録 */
	void insertBook(Book book);
	/** 更新 */
	void updateBook(Book book);
	/** 削除 */
	void deleteBookById(int id);
}
