package BinaryConversor;

public class Conversor {

    private void Start(){

        BinaryFuncts binary = new BinaryFuncts();
        binary.header("CONVERSOR - CALCULADORA BINARIA");
        binary.ConversorMenu();
    }
    public static void main(String[] args) {

        (new Conversor()).Start();
    }
}
