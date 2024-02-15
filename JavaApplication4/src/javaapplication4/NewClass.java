package javaapplication4;
public class NewClass {
    public static void main(String[] args) {
        int notas[][]= new int [6][3];
        int resultados[][]= new int [6][5];
        generarMatrizNotas(notas);  
        presentarMatrizNotas(notas);
        procesarMatrizNotas(notas, resultados);
        presentarMatrizNotas(resultados);
    }
    public static void procesarMatrizNotas(int notas[][], int resultados[][]){
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                resultados[i][j]= notas[i][j];
            }
        }
        for (int i = 0; i < notas.length; i++) {
            resultados[i][3]= notas[i][0]+notas[i][1];
            
        }
    }
    public static void generarMatrizNotas(int notas[][]){
        System.out.println(notas[0].length);
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j] = (int)(Math.random()*10+0);
            }
        }
                                
    }
    public static void presentarMatrizNotas(int notas[][]){
        System.out.println(notas[0].length);
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print(notas[i][j]+"\t");
            }
        }
        System.out.println("");
    }
   
}
