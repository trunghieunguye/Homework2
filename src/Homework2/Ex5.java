package Homework2;

public class Ex5 {
    public static void main(String[] args) {
        String s1 = "News, live programs on special political events and celebrations of major national holidays cannot carry ads.";
        char c1 = 'a';
        int i1 = s1.indexOf(c1);
        int i2 = s1.lastIndexOf(c1);
        System.out.println("Vi tri xuat hien dau tien " +i1);
        System.out.println("Vi tri xuat hien cuoi cung " +i2);
        
        
        char c2 = 'r';
        int i3 = s1.indexOf(c2, 0);
        System.out.println("So lan xuat hien cua c2 trong s1 la "+ i3);
        char c3 = 'P';
        String replace = s1.replace(c2, c3);
        System.out.println("Ket qua sau khi thay the : "+replace);



    }
}
