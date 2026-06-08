package structural.flyweight.video_game;

public class Forest {
    private Tree[] trees = new Tree[10000];
    public void plantTrees(){
        TreeType oak = TreeFactory.getTreeType("Oak", "Green", new byte[1000]);
        TreeType pine = TreeFactory.getTreeType("Pine", "DarkGreen", new byte[1000]);

        for(int i=0; i<100;++i){
            // Math.random() => double
            int x = (int) (Math.random()*100);
            int y = (int) (Math.random()*100);

            // Alternate between oak and pine
            TreeType type = (i % 2 == 0) ? oak : pine;
            trees[i] = new Tree(x, y, type);
        }
    }

    public void draw() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTrees();
        forest.draw();
    }
}
