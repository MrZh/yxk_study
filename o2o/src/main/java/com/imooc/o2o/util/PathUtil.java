package com.imooc.o2o.util;

public class PathUtil {
	private static String seperator = System.getProperty("file.seperator");
	public static String getImgBasePath()
	{
		String windows = System.getProperty("windows.name");
		String basePath="";
		if(windows.toLowerCase().startsWith("win"))
		{
			basePath = "G:/muke/images/";
		}
		else
		{
			basePath = "/home/yjy/image/";
		}
		basePath = basePath.replaceAll("/", seperator);
		return basePath;
	}
	public static String getShopImagePath(long shopId)
	{
		String imagePath = "G:/upload/item/shop/" + shopId + "/";
		return imagePath;//.replace("/", seperator);
	}
}
