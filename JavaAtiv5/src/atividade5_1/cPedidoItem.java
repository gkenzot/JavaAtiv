package atividade5_1;

public class cPedidoItem {
    
    // Atributo
    int nItem, nQtd;
    String obsItem;
    double valorItemTotal;
    
    
    // funcao eu entregue o numero(atributo) do item e retorne nome(atributo) e valor(atributo)
    // o objeto deve ser encontrado no arraylist por meio do numero(atributo)
    
    
    
    // Criacao
    public cPedidoItem ( int _nItem, double _valorItem, String _nome, int _nQtd, String _obsItem){
        this.nQtd = _nQtd;
        this.obsItem = _obsItem;
        this.nItem = _nItem;
    }
    
    // Metodos
    public void showPedidoItem (){
        System.out.println ("   " + nItem + " " + nome + " " + nQtd + " x " + valorItem + "  R$" + valorItemTotal );
    }
    
    public void showPedidoItemCozinha (){
        System.out.println ("item: " + nItem + "      " + nome + " x " + nQtd );
    }
    
    

}
