package behavioral.template_method.demo;

public class Main {
    public static void main(String[] args) {
        DataImporter jsonImporter = new JsonImporter();
        jsonImporter.importData("file.json");
        System.out.println("==========================");
        DataImporter xmlImporter = new JsonImporter();
        xmlImporter.importData("pom.xml");

    }
}
