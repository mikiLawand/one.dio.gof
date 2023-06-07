package Singleton;

public class SingletonLazyHolder {
    
    private static class InstanceHolder {
        public static SingletonLazyHolder instacia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instacia;
    }
}

