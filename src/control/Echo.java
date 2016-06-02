package control;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Echo {
	
	@WebMethod
	public String echo(@WebParam(name="frase") String frase){
		return "Echo : " + frase;
	}
}
