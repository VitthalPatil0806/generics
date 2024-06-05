public class Holder2  <T extends Number> {// all types of numbers
    private T data;

    public Holder2(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void display(){
        System.out.println(data);
    }
}
