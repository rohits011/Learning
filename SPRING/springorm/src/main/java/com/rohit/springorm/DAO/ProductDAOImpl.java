package com.rohit.springorm.DAO;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.rohit.springorm.entity.Product;

@Component("dao")
public class ProductDAOImpl implements ProductDAO {
	
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product p) {
		Integer result = (Integer) hibernateTemplate.save(p);		// TODO Auto-generated method stub
		return result;
	}

	@Override
	@Transactional
	public void update(Product p) {
		hibernateTemplate.update(p);
		// TODO Auto-generated method stub
//		return result
	}

	@Override
	@Transactional
	public void delete(Product p) {
		hibernateTemplate.delete(p);
		// TODO Auto-generated method stub
//		return 0;
	}

	@Override
	@Transactional
	public Product find(int id) {
		Product product=hibernateTemplate.get(Product.class,id);
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> l=hibernateTemplate.loadAll(Product.class);
		// TODO Auto-generated method stub
		return l;
	}

}
