package com.hzb.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hzb.config.PropertiesConfig;

/**
 * @author: houzhibo
 * @date: 2019年2月22日 下午4:00:57
 * @describe:
 */
@RestController
public class PropertiesController {

	@Autowired
	private PropertiesConfig propertiesConfig;

	/**
	 * 
	 * 第一种方式：使用`@ConfigurationProperties`注解将配置文件属性注入到配置对象类中
	 */
	@RequestMapping("/config")
	public Map<String, Object> configurationProperties() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", propertiesConfig.getType3());
		map.put("title", propertiesConfig.getTitle3());
		map.put("login", propertiesConfig.getLogin());
		map.put("urls", propertiesConfig.getUrls());
		return map;
	}
}
