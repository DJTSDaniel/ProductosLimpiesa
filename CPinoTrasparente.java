public class CPinoTrasparente {
    //Atributos
    short NonilSustituto;
    short AceiteDePino;
    short less;
    short Agua;
    short Detercon;
    short EDTA;
    //Fin atributos

    //Constructores
    public CPinoTrasparente(){
        NonilSustituto = 26;
        AceiteDePino = 20;
        less = 15;
        Detercon = 100;
        EDTA = 1;
    }
    //Fin constructores

    //Metodos
    public void materialPorLitro (int litros){

        int grDetercon, grAceitePino, grAgua, grEDTA, grLess, grNonil; 

        grNonil = litros * NonilSustituto;
        grAceitePino = litros * AceiteDePino;
        grLess = litros * less;
        grAgua = litros * Agua;
        grDetercon = litros * Detercon;
        grEDTA = litros * EDTA;

        printMatPinoLechoso(litros, grDetercon, grAceitePino, grAgua, grEDTA, grLess, grNonil);
    }//fin material por litro

    public void printMatPinoLechoso(int litros, int grDetercon, int grAceitePino, int grAgua, int grEDTA, int grLess, int grNonil){
        System.out.println("El material para preparar" + litros + "Litros de Pino transparente es: ");
        System.out.println("Nonil Fenol Sustituto: "+ grNonil);
        System.out.println("Aceite de Pino: " + grAceitePino);
        System.out.println("LESS: " + grLess);
        System.out.println("Agua: " +  grAgua);
        System.out.println("Detercon: "+ grDetercon);
        System.out.println("EDTA: " + grEDTA);
    }

    //Fin metodos


    
}
