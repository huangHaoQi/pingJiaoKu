package com.hhq.models;

/**
 * Mp4播放程序
 * @author Administrator
 *
 */
public class Mp4 {

	private Media music = null;
	
	private Media video = null;
	
	private Headset headset = null;

	public Media getMusic() {
		return music;
	}

	public void setMusic(Media music) {
		this.music = music;
	}

	public Media getVideo() {
		return video;
	}

	public void setVideo(Media video) {
		this.video = video;
	}

	public Headset getHeadset() {
		return headset;
	}

	public void setHeadset(Headset headset) {
		this.headset = headset;
	}
	
	public void play() {
		System.out.println("播放音乐：" + music.getMedidName());
		System.out.println(headset.addVolume());
		System.out.println("视频");
		System.out.println("播放视频：" + video.getMedidName());
		System.out.println(headset.subVolume());
		music.print();
		video.print();
	}
}
