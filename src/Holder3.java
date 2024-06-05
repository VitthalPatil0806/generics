public class Holder3 <T>{
    private T data1;

    public Holder3(T data1){
        this.data1 = data1;
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public void display(){
        System.out.println(data1);
    }
}
