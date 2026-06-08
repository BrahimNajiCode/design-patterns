package behavioral.strategy.compression;

public class Main {
    public static void main(String[] args) {
        Compressor compressor = new Compressor(new ZIP());
        // Looks classic, but just for organizational purposes
        String fileName = "file.md";
        compressor.execute(fileName);
        compressor.setCompressionStrategy(new RAR());
        compressor.execute(fileName);
    }
}
