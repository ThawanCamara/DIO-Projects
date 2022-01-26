package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.AggressiveBehavior;
import dio.gof.strategy.Behavior;
import dio.gof.strategy.DefensiveBehavior;
import dio.gof.strategy.NormalBehavior;
import dio.gof.strategy.Robot;

public class Test {

	public static void main(String[] args) {
		
		//Singleton
		
		System.out.println("========================");
		System.out.println("Singleton");
		System.out.println("========================");
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		SingletonLazy lazy2 = SingletonLazy.getInstance();
		System.out.println(lazy2);
		
		
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		SingletonEager eager2 = SingletonEager.getInstance();
		System.out.println(eager2);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder2);
		
		//Strategy
		
		System.out.println("========================");
		System.out.println("Strategy");
		System.out.println("========================");
		
		Behavior normal = new NormalBehavior();
		Behavior defensive = new DefensiveBehavior();
		Behavior aggressive = new AggressiveBehavior();
		
		Robot robot = new Robot();
		robot.setBehavior(normal);		
		robot.move();
		robot.move();
		robot.setBehavior(defensive);
		robot.move();
		robot.setBehavior(aggressive);
		robot.move();
		robot.move();
		robot.move();
		
		//Facade
		
		System.out.println("========================");
		System.out.println("Facade");
		System.out.println("========================");
		
		Facade facade = new Facade();
		facade.migrateClient("Venilton", "14801788");
	}

}
