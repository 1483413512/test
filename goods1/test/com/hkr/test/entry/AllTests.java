package com.hkr.test.entry;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import cn.com.hkr.goods.book.domain.Book;
import cn.com.hkr.goods.cart.dao.CartItemDao;
import cn.com.hkr.goods.cart.domain.CartItem;
import cn.com.hkr.goods.cart.service.CartItemService;
import cn.com.hkr.goods.user.domain.User;


public class AllTests {
	@Test
	public void Test() {
		CartItemService shuliang=new CartItemService();
		User user=new User();
		user.setUid("32DB3700D2564254982BC58B0E4D95BC");
		Book book=new Book();
		book.setBid("000A18FDB38F470DBE9CD0972BADB23F");
		CartItem num=new CartItem();
		num.setCartItemId("000A18FDB38F470DBE9CD0972BADB23F");
		num.setQuantity(15);
		num.setBook(book);
		num.setUser(user);
		shuliang.add(num);		//添加条目
	}
	@Test
	public void Test1() {
		CartItemService shuliang=new CartItemService();
		User user=new User();
		user.setUid("32DB3700D2564254982BC58B0E4D95BC");
		Book book=new Book();
		book.setBid("0BE0707984014E66BD9F34F534FCE0F7");
		CartItem num=new CartItem();
		num.setCartItemId("0BE0707984014E66BD9F34F534FCE0F7");
		num.setQuantity(10);
		num.setBook(book);
		num.setUser(user);
		shuliang.add(num);
		List<CartItem> list = shuliang.myCart("32DB3700D2564254982BC58B0E4D95BC");
		assertNotNull("已经成功添加条目",list.size());//判断条目是否为空。
	
	}
	@Test
	public void Test2(){
		CartItemService shuliang=new CartItemService();
		User user=new User();
		user.setUid("32DB3700D2564254982BC58B0E4D95BC");
		Book book=new Book();
		book.setBid("000A18FDB38F470DBE9CD0972BADB23F");
		CartItem num=new CartItem();
		num.setBook(book);
		num.setUser(user);
		num.setCartItemId("BC31F864C5B491E9C999E45CB319E26");
		shuliang.updateQuantity("BFE0D33056DC4CCE92BB774CF7E8C67B", -10000);//修改条目数量
		
	}
	@Test
	public void Test3(){
		CartItemService shuliang=new CartItemService();
		User user=new User();
		user.setUid("32DB3700D2564254982BC58B0E4D95BC");
		Book book=new Book();
		book.setBid("000A18FDB38F470DBE9CD0972BADB23F");
		CartItem num=new CartItem();
		num.setBook(book);
		num.setUser(user);
		num.setCartItemId("BC31F864C5B491E9C999E45CB319E26");
		shuliang.batchDelete("AE52899F193348169C40B63720D87410");//删除该条目
		List<CartItem> list = shuliang.myCart("AE52899F193348169C40B63720D87410");
		assertNotNull("该条目为空条目",list.size());//判断条目是否为空。
	}
	@Test
	public void Test4() {
		User user=new User();
		user.setUid("32DB3700D2564254982BC58B0E4D95BC");
		Book book=new Book();
		book.setBid("000A18FDB38F470DBE9CD0972BADB23F");
		book.setCurrPrice(55.1);
		CartItem num=new CartItem();
		num.setCartItemId("000A18FDB38F470DBE9CD0972BADB23F");
		num.setQuantity(15);
		
		num.setBook(book);
		num.setUser(user);
		num.getSubtotal();
		double quantity=num.getSubtotal();
		assertTrue("总价无错误",quantity==15*55.1);
		
			
	}
	@Test
	public void Test5() throws SQLException {
		CartItemDao shuliang=new CartItemDao();
		User user=new User();
		user.setUid("32DB3700D2564254982BC58B0E4D95BC");
		Book book=new Book();
		book.setBid("000A18FDB38F470DBE9CD0972BADB23F");
		CartItem num=new CartItem();
		num.setCartItemId("000A18FDB38F470DBE9CD0972BADB23F");
		num.setQuantity(15);
		num.setBook(book);
		num.setUser(user);
		
		List<CartItem> a=shuliang.loadCartItems("0B0969427A4C4C6DA07E74338A0192AE,000A18FDB38F470DBE9CD0972BADB23F");
		System.out.println(a);
		
		
	} 
	
	@Test
	 public void Tests() {
	 CartItemService shuliang=new CartItemService();
	 User user=new User();
	 user.setUid("32DB3700D2564254982BC58B0E4D95BC");
	 Book book=new Book();
	 book.setBid("000A18FDB38F470DBE9CD0972BADB23F");
	 CartItem num=new CartItem();
	 num.setCartItemId("000A18FDB38F470DBE9CD0972BADB23F");
	 num.setQuantity(15);
	 num.setBook(book);
	 num.setUser(user);
	 shuliang.add(num); //添加条目
	 
	 }
	
	
	@Test
	 public void Test12() {
	 Book book=new Book();
	 book.setBid("000A18FDB38F470DBE9CD0972BADB23F");
	 book.setCurrPrice(55.1);
	 CartItem num=new CartItem();
	 num.setQuantity(15);
	 num.setBook(book);
	 num.getSubtotal();
	 double quantity=num.getSubtotal();
	 assertTrue("总价无错误",quantity==15*55.1);

	}
	@Test
	 public void Test13() {
	 User user=new User();
	 user.setUid("32DB3700D2564254982BC58B0E4D95BC");
	 Book book=new Book();
	 book.setBid("000A18FDB38F470DBE9CD0972BADB23F");
	 book.setCurrPrice(55.1);
	 CartItem num=new CartItem();
	 num.setCartItemId("000A18FDB38F470DBE9CD0972BADB23F");
	 num.setQuantity(15);
	 
	 num.setBook(book);
	 num.setUser(user);
	 num.getSubtotal();
	 double quantity=num.getSubtotal();
	 assertTrue("",quantity==15*55.1);
}	
}	
	

