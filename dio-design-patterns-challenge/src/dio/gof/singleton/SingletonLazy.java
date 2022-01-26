package dio.gof.singleton;

/**
 * Lazy implementation of a Singleton.
 * 
 * @author ThawanCamara
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instance;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstance() {
		if (instance == null)
			instance = new SingletonLazy();
		return instance;		
	}
}
