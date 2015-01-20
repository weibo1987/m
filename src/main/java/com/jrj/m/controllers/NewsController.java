/**  
* @Title: NewsController.java
* @Package com.jrj.m.controllers
* @Description: TODO
* @author ping.lv ping.lv@jrj.com.cn  
* @date 2015年1月19日 下午4:17:36
* @version V1.0  
*/ 
package com.jrj.m.controllers;

import java.util.List;

import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;

import org.springframework.beans.factory.annotation.Autowired;

import com.jrj.m.model.News;
import com.jrj.m.service.NewsService;

/**
 * @ClassName: NewsController
 * @Description: TODO
 * @author ping.lv ping.lv@jrj.com.cn
 * @date 2015年1月19日 下午4:17:36
 *
 */
@Path("news") 
public class NewsController {
	
	@Autowired     
	private NewsService newsService; 
	
	@Get("hots")
	public String hot(Invocation inv)
	{
		List<News> newsList = newsService.find(); 
		inv.addModel("newsList", newsList);        
		System.err.println("--------------------------------------------");
		return "index"; 
	}

}
