package org.pkk.domain;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.pkk.model.Product;

@WebService(name="TestMartCatalog", portName = "TestMartCatalogPort", serviceName="TestMartCatalogService",
targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_catagories", operationName="fetchCatagories")
	public abstract List<String> getProductCatagories();
	
	@WebMethod
	public abstract List<String> getProducts(String catagories);
	
	@WebMethod
	public abstract boolean addProducts(String catagories, String product);
	
	@WebMethod
	@WebResult(name="Product")
	public abstract List<Product> getProductsV2(String catagories);
}
