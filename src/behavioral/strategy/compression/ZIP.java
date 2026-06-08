package behavioral.strategy.compression;

public class ZIP implements CompressionStrategy{

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing "+fileName+" via zip...");
    }
}
