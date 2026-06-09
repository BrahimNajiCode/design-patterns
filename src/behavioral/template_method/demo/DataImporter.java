package behavioral.template_method.demo;

abstract class DataImporter {

    public void importData(String fileName){
        openFile(fileName);
        readData(fileName);
        validateData(fileName);
        saveData(fileName);
        closeFile(fileName);
    }

    private void openFile(String fileName){
        System.out.println("Opening "+fileName+" ...");
    }
    private void readData(String fileName){
        System.out.println("Reading "+fileName+" ...");
    }
    private void saveData(String fileName){
        System.out.println("Saving "+fileName+" ...");
    }
    private void closeFile(String fileName){
        System.out.println("Closing "+fileName+" ...");
    }

    protected abstract void validateData(String fileName);
}
