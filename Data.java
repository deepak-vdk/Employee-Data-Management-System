public class Data {
    private int Eno;
    private String Name;
    private double Sal;

    //GETTER
    public int getEno(){
        return Eno;
    }
    public String getName(){
        return Name;
    }
    public double getSal(){
        return Sal;
    }

    //SETTER
    public Data(int Eno,String Name,Double Sal){
        this.Eno = Eno;
        this.Name = Name;
        this.Sal = Sal;
    }
    public void setSal(Double Sal){
        this.Sal = Sal;
    }

    //TOSTRING
    @Override
    public String toString() {
        return Eno + "   " + Name + "   " +Sal;
    }
}
