package com.hhq.dao;

import com.hhq.models.Student;

public class StudentDao {

	public void save(Student stu) {
		System.out.println("����ѧ��" + stu.getStuName());
	}
}
