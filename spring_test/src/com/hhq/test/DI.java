package com.hhq.test;

/**
 * “¿¿µ◊¢»Î
 * @author Administrator
 *
 */
public class DI {
	public static void main(String[] args) {
		IDao dao = DaoFactory.getDao();
		Model m = dao.getModel();
		System.out.println(m.getName());
	}
	
}

interface IDao {
	Model getModel();
}

class DaoFactory {
	public static IDao getDao() {
		DaoImpl2 d = new DaoImpl2();
		return d;
	}
}

class DaoImpl1 implements IDao{

	public Model getModel() {
		Model m = new Model("DIO");
		return m;
	}
	
}

class DaoImpl2 implements IDao{

	public Model getModel() {
		Model m = new Model("JOJO");
		return m;
	}
	
}

class Model {
	private String name;

	public Model(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
