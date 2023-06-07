import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;

public class Test {
    
    public static void main(String[] args) {
        
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println("Instacia do lazy "+lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println("Instacia do lazy "+lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println("Instacia do eager " + eager);
        eager = SingletonEager.getInstance();
        System.out.println("Instancia do Eager "+ eager);

        SingletonLazyHolder LazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("Instancia do Eager "+ LazyHolder);
        LazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("Instancia do Eager "+ LazyHolder);
    }
}

