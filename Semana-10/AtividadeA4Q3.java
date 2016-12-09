package estudo.imd.house;

public class AtividadeA4Q3 {

    public static void main(String[] args) {
        
        AlunoA4Q3 aluno = new AlunoA4Q3();        
        ProfessorA4Q3 professor = new ProfessorA4Q3();        
        TurmaA4Q3 turma = new TurmaA4Q3();
        
        aluno.setNomeProf(professor);
        professor.setNome("Lindemberg");
        aluno.setNome("Rodolpho");
        aluno.setNumChamada(13);
        aluno.setSexo("masculino");
        
        professor.setTurma(turma);
        turma.setTurma(5);
        professor.setMateria("Programação Orientada a Objetos");
        professor.setSexo("masculino");        
        
        turma.setQtddAlunos(14);
        turma.setSerie("intermediário");
        
        System.out.println("O(a) aluno(a) " + aluno.getNome() + ", de sexo " + aluno.getSexo() + " e número de chamada " + aluno.getNumChamada() + " é da turma " + professor.getTurma().getTurma() + ", que "
                + "possui " + turma.getQtddAlunos() + " alunos e é do módulo " + turma.getSerie() + ". \nO(A) Professor(a) responsável pela turma é " + aluno.getNomeProf().getNome() + " do sexo " + 
                professor.getSexo() + " e leciona a matéria " + professor.getMateria() + ".");
        
        
        AlunoA4Q3 aluno2 = new AlunoA4Q3();        
        ProfessorA4Q3 professor2 = new ProfessorA4Q3();        
        TurmaA4Q3 turma2 = new TurmaA4Q3();
        
        aluno2.setNomeProf(professor2);
        professor2.setNome("Ricardo");
        aluno2.setNome("Flávio");
        aluno2.setNumChamada(21);
        aluno2.setSexo("masculino");
        
        professor2.setTurma(turma2);
        turma2.setTurma(8);
        professor2.setMateria("Matemática");
        professor2.setSexo("masculino");        
        
        turma2.setQtddAlunos(60);
        turma2.setSerie("avançado");
        
        System.out.println("\n\nO(A) aluno(a) " + aluno2.getNome() + ", de sexo " + aluno2.getSexo() + " e número de chamada " + aluno2.getNumChamada() + " é da turma " + professor2.getTurma().getTurma() + ", que "
                + "possui " + turma2.getQtddAlunos() + " alunos e é do módulo " + turma2.getSerie() + ". \nO(A) Professor(a) responsável pela turma é " + aluno2.getNomeProf().getNome() + " do sexo " + 
                professor2.getSexo() + " e leciona a matéria " + professor2.getMateria() + ".");
        
        
        AlunoA4Q3 aluno3 = new AlunoA4Q3();        
        ProfessorA4Q3 professor3 = new ProfessorA4Q3();        
        TurmaA4Q3 turma3 = new TurmaA4Q3();
        
        aluno3.setNomeProf(professor3);
        professor3.setNome("Flávia");
        aluno3.setNome("Raíssa");
        aluno3.setNumChamada(17);
        aluno3.setSexo("feminino");
        
        professor3.setTurma(turma3);
        turma3.setTurma(2);
        professor3.setMateria("Inglês");
        professor3.setSexo("feminino");        
        
        turma3.setQtddAlunos(30);
        turma3.setSerie("avançado");
        
        System.out.println("\n\nO(A) aluno(a) " + aluno3.getNome() + ", de sexo " + aluno3.getSexo() + " e número de chamada " + aluno3.getNumChamada() + " é da turma " + professor3.getTurma().getTurma() + ", que "
                + "possui " + turma3.getQtddAlunos() + " alunos e é do módulo " + turma3.getSerie() + ". \nO(A) Professor(a) responsável pela turma é " + aluno3.getNomeProf().getNome() + " do sexo " + 
                professor3.getSexo() + " e leciona a matéria " + professor3.getMateria() + ".");
        
        
        AlunoA4Q3 aluno4 = new AlunoA4Q3();        
        ProfessorA4Q3 professor4 = new ProfessorA4Q3();        
        TurmaA4Q3 turma4 = new TurmaA4Q3();
        
        aluno4.setNomeProf(professor4);
        professor4.setNome("Fernando");
        aluno4.setNome("Liri");
        aluno4.setNumChamada(1);
        aluno4.setSexo("feminino");
        
        professor4.setTurma(turma4);
        turma4.setTurma(6);
        professor4.setMateria("Ciências");
        professor4.setSexo("masculino");        
        
        turma4.setQtddAlunos(20);
        turma4.setSerie("avançado");
        
        System.out.println("\n\nO(A) aluno(a) " + aluno4.getNome() + ", de sexo " + aluno4.getSexo() + " e número de chamada " + aluno4.getNumChamada() + " é da turma " + professor4.getTurma().getTurma() + ", que "
                + "possui " + turma4.getQtddAlunos() + " alunos e é do módulo " + turma4.getSerie() + ". \nO(A) Professor(a) responsável pela turma é " + aluno4.getNomeProf().getNome() + " do sexo " + 
                professor4.getSexo() + " e leciona a matéria " + professor4.getMateria() + ".");
        
        
    }
    
}
