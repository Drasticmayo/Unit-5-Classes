public class Ball
{
    private double Capacity;
    private double Pressure;
    private String Color;
    private String Type;

    public Ball(double Capacity, double Pressure, String Color, String Type)
    {
        this.Capacity = Capacity;
        this.Pressure = Pressure;
        this.Color = Color;
        this.Type = Type;
    }

    public double getPressure()
    {
        return Pressure;
    }
    
    public double getCapacity()
    {
        return Capacity;
    }
    
    public String getColor()
    {
        return Color;
    }
    
    public boolean isFull()
    {
        if(Pressure > 0)
        {
            return true;
        }
        return false;
    }
    
    public boolean isFlat()
    {
        if(Pressure > 0)
        {
            return false;
        }
        return true;
        }
    
    public boolean addAir(int add)
    {
        if((Pressure + add) <= Capacity)
        {
            return true;
        }
        return false;
    }

    public String getType()
    {
        return Type;
    }

    public double needsAir()
    {
        double n = Capacity - Pressure;

        if(n > 0)
        {
            return (n);
        }
        else{
            return 0;
        }
    }
}
