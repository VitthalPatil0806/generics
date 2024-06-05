public class Holder1 <KEY,VALUE> {
    private KEY val1;
    private VALUE val2;

    public Holder1(KEY val1, VALUE val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    public KEY getVal1() {
        return val1;
    }

    public void setVal1(KEY val1) {
        this.val1 = val1;
    }

    public VALUE getVal2() {
        return val2;
    }

    public void setVal2(VALUE val2) {
        this.val2 = val2;
    }

    public String toString(){
        return "Holder1{"+
                "val1="+val1+
                ", val2="+val2+
                "}";
    }

}
