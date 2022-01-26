package dio.gof.facade;

import dio.gof.subsystem1.crm.CrmService;
import dio.gof.subsystem2.zipcode.ZipCodeApi;

public class Facade {
	
	public void migrateClient(String name, String zipCode) {
		String city = ZipCodeApi.getInstance().retrieveCity(zipCode);
		String state = ZipCodeApi.getInstance().retrieveState(zipCode);
		
		CrmService.saveCustomer(name, zipCode, city, state);
	}
}
