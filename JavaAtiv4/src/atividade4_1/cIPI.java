package atividade4_1;

public class cIPI extends Impostos {
    
    // Atributos
    double valorProduto, frete, seguro, despesas;
    
    // Criacao
    public cIPI ( double _alicota, double _valorProduto, double _frete, double _seguro, double _despesas ) {
        this.valorProduto = _valorProduto;
        this.frete = _frete;
        this.seguro = _seguro;
        this.despesas = _despesas;
        this.aliquota = _alicota;
        this.vBruto = _valorProduto + _frete + _seguro + _despesas;
        
        this.nome = "IPI";
        this.vImposto = getvImposto();
        this.vLiquido = getvLiquido();
    }
    
    // Metodos
    @Override
    public void calcImposto (){
        System.out.println("("+ valorProduto+"+"+frete+"+"+seguro+"+"+despesas+")*"+aliquota);
        System.out.println(vBruto+"*"+aliquota+"\n= "+vImposto);
    }
    
    @Override
    public void descricao(){
        System.out.println("IPI: Imposto sobre Produtos Industrializados");
    };
}
