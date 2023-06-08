package Singleton;

public class SingletonLazyHolder {
    
    private static class InstanceHolder {
        public static SingletonLazyHolder instacia = new SingletonLazyHolder();
    }
    
    //inicializando a classe para requisição de nova instancia 
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instacia;
        //retornando a instancia que ele já tinha armazenado para reutilização
    }
}

