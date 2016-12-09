package tecnico.atividade.presencial;

public class MainSmartphone {

    public static void main(String[] args) {
        
        Smartphone galaxys6 = new Smartphone();
        Smartphone lumia930 = new Smartphone();
        Smartphone iPhone6 = new Smartphone();
        
        galaxys6.getContatos().setContatoPrincipal("mãe");
        galaxys6.getContatos().setQuantidadeContatos(48);
        galaxys6.getContatos().setContatosIndispensaveis(3);
        galaxys6.setNome("Rodolpho");
        galaxys6.getJogos().setQuantidadeJogos(4);
        galaxys6.getJogos().setGeneroMelhorJogo("corrida");
        galaxys6.getJogos().setMelhorJogo("Forza");
        
        lumia930.getContatos().setContatoPrincipal("pai");
        lumia930.getContatos().setQuantidadeContatos(27);
        lumia930.getContatos().setContatosIndispensaveis(2);
        lumia930.setNome("Rafaela");
        lumia930.getJogos().setQuantidadeJogos(2);
        lumia930.getJogos().setGeneroMelhorJogo("estratégia");
        lumia930.getJogos().setMelhorJogo("Clash of Clans");
        
        iPhone6.getContatos().setContatoPrincipal("irmã");
        iPhone6.getContatos().setQuantidadeContatos(39);
        iPhone6.getContatos().setContatosIndispensaveis(6);
        iPhone6.setNome("Marianna");
        iPhone6.getJogos().setQuantidadeJogos(1);
        iPhone6.getJogos().setGeneroMelhorJogo("guerra");
        iPhone6.getJogos().setMelhorJogo("Medalha de Honra");
        
        System.out.println(galaxys6.toString());
        System.out.println("\n" + lumia930.toString());
        System.out.println("\n" + iPhone6.toString());   
        
    }
    
}
