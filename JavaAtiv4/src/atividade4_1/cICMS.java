package atividade4_1;

public class cICMS extends Impostos {
    
    // Atributos
    double precoMercadoria;
    
    // Criacao
    public cICMS ( double _alicota, double _precoMercadoria ){
        this.aliquota = _alicota;
        this.vBruto = _precoMercadoria;
        
        this.nome = "ICMS";
        this.vImposto = getvImposto();
        this.vLiquido = getvLiquido();
    }
    
    // Metodos
    @Override
    public void calcImposto (){
        System.out.println(vBruto+"*"+aliquota+"\n= "+vImposto);
    }
    
    @Override
    public void descricao(){
        System.out.println("ICMS: Imposto sobre Circulação de Mercadorias e Serviços");
    };
}
