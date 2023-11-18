package week_10;

public class MyStringBuilder1 {

    private String value;

    public MyStringBuilder1(String value){
        this.value = value;
    }
    public MyStringBuilder1 append(MyStringBuilder1 s){
        return new MyStringBuilder1(this.value.concat(s.toString()));
    }
    public String toString(){
        return this.value;
    }
    public MyStringBuilder1 append(int i){
        return new MyStringBuilder1(this.value.concat(String.valueOf(i)));
    }
    public int lenght(){
        return this.value.length();
    }
    public char charAt(int index){
        return this.value.charAt(index);
    }
    public MyStringBuilder1 toLowerCase(){
        return new MyStringBuilder1(value.toLowerCase());
    }
    public MyStringBuilder1 substring(int begin, int end){
        return new MyStringBuilder1(value.substring(begin,end));
    }





  

}
