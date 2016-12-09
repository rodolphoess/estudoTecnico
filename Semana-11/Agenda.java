package tecnico.atividade.presencial;

public class Agenda {
    private int dia;
    private int mes;
    private String anotacao;
    
    public void anote(int dia, int mes, String nota) {
        this.dia = dia;
        this.mes = mes;
        anotacao = nota;
        
        validaData();
    }
    
    public void validaData() {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            dia = 0;
            mes = 0;
            anotacao = "Anotação não inserida devido a data inválida";
        }
    }
    
    public void mostraAnotacao () {
        System.out.println(dia + "/" + mes + ": " + anotacao);
    }


}
