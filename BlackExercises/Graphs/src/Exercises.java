import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by jasperhessellund on 18/10/2016.
 */
public class Exercises extends AbstractGraph {

    //Ex 28.1
    public void graphsEx281() throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<AbstractGraph.Edge> edgeList = new ArrayList<>();

        System.out.print("Enter file path: ");

        Scanner scan = new Scanner(System.in);
        File path = new File(scan.nextLine());
        Scanner input = new Scanner(path);
        try {
            int vertNum = input.nextInt();


            String[] vertArr = new String[vertNum];

            input.nextLine();


            System.out.println();
            System.out.println("The number of vertices is: " + vertNum);
            for (int i = 0; i < vertNum; i++) {
                String s = input.nextLine();

                String[] arr = s.split("[\\s+]");

                String firstNum = arr[0];

                vertArr[i] = firstNum;


                for (int j = 1; j < arr.length; j++) {


                    edgeList.add(new AbstractGraph.Edge(Integer.parseInt(firstNum),
                            Integer.parseInt(arr[j])));


                }

            }
            Collections.addAll(list, vertArr);
            Graph<String> g = new UnweightedGraph<>(
                    list, edgeList);
            g.printEdges();
            AbstractGraph.Tree tree = g.dfs(0);

            if (tree.getNumberOfVerticesFound() == vertNum) {
                System.out.println("The graph is connected");
            } else System.out.println("The graph is not connected");

        } catch (InputMismatchException ime) {
            System.out.println("(Error) Input file must contain numbers only");
        }
    }
}


