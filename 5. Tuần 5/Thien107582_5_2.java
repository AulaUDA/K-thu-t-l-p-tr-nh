package phamchithien.buoi5;

public class Thien107582_5_2 {

    public static void viDu1() {
        int a = 0, b, c;
        a++;           // Tăng giá trị của a lên 1
        b = a;         // Gán giá trị của a (lúc này a = 1) cho b
        c = a++;       // Gán giá trị của a (trước khi tăng) cho c, sau đó a tăng lên 1
        System.out.println(a);  // In ra giá trị của a
        System.out.println(b);  // In ra giá trị của b
        System.out.println(c);  // In ra giá trị của c
    }
        

    public static void viDu2() {
        int a = 0, b, c;
        ++a;           // Tăng giá trị của a lên 1 trước khi sử dụng
        b = a;         // Gán giá trị của a (lúc này a = 1) cho b
        c = ++a;       // Tăng giá trị của a lên 1 (a = 2), sau đó gán giá trị của a cho c
        System.out.println(a);  // In ra giá trị của a
        System.out.println(b);  // In ra giá trị của b
        System.out.println(c);  // In ra giá trị của c
    }
        

    public static void viDu3() {
        int a = 0, b, c;
        ++a;           // Tăng a lên 1, a = 1
        b = ++a;       // Tăng a lên 1 trước, rồi gán vào b, a = 2, b = 2
        c = b++;       // Gán giá trị của b cho c, rồi tăng b lên, c = 2, b = 3
        System.out.println(a);  // In ra giá trị của a
        System.out.println(b);  // In ra giá trị của b
        System.out.println(c);  // In ra giá trị của c
    }
        
    public static void viDu4() {
        int a = 0, b, c;
        ++a;           // Tăng giá trị của a lên 1, a = 1
        b = ++a;       // Tăng a lên 1 trước, rồi gán giá trị của a cho b, a = 2, b = 2
        c = a++;       // Gán giá trị của a cho c (trước khi a tăng), rồi tăng a lên, c = 2, a = 3
        System.out.println(a);  // In ra giá trị của a
        System.out.println(b);  // In ra giá trị của b
        System.out.println(c);  // In ra giá trị của c
    }
        
    public static void viDu5() {
        int a = 0, b, c;
        ++a;           // Tăng a lên 1, a = 1
        b = ++a;       // Tăng a lên 1 trước, rồi gán vào b, a = 2, b = 2
        c = b++;       // Gán giá trị của b cho c, rồi tăng b lên, c = 2, b = 3
        System.out.println(a);  // In ra giá trị của a
        System.out.println(b);  // In ra giá trị của b
        System.out.println(c);  // In ra giá trị của c
    }
        

    public static void viDu6() {
        int a = 0, b, c;
        ++a;           // Tăng a lên 1, a = 1
        b = a++;       // Gán giá trị của a cho b, rồi tăng a lên, b = 1, a = 2
        c = b++;       // Gán giá trị của b cho c, rồi tăng b lên, c = 1, b = 2
        c += c;        // Cộng giá trị của c vào chính nó, c = 1 + 1 = 2
        System.out.println(a);  // In ra giá trị của a
        System.out.println(b);  // In ra giá trị của b
        System.out.println(c);  // In ra giá trị của c
    }
        

    public static void main(String[] args) {
        System.out.println("Vi du 1: ");
        viDu1();
        System.out.println("Vi du 2: ");
        viDu2();
        System.out.println("Vi du 3: ");
        viDu3();
        System.out.println("Vi du 4: ");
        viDu4();
        System.out.println("Vi du 5: ");
        viDu5();
        System.out.println("Vi du 6: ");
        viDu6();
    }
}

