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
                    System.out.println("");
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
        return 0;
    }

    public ArrayList<Integer> askBinary(){

        return null;
    }

    public int askOctal() {

        return 0;
    }

    public String askHexadecimal(){

        return "";
    }
    // -------------------- CONVERSIONS --------------------



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

    public ArrayList<Integer> binaryValidation (Integer entry) {

        ArrayList<Integer> binary_number = new ArrayList<>();
        entry = 0;

        entry = in.llegirSencer();
        while ((entry == null) || ((entry != 0) && (entry != 1))) {

            System.out.println("ERROR: lo que has introducido no forma parte de un número binario.");
            entry = in.llegirSencer();
        }
        return binary_number;
    }
}
