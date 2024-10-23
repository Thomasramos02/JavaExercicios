package POO.javacore.Introduçãoclasses.InterfacesComQuickShort;

public class Pedido implements Iordenacao{

    private int IdPedido;
    private String NomePedido;
    private double PrecoPedido;


    @Override
    public boolean MenorQue(Iordenacao outro){
        if(outro instanceof Pedido){
            Pedido p = (Pedido) outro;
            boolean a = this.IdPedido < p.IdPedido;
            System.out.println(a);
        }
        return false;
    }

    @Override
    public boolean Igual(Iordenacao outro) {
        if (outro instanceof Pedido){
            Pedido p = (Pedido) outro;
            boolean a = this.IdPedido == p.IdPedido;
            System.out.println(a);
        }
        return false;
    }
}
