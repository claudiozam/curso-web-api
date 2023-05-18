
package edu.curso.java.clientews.clientegenerado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.curso.java.clientews.clientegenerado package. 
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

    private final static QName _RecuperarProductoPorId_QNAME = new QName("http://ws.java.curso.edu/", "recuperarProductoPorId");
    private final static QName _RecuperarProductoPorIdResponse_QNAME = new QName("http://ws.java.curso.edu/", "recuperarProductoPorIdResponse");
    private final static QName _Saludar_QNAME = new QName("http://ws.java.curso.edu/", "saludar");
    private final static QName _SaludarResponse_QNAME = new QName("http://ws.java.curso.edu/", "saludarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.curso.java.clientews.clientegenerado
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecuperarProductoPorId }
     * 
     */
    public RecuperarProductoPorId createRecuperarProductoPorId() {
        return new RecuperarProductoPorId();
    }

    /**
     * Create an instance of {@link RecuperarProductoPorIdResponse }
     * 
     */
    public RecuperarProductoPorIdResponse createRecuperarProductoPorIdResponse() {
        return new RecuperarProductoPorIdResponse();
    }

    /**
     * Create an instance of {@link Saludar }
     * 
     */
    public Saludar createSaludar() {
        return new Saludar();
    }

    /**
     * Create an instance of {@link SaludarResponse }
     * 
     */
    public SaludarResponse createSaludarResponse() {
        return new SaludarResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarProductoPorId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecuperarProductoPorId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.java.curso.edu/", name = "recuperarProductoPorId")
    public JAXBElement<RecuperarProductoPorId> createRecuperarProductoPorId(RecuperarProductoPorId value) {
        return new JAXBElement<RecuperarProductoPorId>(_RecuperarProductoPorId_QNAME, RecuperarProductoPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecuperarProductoPorIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecuperarProductoPorIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.java.curso.edu/", name = "recuperarProductoPorIdResponse")
    public JAXBElement<RecuperarProductoPorIdResponse> createRecuperarProductoPorIdResponse(RecuperarProductoPorIdResponse value) {
        return new JAXBElement<RecuperarProductoPorIdResponse>(_RecuperarProductoPorIdResponse_QNAME, RecuperarProductoPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saludar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Saludar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.java.curso.edu/", name = "saludar")
    public JAXBElement<Saludar> createSaludar(Saludar value) {
        return new JAXBElement<Saludar>(_Saludar_QNAME, Saludar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaludarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.java.curso.edu/", name = "saludarResponse")
    public JAXBElement<SaludarResponse> createSaludarResponse(SaludarResponse value) {
        return new JAXBElement<SaludarResponse>(_SaludarResponse_QNAME, SaludarResponse.class, null, value);
    }

}
