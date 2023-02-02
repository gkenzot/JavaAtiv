package atividade5_1;

public class cPizza extends cCardapio {
    
    // Atributos
    String tipo, ingredientes;
    double valorP, valorM, valorG;
    
    // Criacao
    public cPizza (int _numero, String _tipo, String _sabor, String _ingredientes){
        this.numero = _numero;
        this.tipo = _tipo;
        this.nome = _sabor;
        this.ingredientes = _ingredientes;
        this.valorP = ( _tipo.equals("salgado")) ? 17.90 : 21.90 ;
        this.valorM = ( _tipo.equals("salgado")) ? 24.90 : 29.90 ;
        this.valorG = ( _tipo.equals("salgado")) ? 38.90 : 44.90 ;
    }
    
    // Metodos
    @Override
    public void showItem (){
        System.out.println("n " + numero + " - " + nome
            + "\n    " + ingredientes 
            + "\n    P R$" + valorP + " || M R$" + valorM + " || G R$" + valorG
            );
    }
    
    @Override
    public void showItemPedido (){
        System.out.print("item n " + numero + " - " + nome + " ");
    }
    
    @Override
    public double getValor ( String _obsItem ){ 
        switch ( _obsItem ) {
            case "P" -> { valor = valorP; }
            case "M" -> { valor = valorM; }
            case "G" -> { valor = valorG; }
            case "p" -> { valor = valorP; }
            case "m" -> { valor = valorM; }
            case "g" -> { valor = valorG; }
        }
        return valor; 
    };
    
    @Override
    public String getNome (){ return nome; };
       
}
