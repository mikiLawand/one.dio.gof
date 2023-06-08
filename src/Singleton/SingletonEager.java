package Singleton;

public class SingletonEager {
    
    //Instancia é inicializada logo de cara 
    private static SingletonEager instacia = new SingletonEager();
    
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instacia;
    }
}

