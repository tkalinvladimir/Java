

import java.util.jar.Attributes;

public class SAX_Handler {
    private static String CLASSNAME = "class";
    private Object object;
    private String element;

    public void startElement(String uri, String localName, String qname, Attributes attributes) {
        if (qname != CLASSNAME) {
            element = qname;
        }
        else {
            String className = attributes.getValue(String.valueOf(0));
            System.out.println("Class name: " + className);
            object = ReflectionHelper.createInstance(className);
        }
    }

    public void endElement(String uri, String localName, String qname) {
        element = null;
    }

    public void characters(char ch[], int start, int lenght) {
        if (element != null) {
            String value = new String(ch, start, lenght);
            System.out.println(element + "=" + value);
            ReflectionHelper.setFieldValue(object, element, value);
        }
    }
}
