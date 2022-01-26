package dio.gof.singleton;

/**
 * Lazy holder implementation of a Singleton.
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Reference</a>
 * 
 * @author ThawanCamara
 *
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		private static SingletonLazyHolder instance = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstance() {
		return InstanceHolder.instance;
	}
}
