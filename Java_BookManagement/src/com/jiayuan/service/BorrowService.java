package com.jiayuan.service;

import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.dbutils.DbUtils;
import com.jiayuan.dao.BRRecordDao;
import com.jiayuan.dao.BooksDao;
import com.jiayuan.dao.BorrowDao;
import com.jiayuan.dao.ReturnBookDao;
import com.jiayuan.demo.C3p0Utils;
import com.jiayuan.entiy.BRRecord;
import com.jiayuan.entiy.Books;
import com.jiayuan.entiy.Settings;
import com.jiayuan.entiy.User;

public class BorrowService {
	
	Connection conn = null;
	BRRecord brr = new BRRecord();
	Settings setting = new Settings(1, 3, 30);
	BRRecordDao brrd = new BRRecordDao();
	BorrowDao bd = new BorrowDao();
	BooksDao bsd = new BooksDao();
	DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

	/**
	 * 业务层借书的方法：
	 * @param books:被借书籍
	 * @param user:借书人
	 * @param brr:借书记录
	 */
	public void borrow(Books books, User user) {
		try {
			// 获得连接对象
			conn = C3p0Utils.getConnection();
			System.out.println(conn);
			// 开启事务
			conn.setAutoCommit(false);
			
			
			// 查看将要被借的书是否为未借状态

			// 测试findBybid
			// System.out.println(books1.toString());
			// System.out.println(user.toString());
			// System.out.println(user.getBorrownumber());
			// System.out.println(books1.getState()=="未借");
			// System.out.println(books1.getState().equals("未借"));

			if (bsd.findBybid(books.getBid()).getState().equals("未借")) {
				// System.out.println("wyd");
				if (user.getBorrownumber() < setting.getMaxnumber()) {
					// 调用借阅方法
					bd.abbr(books.getBid());
					bd.aubr(user.getId());
					// 获取借阅记录中的各条信息
					brr.setUid(user.getId());
					brr.setUname(user.getName());
					brr.setBid(books.getBid());
					brr.setBname(books.getName());
					Calendar c = Calendar.getInstance();
					Date today = c.getTime();
					brr.setBorrowdate(today);
					c.add(Calendar.DAY_OF_MONTH, setting.getMaxday());// 今天+Maxday
					Date backdate_should = c.getTime();
					brr.setBackdate_should(backdate_should);
					// 把获取的信息储存到借阅记录中去
					brrd.abrecord(brr);
					// 关闭事务
					DbUtils.commitAndCloseQuietly(conn);
					System.out.println("恭喜你借书成功");
				} else {
					System.out.println("您的借书次数已经到上限了");
				}
			} else {
				System.out.println("图书馆内没有您将要借的书籍");
			}
		} catch (Exception e) {
			DbUtils.rollbackAndCloseQuietly(conn);
			throw new RuntimeException(e);
		}
	}

	/**
	 * 业务层还书的方法：
	 * 
	 * @param books:被还书籍
	 * @param user:还书人
	 * @param brr:还书记录
	 */
	public void ReturnBook(Books books, User user) {
		Connection conn = null;
		try {
			// 获得连接对象
			conn = C3p0Utils.getConnection();
			System.out.println(conn);
			// 开启事务
			conn.setAutoCommit(false);
			// 创建dao对象
			ReturnBookDao bd = new ReturnBookDao();
			// 查看将要被借的书是否为已借状态
			BooksDao bsd = new BooksDao();
			if (bsd.findBybid(books.getBid()).getState().equals("已借")) {
				Date date = new Date();
				// 把还书记录储存到数据库中
				brrd.arrecord(brrd.seBidBorrowing(books.getBid()).getId(), date);
				// 调用还书方法
				bd.abrr(books.getBid());
				bd.aurr(user.getId());
				// 关闭事务
				DbUtils.commitAndCloseQuietly(conn);
				System.out.println("恭喜你还书成功");
			} else {
				System.out.println("查询不到这本书的借阅记录");
			}
		} catch (Exception e) {
			DbUtils.rollbackAndCloseQuietly(conn);
			throw new RuntimeException(e);
		}
	}
	/**
	 * 业务层书籍遗失处理的方法：
	 * 
	 * @param books:被借书籍
	 * @param user:借书人
	 * @param brr:借书记录
	 */
	public void MislaidBook(Books books, User user) {
		Connection conn = null;
		try {
			// 获得连接对象
			conn = C3p0Utils.getConnection();
			System.out.println(conn);
			// 开启事务
			conn.setAutoCommit(false);
			// 创建dao对象
			ReturnBookDao bd = new ReturnBookDao();
			// 查看将要被借的书是否为已借状态
			BooksDao bsd = new BooksDao();
			if (bsd.findBybid(books.getBid()).getState().equals("已借")) {
				Date date = new Date();
				// 把还书记录储存到数据库中
				brrd.arrecord(brrd.seBidBorrowing(books.getBid()).getId(), date);
				// 调用还书方法
				bd.abrr(books.getBid());
				bd.aurr(user.getId());
				// 关闭事务
				DbUtils.commitAndCloseQuietly(conn);
				System.out.println("恭喜你还书成功");
			} else {
				System.out.println("查询不到这本书的借阅记录");
			}
		} catch (Exception e) {
			DbUtils.rollbackAndCloseQuietly(conn);
			throw new RuntimeException(e);
		}
	}
}
