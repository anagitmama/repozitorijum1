package stringProblems;

public class Main {

    public static void main(String[] args) {

        String pera = "write yљљr code here";
//        System.out.println(pera.charAt(8));
//        System.out.println(pera.codePointAt(0));
//        System.out.println(pera.codePointBefore(0));
        int vrednost = codeBefore(pera, 1);
        System.out.println(vrednost);
        System.out.println(Character.toChars(vrednost));
        System.out.println(pera.codePointCount(0,pera.length()));



    }

    public static int codeBefore(String recenica, int index) {
        int i = index - 1;
        if (i < 0 || i >= recenica.length()) {
            System.out.println("ovo ne moze");
            return -1;
        } else {
            return recenica.codePointAt(i);
        }

    }
}
