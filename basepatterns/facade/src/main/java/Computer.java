public class Computer {
    Power power = new Power();
    DvdRom dvdRom = new DvdRom();
    Hdd hdd = new Hdd();

    public void copy() {
        power.on();
        dvdRom.load();
        hdd.copyfromDvd(dvdRom);
    }
}
