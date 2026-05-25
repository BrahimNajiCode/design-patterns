package structural.adapter.formatter;

public class XmlToJsonAdapter implements JsonFormatter{
    // Inject adaptee (XMLConverter)
    private XMLConverter xmlConverter;

    public XmlToJsonAdapter(XMLConverter xmlConverter) {
        this.xmlConverter = xmlConverter;
    }

    @Override
    public String toJson() {
        String xml = xmlConverter.toXml();
        // Converts XML -> Json
        return"{\n\"data\":\"value\"\n}" ;
    }
}
