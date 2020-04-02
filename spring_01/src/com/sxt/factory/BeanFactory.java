package com.sxt.factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BeanFactory {
	static Map<String, String> mappings=new HashMap<>();
	public static Map<String, Object> ioc=new HashMap<>();
	static{
		//得到bean.properties的流
		InputStream is=BeanFactory.class.getResourceAsStream("bean.properties");
		Properties properties=new Properties();
		//把流加载到对象
		try{
			properties.load(is);
			Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();
			for (Map.Entry<Object,Object> entry:entrySet)  {
				mappings.put(entry.getKey().toString(),entry.getValue().toString());
				//创建所有的对象
				Class<?> forName=Class.forName(entry.getValue().toString());
				Object obj= forName.newInstance();
				ioc.put(entry.getKey().toString(), getBean2(entry.getKey().toString()));
			}

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("解析配置文件异常");
		}
	}
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String key){
		T t=null;
		try {
			//根据key去mappeing取出完全限定名
			String path=mappings.get(key);
			Class<?> forName=Class.forName(path);
			t=(T) forName.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
		}
	@SuppressWarnings("unchecked")
	public static Object  getBean2(String key){
		try {
			//根据key去mappeing取出完全限定名
			String path=mappings.get(key);
			Class<?> forName=Class.forName(path);
			return  forName.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		}
	//@SuppressWarnings("unchecked")
	/*public static <T> T getBean(String path){
		T t=null;
		try {
			Class<?> forName=Class.forName(path);
			t=(T) forName.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
		}*/
	/*@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<?> clzz){
		T t=null;
		try {
			t=(T) clzz.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
		}*/


}
