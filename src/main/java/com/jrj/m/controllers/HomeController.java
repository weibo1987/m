/**  
 * @Title: HomeController.java
 * @Package com.jrj.m.controllers
 * @Description: M站点首页入口
 * @author ping.lv ping.lv@jrj.com.cn  
 * @date 2015年1月19日 下午4:11:09
 * @version V1.0  
 */
package com.jrj.m.controllers;

import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;

/**
 * @ClassName: HomeController
 * @Description: M站点首页入口
 * @author ping.lv ping.lv@jrj.com.cn
 * @date 2015年1月19日 下午4:11:09
 *
 */

@Path("")
public class HomeController {
	@Get
	public String redirect() {
		return "r:/news/hots";
	}
}
