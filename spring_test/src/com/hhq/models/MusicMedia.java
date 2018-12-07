package com.hhq.models;

/**
 * 流媒体类型：音乐
 * @author Administrator
 *
 */
public class MusicMedia implements Media{

	private String mName = "默认歌曲";
	
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
		System.out.println("音乐");
		
	}
	
	

}
