public class CPrecioQuimicos {
    //Inicio Atributos
    CMaterialQuimico quimicos = new CMaterialQuimico();
    //Fin Atributos

    //Inicio Constructores

    //Fin constructores

    //Inicio Metodos
    public float setPrecioGramoLess(){
        float less = 0.0f;
        less = quimicos.setLess() / 1000;
        return less;
    }

    public float setPrecioGramoDetercon(){
        float detercon = 0.0f;
        detercon = quimicos.setDetercon() / 1000;
        return detercon;
    }

    public float setPrecioQ60(){
        float Q60 = 0.0f;
        Q60 = quimicos.setQ60() / 1000;
        return Q60;
    }

    public float setPrecioGramoTrietanolamina(){
        float trietanolamina = 0.0f;
        trietanolamina = quimicos.setTrietanolamina() / 1000;
        return trietanolamina;
    }

    public float setPrecioGramoHidroxidoSodio(){
        float HidroxidoSodio = 0.0f;
        HidroxidoSodio = quimicos.setHidroxidoSodio() / 1000;
        return HidroxidoSodio;
    }

    public float setPrecioGramoAceitePino(){
        float AceitePino = 0.0f;
        AceitePino = quimicos.setAceiteDePino() / 1000;
        return AceitePino;
    }

    public float setPrecioGramoEDTA(){
        float EDTA = 0.0f;
        EDTA = quimicos.setEDTA() / 1000;
        return EDTA;
    }

    public float setPrecioGramoCloruroSodio(){
        float cloruroSodio = 0.0f;
        cloruroSodio = quimicos.setCloruroDeSodio() / 1000;
        return cloruroSodio;
    }

    public float setPrecioGramoBetaina(){
        float betaina = 0.0f;
        betaina = quimicos.setBetaina() / 1000;
        return betaina;
    }

    public float setPrecioGramoAcidoCitrico(){
        float acidoCitrico = 0.0f;
        acidoCitrico = quimicos.setAcidoCitrico() / 1000;
        return acidoCitrico;
    }

    public float setPrecioGramoAmidaCoco(){
        float amidaCoco = 0.0f;
        amidaCoco = quimicos.setAmidaDeCoco() / 1000;
        return amidaCoco;
    }

    public float setPrecioGramoNacarante(){
        float nacarante = 0.0f;
        nacarante = quimicos.setNacarante() / 1000;
        return nacarante;
    }

    public float setPrecioGramoPeroxido(){
        float peroxido = 0.0f;
        peroxido = quimicos.setPeroxido() / 1000;
        return peroxido;
    }

    public float setPrecioGramoButil(){
        float butil = 0.0f;
        butil = quimicos.setButil() / 1000;
        return butil;
    }

    //Fin Metodos
    
}
