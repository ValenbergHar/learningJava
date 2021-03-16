public class DvdRom {
    private boolean data = false;
    public boolean hasData(){
        return data;
    }

    public void load(){
        System.out.println("disc is load");
        data = true;
    }

    public void unload(){
        System.out.println("disc is unload");
        data = false;
    }



}
