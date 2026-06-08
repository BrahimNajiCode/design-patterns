package behavioral.strategy.compression;

public class SevenZed implements CompressionStrategy{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing "+fileName+" via 7z...");
    }
}
