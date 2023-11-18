package week_10;

public class StackOfIntegers {
    private int [] primeFactors ;
    private int size;

    public StackOfIntegers(int number){
        primeFactors = new int[number];
    }
    public void push(int number){
        if(size >= primeFactors.length){
            int [] tempt = new int[primeFactors.length * 2];
            System.arraycopy(primeFactors,0,tempt,0,primeFactors.length);
            primeFactors = tempt;
        }
        primeFactors[size++] = number;
    }
    public int pop(){
        return primeFactors[--size];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
    public int [] getPrimeFactors(){
        return primeFactors;
    }
}
