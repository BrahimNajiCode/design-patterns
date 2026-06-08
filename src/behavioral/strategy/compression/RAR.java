package behavioral.strategy.compression;

public class RAR implements CompressionStrategy{

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing "+fileName+" via RAR...");
    }
}
