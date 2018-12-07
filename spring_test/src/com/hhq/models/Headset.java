package com.hhq.models;

/**
 * 耳麦接口
 * @author Administrator
 *
 */
public interface Headset {

	/**
	 * 增加音量
	 * @return
	 */
	public String addVolume();
	
	/**
	 * 降低音量
	 * @return
	 */
	public String subVolume();
}
