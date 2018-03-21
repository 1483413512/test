// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CommonUtils.java

package cn.com.hkr.commons;

import java.util.*;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;

// Referenced classes of package cn.com.hkr.commons:
//			DateConverter

public class CommonUtils
{

	public CommonUtils()
	{
	}

	public static String uuid()
	{
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}

	public static Object toBean(Map map, Class clazz)
	{
		Object bean;
		bean = clazz.newInstance();
		ConvertUtils.register(new DateConverter(), java/util/Date);
		BeanUtils.populate(bean, map);
		return bean;
		Exception e;
		e;
		throw new RuntimeException(e);
	}
}
