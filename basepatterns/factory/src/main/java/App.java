public class App {
    public static void main(String[] args) {
//Watch watch = new RomeWatch();
//watch.showTime();
        WatchMaker maker = new RomeWatchMaker();
        Watch watch = maker.createWatch();
        watch.showTime();
    }
}
