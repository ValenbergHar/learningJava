package javarush.hen;
public class BelarusianHen extends Hen{
    
    

	public  int getCountOfEggsPerMonth(){
       return 10;
    } 
    @Override
    public String getDescription(){
        return super.getDescription() + " ��� ������ -" + BELARUS + ". � ���� " + this.getCountOfEggsPerMonth()+ " ��� � �����." ;
    }
}