package com.smvd.test1;

public class Test3 {

	public static void main(String[] args) {
		Person person=new Person();
		person.setPage(22);
		person.setPid(1);
		person.setPname("张三");
		PersonBiz pBiz=new PersonBizImpl();
		pBiz.addPerson(person);
	}

}
