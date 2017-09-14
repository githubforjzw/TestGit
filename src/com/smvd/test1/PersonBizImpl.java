package com.smvd.test1;

public class PersonBizImpl implements PersonBiz{

	@Override
	public int addPerson(Person person) {
		System.out.print("添加了：  ");
		System.out.println(person);
		return 0;
	}

	@Override
	public int updatePerson(Person person) {
		System.out.print("修改了：  ");
		System.out.println(person);
		return 0;
	}

	@Override
	public int delPerson(Person person) {
		System.out.print("删除了：  ");
		System.out.println(person);
		return 0;
	}

	

}
