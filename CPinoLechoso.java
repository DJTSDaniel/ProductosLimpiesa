public class CPinoLechoso{

      // Atributos
      private short DeterconSodico;
      private short AceitePino;
      private short Agua; 
      private short EDTA; 
      // Fin Atributos
      
    //Constructores
    public CPinoLechoso(){        //Constructor por omision
        DeterconSodico = 30;
        AceitePino = 18;
        Agua = 950;
        EDTA = 1;
    }
    //fin constructores

    //Metodos
    public void materialPorLitro (short litros){
        short grDetercon, grAceitePino, grAgua, grEDTA; 
        grDetercon =(short) (litros * DeterconSodico);
        grAceitePino = (short)(litros * AceitePino);
        grAgua = (short)(litros * Agua);
        grEDTA = (short)(litros * EDTA);

        printMatPinoLechoso(litros, grDetercon,grAceitePino, grAgua, grEDTA);
    }

    public void printMatPinoLechoso(short litros, short grDetercon, short grAceitePino, short grAgua, short grEDTA){
        System.out.println("El material para preparar" + litros + "Litros de Pino Lechoso es: ");
        System.out.println("Detercon Sodico: "+ grDetercon);
        System.out.println("Aceite de Pino: " + grAceitePino);
        System.out.println("Agua: " +  grAgua);
        System.out.println("EDTA: " + grEDTA);
    }

    //Fin metodos

}