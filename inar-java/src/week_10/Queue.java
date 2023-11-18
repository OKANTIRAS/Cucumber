package week_10;

public class Queue {
    private int [] elements;

    private int size;


    public Queue(){
        elements = new int[8];
    }
    public void enqueue(int v){
        if(size > elements.length){
            int [] tempt = new int[elements.length * 2];
            System.arraycopy(elements,0,tempt,0,elements.length);
            elements = tempt;
        }
        elements[size++] = v;
    }
    public int dequeue(){
        int value = elements[0];
        int [] tempt = new int[elements.length];
        System.arraycopy(elements,1,tempt,0,elements.length);
        elements = tempt;
        return value;
    }
    public boolean empty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
    public int lenghtOfArray(){
        return elements.length;
    }
    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elements[i]+ "";
        }
        return result;

    }


}
