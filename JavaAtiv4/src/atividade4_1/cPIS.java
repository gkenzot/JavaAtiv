package atividade4_1;

public class cPIS extends Impostos implements ImpSimples {
    
    // Atributos
    double credito, debito;
    
    // Criacao
    public cPIS ( double _debito, double _credito ){
        this.credito = _credito;
        this.debito = _debito;
        this.vBruto = _debito - _credito;
        
        this.aliquota = 0.0165;

        this.nome = "PIS";
        this.vImposto = getvImposto();
        this.vLiquido = getvLiquido(); 
    }
    
    //Metodos
    @Override
    public void calcImposto (){
        mostrarExtrato();
        System.out.println(vBruto+"*"+aliquota+"\n= "+vImposto);
    }
    
    @Override
    public void mostrarExtrato(){
        System.out.println("("+debito+"-"+credito+")*"+aliquota);
    };
    
    @Override
    public void descricao(){
        System.out.println("PIS: Programa de Integração Social");
    };
}
