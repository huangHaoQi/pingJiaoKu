package com.hhq.models;

/**
 * ��ý�����ͣ�����
 * @author Administrator
 *
 */
public class MusicMedia implements Media{

	private String mName = "Ĭ�ϸ���";
	
	public String getMedidName() {
		return mName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	@Override
	public void print() {
		System.out.println("����");
		
	}
	
	

}
