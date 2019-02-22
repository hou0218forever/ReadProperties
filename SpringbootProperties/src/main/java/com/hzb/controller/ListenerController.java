package com.hzb.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzb.config.ApplicationContextUtils;
import com.hzb.config.PropertiesConfig;
import com.hzb.config.PropertiesListenerConfig;

/**
 * @author: houzhibo
 * @date: 2019年2月22日 下午4:17:37
 * @describe:
 */
@RestController
public class ListenerController {

	/**
	 * 第四种方式：通过注册监听器(`Listeners`) + `PropertiesLoaderUtils`的方式
	 */
	@RequestMapping("/listener")
	public Map<String, Object> listener() {
		Map<String, Object> map = new HashMap<String, Object>();
		//方式四
		map.putAll(PropertiesListenerConfig.getAllProperty());
		//方式一
		PropertiesConfig propertiesConfig = (PropertiesConfig) ApplicationContextUtils.get(PropertiesConfig.class);
		System.out.println(propertiesConfig);
		return map;
	}
}
