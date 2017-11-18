package org.pkk.domain;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.pkk.domain.business.ProductServiceImpl;
import org.pkk.model.Product;

@WebService(endpointInterface="org.pkk.domain.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface  {
	ProductServiceImpl impl = new ProductServiceImpl();
	
	//@WebMethod(action="fetch_catagories", operationName="fetchcatagories")
	public List<String> getProductCatagories(){
		return impl.getProductCatagories();
	}
	
	//@WebMethod(exclude=true)
	public List<String> getProducts(String catagory){
		return impl.getProducts(catagory);
	}
	//@WebMethod
	public boolean addProducts(String catagory, String product){
		return impl.addProducts(catagory,product);
	}

	@Override
	public List<Product> getProductsV2(String catagories) {
		// TODO Auto-generated method stub
		return null;
	}
}
