
import org.openjdk.jol.info.GraphLayout;
import org.openjdk.jol.vm.VM;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class GuessSize {

    public static void main(String[] args) throws Exception {
        GuessSize.guess();
    }

    public static void guess() throws Exception {
        System.out.println(VM.current().details());
        int[] intArray = new int[1000];
        Integer[] integerArray = new Integer[1000];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<Integer, Integer>();

        for (int i = 0; i < 1000; i++) {
            Integer io = i;
            intArray[i] = io;
            integerArray[i] = io;
            arrayList.add(io);
            linkedList.add(io);
            hashSet.add(io);
            hashMap.put(i, i);
            concurrentHashMap.put(i, i);
        }

        arrayList.trimToSize();

        System.out.println("====================================================================");
        System.out.println(">> new Integer(10)");
        System.out.println(GraphLayout.parseInstance(new Integer(10)).toPrintable());
        System.out.println("====================================================================");
        System.out.println(">> new Long(10)");
        System.out.println(GraphLayout.parseInstance(new Long(10)).toPrintable());
        System.out.println("====================================================================");
        System.out.println(">> new int[1000]");
        System.out.println(GraphLayout.parseInstance((Object) intArray).toFootprint());
        System.out.println("====================================================================");
        System.out.println(">> new Integer[1000]");
        System.out.println(GraphLayout.parseInstance((Object) integerArray).toFootprint());
        System.out.println("====================================================================");
        System.out.println(">> new ArrayList<Integer>(1000)");
        System.out.println(GraphLayout.parseInstance(arrayList).toFootprint());
        System.out.println("====================================================================");
        System.out.println(">> new LinkedList<Integer>(1000)");
        System.out.println(GraphLayout.parseInstance(linkedList).toFootprint());
        System.out.println("====================================================================");
        System.out.println(">> new HashSet<Integer>(1000)");
        System.out.println(GraphLayout.parseInstance(hashSet).toFootprint());
        System.out.println("====================================================================");
        System.out.println(">> new HashMap<Integer>(1000)");
        System.out.println(GraphLayout.parseInstance(hashMap).toFootprint());
        System.out.println("====================================================================");
        System.out.println(">> new ConcurrentHashMap<Integer>(1000)");
        System.out.println(GraphLayout.parseInstance(concurrentHashMap).toFootprint());
        System.out.println("====================================================================");
        System.out.println(">> new ArrayList<Integer>(1000).stream()");
        System.out.println(GraphLayout.parseInstance(arrayList.stream()).toFootprint());
        System.out.println("====================================================================");
        System.out.println(">> new String(\"Hello, World!\")");
        System.out.println(GraphLayout.parseInstance("Hello, World!").toPrintable());
        System.out.println("====================================================================");
    }

}
