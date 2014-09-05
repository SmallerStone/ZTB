package com.tianchen.ztb.common;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Json {
	/**  
     * 功能描述:传入任意一个 javabean 对象生成一个指定规格的字符串  
     *   
     * @param bean  
     *            bean对象  
     * @return String  
     */  
    public static String beanToJson(Object bean) {   
    	
    	
    	//保护用户信息
    	if(bean.getClass().getName().equals("com.person.main.data.UserBaseData")){
    		return beanToJsonWithField(bean, new String[]{"name","username","sex","id","goal","commonFriends","city"});
    	}
        StringBuilder json = new StringBuilder();   
        json.append("{");   
        PropertyDescriptor[] props = null;   
        try {   
            props = Introspector.getBeanInfo(bean.getClass(), Object.class)   
                    .getPropertyDescriptors();   
        } catch (IntrospectionException e) {   
        }   
        if (props != null) {   
            for (int i = 0; i < props.length; i++) {   
                try {   
                    String name = props[i].getName();   
                    Object object=props[i].getReadMethod().invoke(bean);
                    String value=getJsonValue(object);
                    json.append("\"").append(name).append("\"").append(":").append(value).append(","); 
                } catch (Exception e) { 
                	e.printStackTrace();
                }   
            }   
            json.setCharAt(json.length() - 1, '}');   
        } else {   
            json.append("}");   
        }   
        return json.toString();   
    }   
  
    /**  
     * 功能描述:通过传入一个列表对象,调用指定方法将列表中的数据生成一个JSON规格指定字符串  
     *   
     * @param list  
     *            列表对象  
     * @return java.lang.String  
     */  
    public static String listToJson(List<?> list) {   
        StringBuilder json = new StringBuilder();   
        json.append("[");   
        if (list != null && list.size() > 0) {   
            for (Object obj : list) {   
                json.append(beanToJson(obj));   
                json.append(",");   
            }   
            json.setCharAt(json.length() - 1, ']');   
        } else {   
            json.append("]");   
        }   
        return json.toString();   
    }
    /**  
     * 功能描述:通过传入一个列表对象,调用指定方法将列表中的数据生成一个JSON规格指定字符串  
     *   
     * @param list  
     *            列表对象  
     * @return java.lang.String  
     */  
    public static String arrayToJson(Object[] objects) {   
    	StringBuilder json = new StringBuilder();   
    	json.append("[");   
    	if (objects != null && objects.length > 0) {   
    		for (Object obj : objects) {   
    			json.append(beanToJson(obj));   
    			json.append(",");   
    		}   
    		json.setCharAt(json.length() - 1, ']');   
    	} else {   
    		json.append("]");   
    	}   
    	return json.toString();   
    }
    /**  
     * 功能描述:传入任意一个 javabean 对象生成一个指定规格的字符串  
     *   
     * @param bean  
     *            bean对象  
     * @return String  
     */  
    public static String beanToJsonWithName(Object bean) {   
    	StringBuilder json = new StringBuilder();   
    	json.append("{");   
    	PropertyDescriptor[] props = null;   
    	try {   
    		props = Introspector.getBeanInfo(bean.getClass(), Object.class)   
    				.getPropertyDescriptors();   
    	} catch (IntrospectionException e) {   
    	}   
    	if (props != null) {   
    		for (int i = 0; i < props.length; i++) {   
    			try {   
    				String name = bean.getClass().getSimpleName();
    				//name在递归调用之后会连接上一段乱码，看似其存储地址，需要去掉
    				if(name.indexOf("$")>-1){
    					name = name.substring(0,name.indexOf("$"));
    				}
    				name += "."+props[i].getName();    
    				Object object=props[i].getReadMethod().invoke(bean);
    				String value=getJsonValue(object);
                    json.append("\"").append(name).append("\"").append(":").append(value).append(","); 
    				//json.append(",");   
    			} catch (Exception e) {   
    			}   
    		}   
    		json.setCharAt(json.length() - 1, '}');   
    	} else {   
    		json.append("}");   
    	}   
    	return json.toString();   
    }   
    
    /**  
     * 功能描述:通过传入一个列表对象,调用指定方法将列表中的数据生成一个JSON规格指定字符串  
     *   
     * @param list  
     *            列表对象  
     * @return java.lang.String  
     */  
    public static String listToJsonWithName(List<?> list) {   
    	StringBuilder json = new StringBuilder();   
    	json.append("[");   
    	if (list != null && list.size() > 0) {   
    		for (Object obj : list) {   
    			json.append(beanToJsonWithName(obj));   
    			json.append(",");   
    		}   
    		json.setCharAt(json.length() - 1, ']');   
    	} else {   
    		json.append("]");   
    	}   
    	return json.toString();   
    }
    
    
    /**
     * 只拼接需要的字段
     * @param list
     * @param fields
     * @return
     * @date 2014-9-4 下午05:36:52
     *
     */
    public static String beanToJsonWithField(Object bean,String[] fields){
    	StringBuilder json = new StringBuilder();   
        json.append("{");   
        PropertyDescriptor[] props = null;   
        try {   
            props = Introspector.getBeanInfo(bean.getClass(), Object.class)   
                    .getPropertyDescriptors();   
        } catch (IntrospectionException e) {   
        }   
        if (props != null) {   
            for (int i = 0; i < props.length; i++) {   
                try {   
                    String name = props[i].getName();   
                	if(!isIn(fields,name)){
                		continue;
                	}
                    Object object=props[i].getReadMethod().invoke(bean);
                    String value=getJsonValue( object);
                    json.append("\"").append(name).append("\"").append(":").append(value).append(",");   
                } catch (Exception e) {   
                }   
            }   
            json.setCharAt(json.length() - 1, '}');   
        } else {   
            json.append("}");   
        }   
        return json.toString(); 
    }
    /**
     * 只拼接其他的字段
     * @param list
     * @param fields
     * @return
     * @date 2014-9-4 下午05:36:52
     * 
     */
    public static String beanToJsonWithoutField(Object bean,String[] fields){
    	StringBuilder json = new StringBuilder();   
    	json.append("{");   
    	PropertyDescriptor[] props = null;   
    	try {   
    		props = Introspector.getBeanInfo(bean.getClass(), Object.class)   
    		.getPropertyDescriptors();   
    	} catch (IntrospectionException e) {   
    	}   
    	if (props != null) {   
    		for (int i = 0; i < props.length; i++) {   
    			try {   
    				String name = props[i].getName();   
    				if(isIn(fields,name)){
    					continue;
    				}
    				Object object=props[i].getReadMethod().invoke(bean);
    				String value=getJsonValue( object);
    				json.append("\"").append(name).append("\"").append(":").append(value).append(",");   
    			} catch (Exception e) {   
    			}   
    		}   
    		json.setCharAt(json.length() - 1, '}');   
    	} else {   
    		json.append("}");   
    	}   
    	return json.toString(); 
    }
    
    public static boolean isIn(Object[] objs,Object obj){
    	for(Object object : objs){
    		if(object.equals(obj)) return true;
    	}
    	return false;
    }
    
    public static String getJsonValue(Object object){
    	String value = "";
    	if(object instanceof Date){
        	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	value=sdf.format((Date)object);
        	if(value.substring(10).equals(" 00:00:00")){
        		value = value.substring(0,10);
        	}
        	value = "\""+value+"\"";
        }else if(object instanceof Integer){
        	value="\""+object+"\"";
        }else if(object instanceof Long){
        	value="\""+object+"\"";
        }else if(object instanceof String) {
        	value = (String)object;
        	//特殊字符处理
    		value = value.replaceAll("\"", "\'");
    		value = value.replaceAll("\n\r|\r|\n", "<br>");
        	value = "\""+ value + "\"";
        }else if(object instanceof Boolean) {
        	value = object.toString();
        }else if(object instanceof Double) {
        	value = object.toString();
        }else if(object instanceof List<?>) {
        	value = listToJson((List<?>)object);
        }else if(object==null){
        	value = "\"\"";
        }else{
        	value = "\"不支持的数据类型\"";
        }
    	
    	return value;
    }
}