package stringProblems;

public class CifreBroja {
    public static void main(String[] args) {
    cifreBroja(1543);
    }

    public static void cifreBroja(int broj){
        for( int i = broj; i>0; i/=10){
            i = i % 10;
            System.out.println(i);
        }
    }
}

