package etc.generic.good;
//T : Type의 약자
public class Box<T> {

    private T obj;

    public void setObj(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }

}
