package POO.javacore.Introduçãoclasses.InterfacesComQuickShort;

public class Aluno implements Iordenacao {
    private String nome;
    private int idade;
    private int matricula;
    private double notas;

    public Aluno(String nome, int idade, int matricula, double notas) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.notas = notas;
    }

    @Override
    public boolean MenorQue(Iordenacao outro) {
        if (outro instanceof Aluno) {
            Aluno outroAluno = (Aluno) outro;
            boolean a = this.matricula < (outroAluno.matricula);
            System.out.println(a);
        }
        return false;
    }
    @Override
    public boolean Igual(Iordenacao outro) {
        if (outro instanceof Aluno) {
            Aluno outroAluno = (Aluno) outro;
            boolean a = this.matricula == outroAluno.matricula;
            System.out.println(a);
        }
        return false;
    }



}
