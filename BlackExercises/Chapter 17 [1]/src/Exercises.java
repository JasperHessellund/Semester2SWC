import org.junit.Test;

/**
 * Created by jasperhessellund on 18/11/2016.
 */
public class Exercises extends IntSearchTree {

    private IntTreeNode overallRoot;

    //Ex 1 *Done*
    public void countLeftNodes () {

        if (overallRoot==null) {
            System.out.println("(Ex 1) countLeftNodes method: "+0);
        } else {
            System.out.println("(Ex 1) countLeftNodes method: " + countLeftNodes(overallRoot));
        }
    }
    private int countLeftNodes (IntTreeNode root) {

        int count = 0;

        if (root.left!=null){

            count += 1 +countLeftNodes(root.left);

        }
        if (root.right!=null) {

            count+= countLeftNodes(root.right);
        }

        return count;

    }

    //Ex 2 *Done*
    public int countEmpty () {

        return countEmpty(overallRoot);


    }
    private int countEmpty (IntTreeNode root) {
        int count = 0;
        if (overallRoot==null) {
            return 1;
        }
        if (root==null) {
            return 0;

        }

        if (root.left==null) {
            count++;

        }
        if (root.right==null) {

            count++;

        }

        return count+ countEmpty(root.left)+countEmpty(root.right);


    }
      
    //Ex 3 *Done*
    public int depthSum () {
        System.out.print("(Ex 3) depthSum method: ");
        return depthSum(overallRoot,1);

    }
    private int depthSum (IntTreeNode root, int level) {

        //If root is empty return 0
        if (root==null) {
            return 0;
        }

        else {
            // (1) * (the root data) + (left data * foreach level++) + (right data * foreach level++)
            //  |          |                   |           |                   |           |
            //  V          V                   V           V                   V           V
            return level  * root.data + depthSum(root.left, level+1) + depthSum(root.right, level+1);
        }

    }

    //Ex 4 *Done*
    public void countEvenBranches () {
        System.out.println("(Ex 4) countEvenBranches method: "+countEvenBranches(overallRoot));
    }
    private int countEvenBranches (IntTreeNode root) {

        if (root==null) {
            return 0;
        }
        else if (root.data%2==1||root.left==null&&root.right==null) {
            return countEvenBranches(root.left)+ countEvenBranches(root.right);
        }
        else {
            return 1+countEvenBranches(root.left)+countEvenBranches(root.right);
        }

    }

    //Ex 5 *Done*
    public void printLevel (int level) throws Exception {
        System.out.print("(Ex 5) printLevel method: ");
        printLevel(overallRoot, level);

    }
    private void printLevel (IntTreeNode root, int level) throws Exception {
        if (level <1) {
            throw new IllegalArgumentException("Level can't be less than 1");
        }
        if (root==null) return;
        if (level == 1) {
            System.out.println(root.data);
        }
        else {
            printLevel(root.left,level-1);
            printLevel(root.right,level-1);
        }



    }

    //Ex 6 *Done*
    public void printLeaves () {
        System.out.print("(Ex 6) printLeaves method: leaves: ");
        printLeaves(overallRoot);
        System.out.println();

    }
    private void printLeaves (IntTreeNode root) {

        if (root==null) return;

        if (root.right!=null) {
            printLeaves(root.right);

        }
        if (root.left!=null) {
            printLeaves(root.left);

        }
        else {
            System.out.print(root.data+" ");
        }


    }

    //Ex 7 *Done*
    public void isFull () {
        System.out.print("(Ex 7) isFull method: ");
        System.out.println(isFull(overallRoot));
    }
    private boolean isFull(IntTreeNode root) {
        int count = countEmpty(overallRoot);
        if (root==null) return true;

        return count%2==0;

    }

    //Ex 8 *Done*
    public String toString () {

        return toString(overallRoot);

    }
    private String toString (IntTreeNode root) {
        String s = "";
        if (overallRoot==null) {
            return "empty";
        }

        if (root==null) return "";
        String s2 = String.valueOf(root.data);
        s+= " (";
        s+=s2;

        if (root.left==null) {
            s += ", empty";
        }
        if (root.right==null) {
            s+= ", empty";
        }
        if (root.left!=null) {
            s+=",";
            s+=toString(root.left);
        }
        if (root.right!=null) {
            s+=",";
            s+=toString(root.right);
        }
        s+=")";

        return s;
    }

    //Ex 9 *Done*
    public boolean isEqual (IntSearchTree tree) {


        String s = tree.toString();
        return isEqual(overallRoot).equals(s);

    }
    private String isEqual (IntTreeNode root) {
        String s = "";
        if (overallRoot==null) {
            return "empty";
        }

        if (root==null) return "";
        String s2 = String.valueOf(root.data);
        s+= " (";
        s+=s2;

        if (root.left==null) {
            s += ", empty";
        }
        if (root.right==null) {
            s+= ", empty";
        }
        if (root.left!=null) {
            s+=",";
            s+=toString(root.left);
        }
        if (root.right!=null) {
            s+=",";
            s+=toString(root.right);
        }
        s+=")";

        return s;
    }

    //Ex 10 *Done*
    public void doublePositives () {
        doublePositives(overallRoot);

    }
    private IntTreeNode doublePositives (IntTreeNode root) {
        if (root!=null) {
            if(root.data>0) {
                root.data =2 * root.data;
            }
            doublePositives(root.left);
            doublePositives(root.right);

        }
        return root;
    }

}
