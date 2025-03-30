package Fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {

        String s = "Texto";
        s.toUpperCase();

        //Wappers são a versão objeto dos tipos PRIMITIVOS
        int a = 123;
        System.out.println(a);
    }
}
