package com.hhq.models;

/**
 * Mp4���ų���
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
		System.out.println("�������֣�" + music.getMedidName());
		System.out.println(headset.addVolume());
		System.out.println("��Ƶ");
		System.out.println("������Ƶ��" + video.getMedidName());
		System.out.println(headset.subVolume());
		music.print();
		video.print();
	}
}
