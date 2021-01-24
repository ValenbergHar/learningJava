public class App13 {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGenObj = new TwoGen<Integer, String>(555,
                "Hello");
        twoGenObj.showTypes();
        int intValue = twoGenObj.getObj1();
        String strValue = twoGenObj.getObj2();
        System.out.println(intValue);
        System.out.println(strValue);
    }
}

class TwoGen<T, V> {
    private T obj1;
    private V obj2;

    public TwoGen(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void showTypes() {
        System.out.println("Тип T: " + obj1.getClass().getName());
        System.out.println("Тип V: " + obj2.getClass().getName());
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }
}
