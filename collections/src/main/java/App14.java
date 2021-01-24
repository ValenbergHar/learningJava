public class App14<T extends Number> {
    private T[] numb;


    public App14(T... numb) {
        this.numb = numb;
    }
    public boolean sameAvg(App14<?> another) {
        return Math.abs( this .avg() - another.avg()) < 0.0001 ;
    }

    public double avg() {
        double sum = 0.0;
        for (int i = 0; i < numb.length; i++) {
            sum = +numb[i].doubleValue();
        }
        return sum / numb.length;
    }

    public static void main(String[] args) {
        App14<Integer> iStats=new App14<Integer>(1, 2, 3, 4, 5, 6, 6);
        System.out.println( "Среднее fStats = " + iStats.avg());
        App14<Double> dStats = new App14<Double>(1.3,3.4,45.5,23.4);
        System.out.println( "Среднее fStats = " + dStats.avg());
        App14<Float> fStats = new App14<Float>(10.0f, 2.0f, 3.0f, 4.0f, 5.0f);
        System.out.println( "Среднее fStats = " + fStats.avg());


        System.out.print( "Средние iStats и dStats " );
        if (iStats.sameAvg(dStats)) {
            System.out.println( "равны" );
        } else {
            System.out.println( "отличаются" );
        }
        System.out.print( "Средние iStats и fStats " );
        if (iStats.sameAvg(fStats)) {
            System.out.println( "равны" );
        } else {
            System.out.println( "отличаются" );
        }
    }
}
