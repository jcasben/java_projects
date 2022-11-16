package BinaryConversor;

import java.util.ArrayList;

public class BinaryFuncts {

    LT in = new LT();

    //GETTER: Crea una cabecera con el título introducido por el usuario
    public void header(String title){

        System.out.println("******************************************************");
        System.out.println("******************************************************");
        System.out.println(title);
        System.out.println("******************************************************");
        System.out.println("******************************************************");
        System.out.println(" ");
    }

    public void ConversorMenu(){

        int option;
        boolean exit = false;

        while(!exit) {

            System.out.println("Introduce la operación que deseas hacer: \n1: Convertir Binario-Deciamal \n2: Convertir Decimal-Binario \n3: Convertir Binario-Cualquier base \n4: Salir");
            option = in.llegirSencer();

            switch (option){
                case 1:
                    binaryToDecimal();
                    break;

                case 2:
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("  ");
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("La opción escogida no existe");
                    break;

            }
        }
    }

    // -------------------- ASK FOR VALUES --------------------

    public int askDecimal(){

        int decimal = 0;
        System.out.println("Introduce el numero decimal que desees:");
        decimal = integerValidation(decimal);
        return decimal;
    }

    private int[] askBinary(){

        System.out.println("******************************************************");
        System.out.println("Por favor, introduce un número en binario");
        char[] tmp = binaryValidation();
        int[] binary = new int[tmp.length];

        for(int i = 0;i<tmp.length;i++){
            binary[i] = tmp[i] - '0';
        }

        return binary;
    }

    public int[] askOctal() {


        return null;
    }

    public String askHexadecimal(){

        return "";
    }
    // -------------------- CONVERSIONS --------------------

    public void binaryToDecimal(){

        int[] binary = askBinary();
        int[] binary_aux = new int[binary.length];
        double decimal = 0;
        int aux = 0;

        for (int i = 0; i < binary.length; i++) {
            binary_aux[i] = binary[i];
        }

        for (int i = 0; i < binary_aux.length/2; i++) {
            aux = binary_aux[i];
            binary_aux[i] = binary_aux[binary_aux.length - 1 - i];
            binary_aux[binary_aux.length - 1 - i] = aux;
        }

        for (int i = 0; i < binary_aux.length; i++) {

            decimal = decimal + (binary_aux[i] * (Math.pow(2, i)));
        }

        System.out.print("El número binario ");
        for (int i = 0; i < binary.length; i++) {
            System.out.print(binary[i]);
        }
        System.out.println(" vale " + (int) decimal + " en decimal");
        System.out.println("******************************************************");
    }

    // -------------------- VALIDATIONS --------------------

    /*
    GETTER: valida que la entrada por teclado del usuario sea un número entero. Si no lo es, salta un error y pide al usuario que vuelva a introducir el número. Hace return del número introducido por teclado.
     */
    public Integer integerValidation (Integer entry) {
        entry = in.llegirSencer();
        while (entry == null) {
            System.out.println("ERROR: lo que has introducido no es un número entero.");
            entry = in.llegirSencer();
        }
        return entry;
    }

    public char[] binaryValidation () {

        char[] tmp = in.llegirLiniaC();

        for (int i = 0; i < tmp.length; i++) {

            while (tmp[i] != '0' && tmp[i] != '1'){

                System.out.println("Error: Lo que has introducido no es un número binario. Introduce otro válido:");
                tmp = in.llegirLiniaC();
            }
        }
        return tmp;
    }
}
