/**  
* @Title: NewsDaoTest.java
* @Package com.jrj.m.dao
* @Description: TODO
* @author ping.lv ping.lv@jrj.com.cn  
* @date 2015年1月20日 下午1:31:56
* @version V1.0  
*/ 
package com.jrj.m.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import junit.framework.Assert;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jrj.m.dao.NewsDAO;
import com.jrj.m.model.News;



/**
 * @ClassName: NewsDaoTest
 * @Description: TODO
 * @author ping.lv ping.lv@jrj.com.cn
 * @date 2015年1月20日 下午1:31:56
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dataSource.xml")
public class NewsDAOTest {
	
	  @Autowired
	  private NewsDAO newsDAO;
	  @Qualifier("jade.dataSource.com.jrj.m.dao")
	  @Autowired
	  private BasicDataSource dataSource;
	  @Before
	  public void init() {
	        try {
	            Connection conn = dataSource.getConnection();
	            Statement st = conn.createStatement();
	            st.execute("truncate table info_item");
//	            st.execute("runscript from '" + new DefaultResourceLoader().getResource("schema.sql").getURL().toString() + "'");
	            st.close();
	            conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	    }

	    @Test
	    public void getNewsTest() {
	    	
	    	News news=new News();
	    	news.setIiid(13);
	    	news.setIntro("jrj_news");
	    	news.setTitle("jrj_newss");
	    	
	    	this.newsDAO.insert(news);
	        List<News> newsList = newsDAO.find();
	        
	        System.out.println(newsList.toString());
	        
	    }
}
