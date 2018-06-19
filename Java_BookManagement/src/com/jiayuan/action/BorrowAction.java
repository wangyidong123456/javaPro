package com.jiayuan.action;



import org.junit.Test;

import com.jiayuan.entiy.Books;
import com.jiayuan.entiy.User;
import com.jiayuan.service.BorrowService;

public class BorrowAction {
	Books books=new Books("1001","javase",1,"xiaoli","Î´½è");
	User user =new User("0916","xh","123","f","","",1,"","1",0);
	BorrowService bs=new BorrowService();
	
	@Test
    public void borrow(){
	
	bs.borrow(books, user);
	}
	
	@Test
	public void returnbooks(){
	bs.ReturnBook(books, user);
	}
}
