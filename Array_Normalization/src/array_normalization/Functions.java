package array_normalization;

public class Functions {

    LT in = new LT();

    //GETTER: Crea una cabecera con el título introducido por el usuario
    public void header(String title){

        System.out.println("******************************************************");
        System.out.println("******************************************************");
        System.out.println(title);
        System.out.println("******************************************************");
        System.out.println("******************************************************");
        System.out.println("");
    }

    /*
    GETTER: crea un matriz cuadrada dado el número de filas y columnas introducido por el usuario y los valores para cada una de las posiciones de la matriz, también introducidos por el usuario.
            Este método tambíen imprime la matriz resultante y hace un return del valor de la matriz creada.
     */
    public Double[][] setArray(){

        Integer index = 0;
        while(index <= 0) {
            System.out.println("Introduce cuántas filas y columnas quieres");
            index = integerValidation(index);
        }
        Double [][] matrix = new Double[index][index];

        //Rellenar la matriz con los valores deseados
        System.out.println("******************************************************");
        System.out.println("Para la matriz con " + matrix.length + " fila/s y " + matrix.length + " columna/s...");
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {

                System.out.println("Introduce el valor de la matriz en la posición " + i + " ," + j + ".");
                matrix [i][j] = in.llegirReal();
            }
        }

        //Imprimir la matriz resultante
        System.out.println("******************************************************");
        System.out.println("La matriz que has introducido es la siguiente: ");

        for (int i = 0; i < matrix.length; i++) {

            System.out.println("");

            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("");

        return matrix;
    }

    /*
    SETTER: calcula la normalización de la matriz entrada por parámetro. Después, imprime el resultado.
     */
    public void normalizeArray(Double [][] matrix){

        double average = 0.0;
        double normal;

        //Sumar todos los valores de todas las posiciones de la matriz.
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {

                average = average + matrix[i][j];
            }
        }
        //Calcular la media.
        normal = average/Math.pow(matrix.length,2);

        System.out.println("******************************************************");
        System.out.println("La normalización de la matriz es: " + normal);
    }

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
}


