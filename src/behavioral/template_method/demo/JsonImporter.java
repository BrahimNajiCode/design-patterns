package behavioral.template_method.demo;

public class JsonImporter extends DataImporter{

    @Override
    protected void validateData(String fileName) {
        System.out.println("Validating the "+fileName+" JSON file...");
    }
}
