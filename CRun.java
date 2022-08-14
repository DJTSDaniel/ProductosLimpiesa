import java.util.Scanner;

public class CRun {
    //Atributos

    //Fin Atributos

    //Constructores
    public CRun(){};
    //Fin constructores

    //Metodos
    public static void main(String[] args) {
        //Variables Locales
        short litros = 0;
        //Fin Variables Locales

        //Objetos
        CPinoLechoso pL = new CPinoLechoso();
        Scanner sc = new Scanner(System.in);
        //Fin Objetos

        System.out.println("Escribe la cantidad de pino que quieres preparar: ");
        try {
            litros = sc.nextShort();
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
            litros = 0; 
        }
 
        pL.materialPorLitro(litros);
    }
    //Fin Metodos
}
