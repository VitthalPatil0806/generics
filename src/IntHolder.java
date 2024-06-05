public class IntHolder {
    private int number;

    public IntHolder(){
        number = 100;
    }

    public IntHolder(int number){
        this.number = number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void display(){
        System.out.println(number);
    }

}
