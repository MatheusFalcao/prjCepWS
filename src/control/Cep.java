package control;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import model.Endereco;

@WebService
public class Cep {
	
	@WebMethod
public String[] consultaCep(@WebParam(name="cep") String cep){
		Endereco logradouro = new Endereco(cep);
		logradouro.consultaCep();
		String dados[] = new String[4];
		
		dados[0] = logradouro.getCep();
		dados[1] = logradouro.getEstado();
		dados[2] = logradouro.getRua();
		dados[3] = logradouro.getTipoLog();
		
		return dados;
		
	}
}
