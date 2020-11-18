public class TestQueue {
    public static void main(String[] args) {
        Queue test = new Queue();
        for(int i=0; i<20; i++) {
            test.enqueue(i+1);
        }
        int cnt = 0;
        while(!test.empty()) {          //非空
            cnt++;
            System.out.print(test.dequeue() + " ");
            if(cnt % 5 == 0)            //逢5回车
                System.out.println();
        }
    }
}
class Queue {
    private int[] element;
    public static final int DEFAULT_CAP = 8;
    private int size;

    public Queue() {
        element = new int[DEFAULT_CAP];
    }
    public Queue(int capacity) {
        element = new int[capacity];
    }
    public void enqueue(int v) {
        if(size >= element.length) {
            int[] temp = new int[element.length * 2];  //空间不够时申请双倍的空间
            for(int i=0; i<element.length; i++) {   //把原队列的内容复制到新队列中
                temp[i] = element[i];
            }
            element = temp;                        
        }

        element[size] = v;
        size++;
    }
    public int dequeue() {    //删除操作：先进入队列的元素先出来
        if(empty()) {    //只有在队列非空时才可以执行

            return 0;    
        }
        int temp = element[0];
        for(int i=0; i<element.length-1; i++) {
            element[i] = element[i+1];
        }
        size--;
        return temp;
    }
    public boolean empty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
}