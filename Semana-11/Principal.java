package tecnico.atividade.presencial;

public class Principal {

    public static void main(String[] args) {
        
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anote(31, 12, "Ano novo");
        agenda2.anote(01, 01, "Novo ano");
        
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();
    }
    
}
