package atividade5_1;

public abstract class cCardapio {
    
    // Atributos
    int numero;
    double valor;
    String nome;
    
    // Metodos
    public void showItem (){};
    
    public void showItemPedido (){};
       
    public double getValor ( String _obsItem ){ 
        return valor; 
    };
    
    public int getNumero (){ return numero; }
    
    public String getNome (){ return nome; }
}
