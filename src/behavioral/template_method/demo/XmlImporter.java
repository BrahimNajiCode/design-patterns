package behavioral.template_method.demo;

public class XmlImporter extends DataImporter{

    @Override
    protected void validateData(String fileName) {
        System.out.println("Validating the "+fileName+" XML file...");
    }
}
