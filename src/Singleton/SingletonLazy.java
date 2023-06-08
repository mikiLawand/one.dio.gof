package Singleton;

public class SingletonLazy {
    //criando uma instancia da classe SingletonLazy
    private static SingletonLazy instancia;
    private SingletonLazy(){
        super();
    }

    //obtendo a instancia da classe SingletonLazy
    public static SingletonLazy getInstance(){
        if( instancia == null ){ //se ela ainda não tiver sido criada,
            instancia = new SingletonLazy(); //é criada uma nova instancia
        }
        return instancia; //caso contrário,retorna a instancia já existente 
    }
}
