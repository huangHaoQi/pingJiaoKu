package com.hhq.models;

/**
 * ��ý������ ����Ӱ
 * @author Administrator
 *
 */
public class VideoMedia implements Media{

	private String vname = "����Ĭ��video";
	
	public String getMedidName() {
		return vname;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
