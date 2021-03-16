public class Hdd {
    public void copyfromDvd(DvdRom dvdRom) {
        if (dvdRom.hasData()) {
            System.out.println("data is copy from disc");
        }else{
            System.out.println("insert disc with data");
        }
    }
}
