package POO.javacore.Introduçãoclasses.InterfacesComQuickShort;

public interface Iordenacao {

    /*A interface Iordenacao é utilizada para o uso dos metodos abaixo em Aluno e Pedido, ela impede que
    pedido e Aluno seja utilizado junto em um metodo, por exemplo seria impossivel usar o metodo MenorQue com o ID
    do pedido com a matricula do aluno*/


    public boolean MenorQue(Iordenacao outro);
    public boolean Igual(Iordenacao outro);
    /*A interface nao pode ser instanciada ou seja ela precisa de uma classe para utilizar seus metodos e
    atributos, assim todos os metodos de Iordenacao deve estar nas classes que implementam esta Interface, no
    caso Aluno e Pedido*/
}
