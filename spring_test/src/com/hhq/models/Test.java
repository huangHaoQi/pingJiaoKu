package com.hhq.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		 Mp4 mp4 =  (Mp4)context.getBean("mp4");
		 VideoMedia video = (VideoMedia)context.getBean("video");
		 //mp4.play();
		 double i = 2<<3;
		 System.out.println(i);
		 //System.out.println(video.getMedidName());
		/*String str1 = new String("abc");
		String str2 = str1;
		System.out.println(str2);*/
	}

}
