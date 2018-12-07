package com.hhq.models;

/**
 * 流媒体类型 ：电影
 * @author Administrator
 *
 */
public class VideoMedia implements Media{

	private String vname = "播放默认video";
	
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
