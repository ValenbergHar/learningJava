package javarush.hen;
public class UkrainianHen extends Hen{
    @Override
    public  int getCountOfEggsPerMonth(){
       return 8;
    } 
    @Override
    public String getDescription(){
        return super.getDescription() + " ��� ������ -" + UKRAINE + ". � ���� " + this.getCountOfEggsPerMonth() + " ��� � �����." ;
    }
}
