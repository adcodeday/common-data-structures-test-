import java.util.ArrayList;
import java.util.Iterator;
//实现了堆的创建，和push方法
class Heap1{
    ArrayList<Integer> heapArray=new ArrayList<Integer>();
    //Array储存堆;
    Heap1(ArrayList<Integer> arra){
        //构造器--传入数组建堆
        Iterator<Integer> iter=arra.iterator();
        while(iter.hasNext()){
            push(iter.next());
        }
    }
    public void push(Integer in){
        //push进入新的数字
        //尾部入堆
        heapArray.add(in);
        up(heapArray.size());
    }
    private void up(Integer i){
        while(i-1>0){
            if(heapArray.get(i-1)<heapArray.get((i/2)-1)){
                int save=heapArray.get(((i/2)-1));
                heapArray.set((i/2)-1,heapArray.get(i-1));
                heapArray.set(i-1,save);
                i=i/2;
                continue;
            }
            return;
        }
    }
    public void show(){
        //显示堆当前的结构
        Iterator<Integer> iter=heapArray.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
public class HeapTest {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        array.add(5);
        array.add(10);
        array.add(4);
        array.add(7);
        array.add(12);
        array.add(100);
        array.add(8);
        array.add(13);
        Heap1 heap1=new Heap1(array);
        heap1.show();
    }
}