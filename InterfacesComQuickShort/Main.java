package POO.javacore.Introduçãoclasses.InterfacesComQuickShort;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Thomas",18,123,2.90);
        Aluno b = new Aluno("Leo",17,123,5.78);

        a.MenorQue(b);
        a.Igual(b);
    }
}
