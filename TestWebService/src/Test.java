import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;
import java.net.URL;

public class Test {
    public static void main(String[] args) {

        URL url = new URL("http://localhost:9876/one?wsdl");

        // Qualified name of the service:
        //   1st arg is the service URI
        //   2nd is the service name published in the WSDL

        QName qname = new QName("http://one.javasamples/", "TimeServerImplService");

        // Create, in effect, a factory for the service.

        Service service = Service.create(url, qname);

        // Extract the endpoint interface, the service "port".

        TimeServer eif = service.getPort(TimeServer.class);

        System.out.println(eif.getTimeAsString());
        System.out.println(eif.getTimeAsElapsed());
    }
}
