
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultaCepResponse_QNAME = new QName("http://control/", "consultaCepResponse");
    private final static QName _ConsultaCep_QNAME = new QName("http://control/", "consultaCep");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaCep }
     * 
     */
    public ConsultaCep createConsultaCep() {
        return new ConsultaCep();
    }

    /**
     * Create an instance of {@link ConsultaCepResponse }
     * 
     */
    public ConsultaCepResponse createConsultaCepResponse() {
        return new ConsultaCepResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCepResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "consultaCepResponse")
    public JAXBElement<ConsultaCepResponse> createConsultaCepResponse(ConsultaCepResponse value) {
        return new JAXBElement<ConsultaCepResponse>(_ConsultaCepResponse_QNAME, ConsultaCepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "consultaCep")
    public JAXBElement<ConsultaCep> createConsultaCep(ConsultaCep value) {
        return new JAXBElement<ConsultaCep>(_ConsultaCep_QNAME, ConsultaCep.class, null, value);
    }

}
