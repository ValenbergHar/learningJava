package javarush.hen;
public class RussianHen extends Hen {
    @Override
    public  int getCountOfEggsPerMonth(){
       return 2;
    } 
    @Override
    public String getDescription(){
        return super.getDescription() + " ��� ������ -" + RUSSIA + ". � ���� " + this.getCountOfEggsPerMonth() + " ��� � �����." ;
    }
}