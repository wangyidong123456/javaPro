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
	DateFormat format = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");

	/**
	 * ҵ������ķ�����
	 * @param books:�����鼮
	 * @param user:������
	 * @param brr:�����¼
	 */
	public void borrow(Books books, User user) {
		try {
			// ������Ӷ���
			conn = C3p0Utils.getConnection();
			System.out.println(conn);
			// ��������
			conn.setAutoCommit(false);
			
			
			// �鿴��Ҫ��������Ƿ�Ϊδ��״̬

			// ����findBybid
			// System.out.println(books1.toString());
			// System.out.println(user.toString());
			// System.out.println(user.getBorrownumber());
			// System.out.println(books1.getState()=="δ��");
			// System.out.println(books1.getState().equals("δ��"));

			if (bsd.findBybid(books.getBid()).getState().equals("δ��")) {
				// System.out.println("wyd");
				if (user.getBorrownumber() < setting.getMaxnumber()) {
					// ���ý��ķ���
					bd.abbr(books.getBid());
					bd.aubr(user.getId());
					// ��ȡ���ļ�¼�еĸ�����Ϣ
					brr.setUid(user.getId());
					brr.setUname(user.getName());
					brr.setBid(books.getBid());
					brr.setBname(books.getName());
					Calendar c = Calendar.getInstance();
					Date today = c.getTime();
					brr.setBorrowdate(today);
					c.add(Calendar.DAY_OF_MONTH, setting.getMaxday());// ����+Maxday
					Date backdate_should = c.getTime();
					brr.setBackdate_should(backdate_should);
					// �ѻ�ȡ����Ϣ���浽���ļ�¼��ȥ
					brrd.abrecord(brr);
					// �ر�����
					DbUtils.commitAndCloseQuietly(conn);
					System.out.println("��ϲ�����ɹ�");
				} else {
					System.out.println("���Ľ�������Ѿ���������");
				}
			} else {
				System.out.println("ͼ�����û������Ҫ����鼮");
			}
		} catch (Exception e) {
			DbUtils.rollbackAndCloseQuietly(conn);
			throw new RuntimeException(e);
		}
	}

	/**
	 * ҵ��㻹��ķ�����
	 * 
	 * @param books:�����鼮
	 * @param user:������
	 * @param brr:�����¼
	 */
	public void ReturnBook(Books books, User user) {
		Connection conn = null;
		try {
			// ������Ӷ���
			conn = C3p0Utils.getConnection();
			System.out.println(conn);
			// ��������
			conn.setAutoCommit(false);
			// ����dao����
			ReturnBookDao bd = new ReturnBookDao();
			// �鿴��Ҫ��������Ƿ�Ϊ�ѽ�״̬
			BooksDao bsd = new BooksDao();
			if (bsd.findBybid(books.getBid()).getState().equals("�ѽ�")) {
				Date date = new Date();
				// �ѻ����¼���浽���ݿ���
				brrd.arrecord(brrd.seBidBorrowing(books.getBid()).getId(), date);
				// ���û��鷽��
				bd.abrr(books.getBid());
				bd.aurr(user.getId());
				// �ر�����
				DbUtils.commitAndCloseQuietly(conn);
				System.out.println("��ϲ�㻹��ɹ�");
			} else {
				System.out.println("��ѯ�����Ȿ��Ľ��ļ�¼");
			}
		} catch (Exception e) {
			DbUtils.rollbackAndCloseQuietly(conn);
			throw new RuntimeException(e);
		}
	}
	/**
	 * ҵ����鼮��ʧ����ķ�����
	 * 
	 * @param books:�����鼮
	 * @param user:������
	 * @param brr:�����¼
	 */
	public void MislaidBook(Books books, User user) {
		Connection conn = null;
		try {
			// ������Ӷ���
			conn = C3p0Utils.getConnection();
			System.out.println(conn);
			// ��������
			conn.setAutoCommit(false);
			// ����dao����
			ReturnBookDao bd = new ReturnBookDao();
			// �鿴��Ҫ��������Ƿ�Ϊ�ѽ�״̬
			BooksDao bsd = new BooksDao();
			if (bsd.findBybid(books.getBid()).getState().equals("�ѽ�")) {
				Date date = new Date();
				// �ѻ����¼���浽���ݿ���
				brrd.arrecord(brrd.seBidBorrowing(books.getBid()).getId(), date);
				// ���û��鷽��
				bd.abrr(books.getBid());
				bd.aurr(user.getId());
				// �ر�����
				DbUtils.commitAndCloseQuietly(conn);
				System.out.println("��ϲ�㻹��ɹ�");
			} else {
				System.out.println("��ѯ�����Ȿ��Ľ��ļ�¼");
			}
		} catch (Exception e) {
			DbUtils.rollbackAndCloseQuietly(conn);
			throw new RuntimeException(e);
		}
	}
}
