package com.hzb.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: houzhibo
 * @date: 2019年2月22日 下午4:00:57
 * @describe:
 */
@RestController
public class ValueController {

	@Value("${com.hzb.type}")
	private String type;

	@Value("${com.hzb.title}")
	private String title;

	/**
	 * 第二种方式：使用`@Value("${propertyName}")`注解
	 */
	@RequestMapping("/value")
	public Map<String, Object> value() throws java.io.UnsupportedEncodingException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", type);
		// *.properties文件中的中文默认以ISO-8859-1方式编码，因此需要对中文内容进行重新编码
		map.put("title", new String(title.getBytes("ISO-8859-1"), "UTF-8"));
		return map;
	}
}
