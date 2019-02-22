package com.hzb.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: houzhibo
 * @date: 2019年2月22日 下午4:00:57
 * @describe:
 */
@RestController
public class EnvironmentController {

	@Autowired
	private Environment env;

	/**
	 * 第三种方式：使用`Environment`
	 */
	@RequestMapping("/env")
	public Map<String, Object> env() throws UnsupportedEncodingException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", env.getProperty("com.hzb.type2"));
		map.put("title", new String(env.getProperty("com.hzb.title2").getBytes("ISO-8859-1"), "UTF-8"));
		return map;
	}
}
