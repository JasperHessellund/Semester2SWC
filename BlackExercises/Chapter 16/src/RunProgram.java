/**
 * Created by jasperhessellund on 22/09/16.
 */
public class RunProgram {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        LinkedIntList list1 = new LinkedIntList();

        list.add(0,1);
        list.add(1,1);

        System.out.println("(Ex 1 & 2) list: "+ list);
        System.out.println();
        //Ex 1 *Done*
        list.set(1,3);
        System.out.println("(Ex 1) set method: "+list);
        System.out.println();
        //Ex 2 *Done*
        System.out.println("(Ex 2) max method: "+ list.max());
        System.out.println();

        //Ex 3
        list.newList();
        list.add(1);list.add(2);list.add(3);
        //System.out.println(list.isSorted());
        //Ex 4 *Done*
        list.newList();
        list.add(1);list.add(18);list.add(2);list.add(7);list.add(18);list.add(37);list.add(18);list.add(40);
        System.out.println("(Ex 4) list: "+ list);

        System.out.println("(Ex 4) lastIndexOf method: "+list.lastIndexOf(18));
        System.out.println();


        //Ex 5 *Done*
        list.newList();
        list.add(1); list.add(1); list.add(1); list.add(3); list.add(3); list.add(6); list.add(9); list.add(15); list.add(15);
        list.add(23); list.add(23); list.add(23); list.add(40); list.add(40);
        System.out.println("(Ex 5) list: "+list);
        System.out.println("(Ex 5) countDuplicates method: "+list.countDuplicates());
        System.out.println();


        //Ex 6
        list.newList();
        list.add(1); list.add(18);list.add(2); list.add(7);list.add(8); list.add(39);list.add(18); list.add(40);
        System.out.println(("(Ex 6) list: "+list));
        System.out.println("(Ex 6) hasTwoConsecutive method: " +list.hasTwoConsecutive());
        System.out.println();

        //Ex 7 *Done*
        System.out.println("(Ex 7) list: "+list);
        list.deleteBack();
        System.out.println("(Ex 7) deleteBack method: "+list);
        System.out.println();


        //Ex 8
        list.newList();
        list.add(10); list.add(25);list.add(31); list.add(47);list.add(52); list.add(68); list.add(77);
        System.out.println("(Ex 8) list: "+list);
        list.switchPairs();
        System.out.println("(Ex 8) switchPairs method: "+ list);
        System.out.println();

        //Ex 9 *Done*
        list.newList();
        list.add(1); list.add(8);list.add(19); list.add(4);list.add(17);
        System.out.println("(Ex 9) list: "+list);
        list.stutter();
        System.out.println("(Ex 9) stutter method: "+list);
        System.out.println();

        //Ex 10 *Done*
        list.newList();
        list.add(18);list.add(7);list.add(4);list.add(24);list.add(11);
        System.out.println("(Ex 10) list: "+ list );
        list.stretch(4);
        System.out.println("(Ex 10) stretch method: "+list);
        System.out.println();

        //Ex 11 *Done*
        list.newList();
        list.add(1);list.add(7);list.add(3);list.add(9);list.add(4);list.add(6);list.add(5);
        System.out.println("(Ex 11) list: "+ list);
        list.compress();
        System.out.println("(Ex 11) compress method: "+ list);
        System.out.println();

        //Ex 12 *Done*
        list.newList();
        list.add(8);list.add(7);list.add(-4);list.add(19);list.add(0);list.add(43);list.add(-8);list.add(-7);list.add(2);
        System.out.println("(Ex 12) list: "+ list);
        list.split();
        System.out.println("(Ex 12) split method: "+ list);
        System.out.println();

        //Ex 13
        list.newList();
        list.add(8);list.add(17);list.add(2);list.add(4);
        list1.add(1); list1.add(2);list1.add(3);
        System.out.println("(Ex 13) list's: "+list+" & "+list1);
        list1.transferFrom(list);
        System.out.println("(Ex 13) transferFrom method list1: "+ list1 +" "+list);


        list.newList();
        list1.newList();
        list.add(8);list.add(17);list.add(2);list.add(4);
        list1.add(1); list1.add(2);list1.add(3);
        list.transferFrom(list1);
        System.out.println("(Ex 13) transferFrom method list2: "+ list+" "+list1);

        //Ex 14 *Done*
        list.newList();
        list.add(3);list.add(9);list.add(4);list.add(2);list.add(3);list.add(8);list.add(17);list.add(4);list.add(3);
        list.add(18);
        System.out.println("(Ex 14) list: "+ list);
        list.removeAll(3);

        System.out.println("(Ex 14) removeAll method: "+ list);

        //Ex 15 *Done?*
        list.newList(); list1.newList();

        list.add(3);list.add(3);
        list1.add(3);list1.add(3);

        System.out.println(list.notEquals(list1));

        //Ex 16
        list.newList(); list1.newList();

        list.add(8);list.add(13);list.add(17);list.add(4);list.add(9);list.add(12);list.add(98);list.add(41);list.add(7);list.add(23);
        list.add(0);list.add(92);
        //LinkedIntList list2 = list.removeEvens();
        //System.out.println(list2);

        //Ex 17 *Done*
        list.newList();
        list.add(8);list.add(13);list.add(17);list.add(4);list.add(9);list.add(12);list.add(98);list.add(41);
        list.add(7);list.add(23);list.add(0);list.add(92);
        list.removeRange(3,8);
        System.out.println(list);




    }
}
