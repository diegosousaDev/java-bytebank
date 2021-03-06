package gerenciador;

public class TestaBuscaAlunoNoCurso {

    public static void main(String[] args){

        Curso java = new Curso("Dominando as coleções Java", "Paulo Silveira");

        java.adiciona(new Aula("Trabalhando com ArrayList", 21));
        java.adiciona(new Aula("Criando uma Aula", 20));
        java.adiciona(new Aula("Modelando as coleções", 21));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Marco Bruno", 17645);


        java.matricula(a1);
        java.matricula(a2);
        java.matricula(a3);

        System.out.println("Quem e o aluno com matricula 5617");
        System.out.println(java.buscarMatriculado(5618));

    }

}
