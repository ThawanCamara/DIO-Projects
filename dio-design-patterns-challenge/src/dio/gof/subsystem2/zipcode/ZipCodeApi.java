package dio.gof.subsystem2.zipcode;

public class ZipCodeApi {
	
	private static ZipCodeApi instance = new ZipCodeApi();
	
	private ZipCodeApi() {
		super();
	}
	
	public static ZipCodeApi getInstance() {
		return instance;		
	}
	
	public String retrieveCity(String zipCode) {
		return "Araraquara";
	}
	
	public String retrieveState(String zipCode) {
		return "SP";
	}
}
