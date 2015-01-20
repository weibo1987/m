/**  
* @Title: NewsDao.java
* @Package com.jrj.m.dao
* @Description: TODO
* @author ping.lv ping.lv@jrj.com.cn  
* @date 2015年1月20日 上午10:47:48
* @version V1.0  
*/ 
package com.jrj.m.dao;

import java.util.List;

import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.SQL;
import net.paoding.rose.jade.annotation.SQLParam;

import com.jrj.m.model.News;

/**
 * @ClassName: NewsDao
 * @Description: TODO
 * @author ping.lv ping.lv@jrj.com.cn
 * @date 2015年1月20日 上午10:47:48
 *
 */
@DAO
public interface NewsDAO {
    @SQL("select iiid, title,intro from info_item order by iiid desc ")
    public List<News> find(); 
    
    @SQL("insert into info_item(iiid, title,intro) values(:t.iiid,:t.title,:t.intro);")
    public void insert(@SQLParam("t")News news); 
}
