package org.pkk.service;

import java.security.Provider.Service;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Need to pass IP Address");
		}

		else{
			String ipAddress = args[0];
			GeoIPService service = new GeoIPService();
			GeoIPServiceSoap ip = service.getGeoIPServiceSoap();
			GeoIP name = ip.getGeoIP(ipAddress);
			System.out.println(name.getCountryName());
		}
		
	}

}
