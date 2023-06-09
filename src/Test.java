
import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Test {
    
    public static void main(String[] args) {
        
        //Singleton
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

        //Strategy 

        //instanciando todos os tipos de comportamentos 
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        

        //criando um novo robo
        Robo robo = new Robo();
        //definindo um comportamento 
        robo.setComportamento(normal);
        //deixando o robo escolher o proprio comportamento 
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //facade
        //criando uma nova instancia para o facede
        Facade facede = new Facade();
        //migrando dados do cliente para subsistema
        facede.migrarCliente("Tony", "14801");


    }
}





