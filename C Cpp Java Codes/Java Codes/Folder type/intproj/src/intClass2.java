


public class intClass2 implements intClass1{
    private double length, width, base, volume, height;

    @Override
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setBase(double base){
        this.base = base;
    }
    @Override
    public void setVolume(double volume){
        this.volume = volume;
    }

    @Override
    public void compute() {
        base = length * width;
        volume = (base * height) / 3;
    }
    public double getBase(){
        return base;
    }
    public double getVolume(){
        return volume;
    }

    @Override
    public void display(){
        System.out.print("Base: " +base);
        System.out.println("\nVolume: " +volume);
    }
}
