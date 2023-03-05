public class JuegoRebano {
    public static void main(String[] args) {
        int[][] rebano = new int[1][7];
        mostarRebano(rebano);
    }
    public static void avanzarOveja(){

    }
    public void saltarOveja(){

    }
    public static void mostarRebano(int [][]rebano){
        for (int i = 0; i < rebano.length; i++) {
            for (int j = 0; j < rebano[i].length; j++) {
                System.out.print(rebano[i][j] + "");
            }
            System.out.println();
        }
    }
}
