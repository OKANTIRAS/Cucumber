package week_10;

public class MyString2 {
    private String value;
    public MyString2(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
    public int compare(String s){
        return value.compareToIgnoreCase(s);
    }
    public MyString2 substring(int begin){
        String result =  value.substring(begin);
        return new MyString2(result);
    }
    public MyString2 toUpperCase(){
        String result = value.toUpperCase();
        return new MyString2(result);
    }
    public char[] toChars(){
        char[] result = new char[value.length()];
        for (int i = 0; i < value.length(); i++) {
            result[i] = value.charAt(i);
        }
        return result;
    }
    public static MyString2 valueOf(boolean b){
        String result;
        if(b){
            result = "true";
        }else{
            result = "false";
        }
        return new MyString2(result);
    }
    public String toString(){
        return value;
    }

}
