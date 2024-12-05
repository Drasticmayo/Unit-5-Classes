
public class Ball {
    private int Capacity;
    private int Pressure;
    private String Color;
    private String Type;

    public Ball(int Capacity, int Pressure, String Color, String Type){
        this.Capacity=Capacity;
        this.Pressure=Pressure;
        this.Color=Color;
        this.Type=Type;
    }
    public int getPressure(){
        return Pressure;
    }
    public int getCapacity(){
        return Capacity;
    }
    public String getColor(){
        return Color;
    }
    public String getType(){
        return Type;
    }
    public Boolean isFull(){
        if (Pressure>=Capacity){
            return true;
        }
        else{
            return false;
        }
    }
    public int needsAir(){
        return (Capacity - Pressure);
    }
    public Boolean isFlat(){
        if (Pressure < (0.5*(Capacity))){
            return true;
        }
        else{
            return false;
    }
    }
    public int addAir(){
        for (int add = 1; Pressure < Capacity; add += 1){
        Pressure += 1;
        }
        return Pressure;
        }
    }


    
