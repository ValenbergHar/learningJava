package javarush.hen;
public class  MoldovanHen extends Hen{
    @Override
    public  int getCountOfEggsPerMonth(){
       return 9;
    } 
    @Override
    public String getDescription(){
        return super.getDescription() + " ��� ������ -" + MOLDOVA + ". � ���� " + this.getCountOfEggsPerMonth() + " ��� � �����." ;
    }
}