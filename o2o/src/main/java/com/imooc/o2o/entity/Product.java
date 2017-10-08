package com.imooc.o2o.entity;

import java.util.Date;
import java.util.List;

public class Product {
	//商品id
	private Long productId;
	//商品名称
	private String productName;
	//商品描述
	private String productDesc;
	//缩略图
	private String imgAddr;
	//商品原价
	private String normalPrice;
	//商品折扣价
	private String promotionPrice;
	//商品显示权重（优先级）
	private Integer priority;
	//商品创建时间
	private Date createTime;
	//商品修改时间
	private Date lastEditTime;
	//商品状态： 0.下架 1.在前端展示系统展示
	private Integer enableStatus;
	//商品详情图片列表
	private List<ProductImg> productImgList;
	//商品类别
	private ProductCategory productCategory;
	//商品店铺发布
	private Shop shop;
}
