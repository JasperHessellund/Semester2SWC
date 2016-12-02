/**
 * Created by jasperhessellund on 03/10/2016.
 */
public class RunProgram {
    public static void main(String[] args) throws Exception {
        Exercises e = new Exercises();
        IntSearchTree tree = new IntSearchTree();
        e.add(17);
        e.add(42);
        e.add(8);
        e.add(29);
        e.add(6);
        e.add(81);
        tree.add(17);
        tree.add(42);
        tree.add(8);
        tree.add(29);
        tree.add(6);
        tree.add(81);


        System.out.println(e);
        e.printSideways();
        e.printInorder();
        e.printPreorder();
        e.printPostorder();
        System.out.println();
        e.print();
        e.countLeftNodes();
        System.out.println("(Ex 2) countEmpty method: "+ e.countEmpty());


        System.out.println(e.depthSum());
        e.countEvenBranches();
        e.printLevel(1);
        e.printLeaves();
        e.isFull();
        System.out.println(e.toString());
        System.out.println(tree.toString());
        System.out.println(e.isEqual(tree));
        e.doublePositives();
        System.out.println(e);




    }
}
