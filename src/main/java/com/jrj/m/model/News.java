/**  
* @Title: News.java
* @Package com.jrj.m.domain
* @Description: TODO
* @author ping.lv ping.lv@jrj.com.cn  
* @date 2015年1月19日 下午4:22:37
* @version V1.0  
*/ 
package com.jrj.m.model;

/**
 * @ClassName: News
 * @Description: TODO
 * @author ping.lv ping.lv@jrj.com.cn
 * @date 2015年1月19日 下午4:22:37
 *
 */
public class News {

	private long iiid;
	private String title;
	private String intro;
	/**
	 * @return iiid
	 */
	public long getIiid() {
		return iiid;
	}
	/**
	 * @param iiid 要设置的 iiid
	 */
	public void setIiid(long iiid) {
		this.iiid = iiid;
	}
	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title 要设置的 title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	@Override
	public String toString() {
		return "News [iiid=" + iiid + ", title=" + title + ", intro=" + intro
				+ "]";
	}
	
}
