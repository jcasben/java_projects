package array_normalization;

public class ArrayNormalization {

    private void Start(){
        Functions fncts = new Functions();
        fncts.header("NORMALIZACION DE UNA MATRIZ");

        Double [][] matrix = fncts.setArray();
        fncts.normalizeArray(matrix);
    }
    //El programa arranca en el método main pero es reconducido a Start().
    public static void main(String[] args) {

        (new ArrayNormalization()).Start();
    }

}
