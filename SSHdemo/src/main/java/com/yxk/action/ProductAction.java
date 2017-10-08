package com.yxk.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opensymphony.xwork2.ActionSupport;
import com.yxk.model.Product;
import com.yxk.service.ProductService;

@Controller
@Scope("prototype")
public class ProductAction extends ActionSupport  {

	private static final long serialVersionUID = 1L;
    
    @Autowired
    private ProductService productService;
     
    private String pname;
    private double price;
	     
	    /**
	     * ������Ʒ����
	     *
	     * @return
	     */
	    public String saveProduct() {
	         
	    	 Product product = new Product(pname, price);
	         productService.saveProduct(product);
	        this.addActionMessage("保存成功....");
	        return SUCCESS;
	         
	    }
	 
	    public String getPname() {
	        return pname;
	    }
	 
	    public void setPname(String pname) {
	        this.pname = pname;
	    }
	 
	    public double getPrice() {
	        return price;
	    }
	 
	    public void setPrice(double price) {
	        this.price = price;
	    }
	     
	    @Override
	    public void validate() {
	         
	        if(pname == null || "".equals(pname.trim())) {
	            this.addFieldError("pname", "商品名称不能为空");
	        }
	         
	    }
	    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
	    public String login()
	    {
			return "login";
	    	
	    }
}
