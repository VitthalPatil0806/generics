public class Holder {
    private Object obj;

    public Holder(Object obj){
        this.obj = obj;
    }

    public void setObj(Object obj){
        this.obj = obj;
    }

    public Object getObj(){
        return obj;
    }

    public void display(){
        System.out.println(obj);
    }

}
