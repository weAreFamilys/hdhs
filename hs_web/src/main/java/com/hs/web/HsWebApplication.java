package com.hs.web;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@MapperScan("com.hs.web.mapper")
public class HsWebApplication {

	@Bean
	public HttpMessageConverters httpMessageConverters() {
		FastJsonHttpMessageConverter messageConverter = new FastJsonHttpMessageConverter();

		FastJsonConfig jsonConfig = new FastJsonConfig();
		jsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat, SerializerFeature.WriteClassName);

		messageConverter.setFastJsonConfig(jsonConfig);

		// 解决中文乱码问题
		List<MediaType> mediaTypes = new ArrayList<MediaType>();
		mediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		messageConverter.setSupportedMediaTypes(mediaTypes);

		return new HttpMessageConverters(messageConverter);
	}

	public static void main(String[] args) {
		SpringApplication.run(HsWebApplication.class, args);
	}
}
