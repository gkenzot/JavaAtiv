package atividade5_1;

public class cBebida extends cCardapio {
    
    // Atributos
    double volume;
    
    // Criacao
    public cBebida (int _numero, double _valor, String _nome, double _volume){
        this.numero = _numero;
        this.nome = _nome;
        this.volume = _volume;
        this.valor = _valor;
    }
    
    // Metodos
    @Override
    public void showItem (){
        System.out.println("n " + numero + " " + nome + " " + volume + "ml || R$" + valor);
    }
    
    @Override
    public void showItemPedido (){
        System.out.print("item n " + numero + " " + nome + " ");
    }
    
    @Override
    public double getValor ( String _obsItem){ 
        return valor; 
    };
    
    @Override
    public String getNome (){ return nome; };
    
}
