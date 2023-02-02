package atividade4_1;

public abstract class Impostos {
    
    // Atributosa
    String nome;
    double vBruto, aliquota, vLiquido, vImposto;
    
    // Metodos
    public double getvImposto(){
        vImposto = vBruto * aliquota;
        return vImposto;
    }
    
    public double getvLiquido(){
        vLiquido = vBruto * (1 - aliquota);
        return vLiquido;
    }
    
    public void showImposto(){
        System.out.print("O imposto " + nome);
        System.out.printf(" é de %.2f ", vImposto);
        System.out.print(" || Valor Bruto: " + vBruto + " e Liquido " + vLiquido );
        System.out.printf(" || Aliquota: %.2f ", aliquota*100 ); System.out.print(" % \n");
    }
    
    public void calcImposto(){};
    
    public void descricao(){};
    
}
