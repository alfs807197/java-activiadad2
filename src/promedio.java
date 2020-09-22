import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promedio {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] arg) throws IOException {
        String estudiante;
        System.out.println("Introduce nombre del estudiante: ");
        estudiante = entrada.readLine();
        int [] cal = new int[5];
        for( int i =0; i<cal.length; i++){
            int b=i+1;
            System.out.println("Introduce la calificacion numero "+b+" : ");
            cal[i]= Integer.parseInt(entrada.readLine());

        }
        double prom = calProm(cal);
        char caliL = asignarCal(prom);
        DesplegarInfo(estudiante, cal, prom, caliL);



    }

    private static void DesplegarInfo(String estudiante, int[] cal, double prom, char caliL) {
        System.out.println("Nombre del estudiante: "+ estudiante);
        for(int i=0;i<cal.length;i++){
            int b=i+1;
            System.out.println("Calificación "+b+": "+cal[i]);
        }
        System.out.println("Promedio: "+prom);
        System.out.println("Calificación: "+caliL);
    }

    public static double calProm(int arr[]){
        int acum=0;
        for(int i=0;i<arr.length;i++){
            acum= acum+arr[i];
        }
        double prom=acum/arr.length;
        return prom;
    }
    public static char asignarCal(double prom){
        if(prom>90)
            return 'A';
        else if (prom>80)
            return 'B';
        else if (prom>70)
            return 'C';
        else if (prom>60)
            return 'D';
        else if (prom>50)
            return 'E';
        else return 'F';
    }
    

}
