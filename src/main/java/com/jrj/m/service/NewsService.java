/**  
 * @Title: NewsService.java
 * @Package com.jrj.m.service
 * @Description: TODO
 * @author ping.lv ping.lv@jrj.com.cn  
 * @date 2015年1月19日 下午5:43:06
 * @version V1.0  
 */
package com.jrj.m.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrj.m.dao.NewsDAO;
import com.jrj.m.model.News;

/**
 * @ClassName: NewsService
 * @Description: TODO
 * @author ping.lv ping.lv@jrj.com.cn
 * @date 2015年1月19日 下午5:43:06
 *
 */
@Service
public class NewsService {
	@Autowired
	private NewsDAO newsDAO;

	public List<News> find() {
		return newsDAO.find();
	}
}
