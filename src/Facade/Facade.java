package Facade;
import Subsistema1.crm;
import Susistema2.cepApi;

public class Facade {
    
    public void migrarCliente(String nome, String cep) {
		String cidade = cepApi.getInstancia().recuperarCidade(cep);
		
		crm.gravarCliente(nome, cep, cidade);

		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);

	}
}

