package week_10;

public class Question_10_23 {
    public static void main(String[] args) {
        MyString2 a = new MyString2("Elon MUSK");
        System.out.println(a);
        MyString2 b = new MyString2("Okan TIRAS");
        System.out.println(b);
        System.out.println(a.compare(b.getValue()));
        MyString2 c = new MyString2("GoZero");
        System.out.println(c.toUpperCase());
        System.out.println(c.toChars());
        System.out.println(MyString2.valueOf(true));
        System.out.println(MyString2.valueOf(false));
        System.out.println(MyString2.valueOf(true).toUpperCase());



    }
}
