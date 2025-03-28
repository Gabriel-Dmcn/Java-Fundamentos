package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia x";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        System.out.println("Gabriel".toUpperCase());
    }
}
