package com.yxk.imp;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;


import com.yxk.model.Product;
import com.yxk.service.ProductService;

@Service
public class ProductDaoImpl  implements ProductService{

	 private HibernateTemplate template;
     
	    @Autowired
	    public ProductDaoImpl(SessionFactory sessionFactory) {
	         
	        template = new HibernateTemplate(sessionFactory);
	         
	    }
	
	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		template.save(product);
	}

}
