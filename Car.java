public class Car
{
    private int driven;
    private int until;
    public Car (int driven, int until){
        this.driven = driven;
        this.until = until;
    }

    public boolean timeForOilChange(){
        if (driven >= until){
            driven = 0;
            return true;
        }
        return false;
    }
    public void addMiles(int m){
        driven += m;

    }

}
