public class Main {  
    public static void main(String[] args) {  

        MorseBaum mb = new MorseBaum();

        String encodedStr = mb.encode("hello world");

        System.out.println(encodedStr);
        System.out.println(mb.decode(encodedStr));
        

    }  
}  
