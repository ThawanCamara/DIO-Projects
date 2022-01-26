package dio.gof.singleton;

/**
 * Pre-initialized implementation of a Singleton.
 * 
 * @author ThawanCamara
 *
 */
public class SingletonEager {
	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstance() {
		return instance;		
	}
}
