package tecnico.estudo.house;

import java.util.Scanner;

public class Classe_Enum {

    public static void main(String[] args) {
        
                
    }
    
    public class playStation {
        String granTurismo = "Gran Turismo 5";
        String medalOfHonor = "Medal of Honor 2";
        String mortalKombat = "Mortal Kombat";
    }
    
    public class XBox {
        String GTA = "Grand Theft Auto V";
        String battlefield = "Battlefield";
        String watchDogs = "Watch Dogs";
    }
    
    public enum Genero {
        CORRIDA, LUTA, GUERRA, ACAO;
    }
    
    public enum Avaliacao {
        MUITO_RUIM, RUIM, BOM, MUITO_BOM, OTIMO;       
    }
    
}
