
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "consultaCep", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaCep", namespace = "http://control/")
public class ConsultaCep {

    @XmlElement(name = "cep", namespace = "")
    private String cep;

    /**
     * 
     * @return
     *     returns String
     */
    public String getCep() {
        return this.cep;
    }

    /**
     * 
     * @param cep
     *     the value for the cep property
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

}
