package atividade4_1;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcImposto {

    public static void main(String[] args) {
        
        // criando lista
        ArrayList<Impostos> impostos = new ArrayList<>();
        
        // criando base inicial (exemplos)
        cPIS imp1 = new cPIS (30000,16000); // no exemplo esta 235, mas o correto eh 231 utilizando 1.65%
        cCofins imp2 = new cCofins (30000,16000);
        cICMS imp3 = new cICMS (0.15,500);
        cIPI imp4 = new cIPI(0.05,90,10,5,5);
        
        impostos.add(imp1);
        impostos.add(imp2);
        impostos.add(imp3);
        impostos.add(imp4);
        
    
        boolean continuar = true;
        while ( continuar == true ){

            Scanner entrada = new Scanner (System.in);
            System.out.println("1- Adicionar imposto, 2- Mostrar todos os impostos, 3- Consultar Imposto, 4-Sair)");
            int scan = entrada.nextInt();

            switch (scan) {
                // Adicionar imposto
                case 1 -> {
                    
                    System.out.println("1-PIS, 2-Cofins, 3-ICMS, 4-IPI");
                    int scan1 = entrada.nextInt();
                    
                    switch (scan1){
                        // Criar PIS
                        case 1 -> {
                            System.out.println("valor debito?");
                            double debito = entrada.nextDouble();
                            System.out.println("valor credito?");
                            double credito = entrada.nextDouble();
                            cPIS imp = new cPIS(debito,credito);
                            impostos.add(imp);
                        }
                        // Criar Cofins
                        case 2 -> {
                            System.out.println("valor debito?");
                            double debito = entrada.nextDouble();
                            System.out.println("valor credito?");
                            double credito = entrada.nextDouble();
                            cCofins imp = new cCofins(debito,credito);
                            impostos.add(imp); 
                        }
                        // Criar ICMS
                        case 3 -> {
                            System.out.println("valor aliquota em &?");
                            double aliquota = entrada.nextDouble();
                            System.out.println("preço da mercadoria?");
                            double precoMercadoria = entrada.nextDouble();
                            cICMS imp = new cICMS(aliquota,precoMercadoria);
                            impostos.add(imp);
                        }
                        // Criar IPI
                        case 4 -> {
                            System.out.println("valor aliquota em &?");
                            double aliquota = entrada.nextDouble()/100;
                            System.out.println("valor do produto?");
                            double valorProduto = entrada.nextDouble();
                            System.out.println("valor frete?");
                            double frete = entrada.nextDouble();
                            System.out.println("valor seguro?");
                            double seguro = entrada.nextDouble();
                            System.out.println("outras despesas?");
                            double despesas = entrada.nextDouble();
                            cIPI imp = new cIPI(aliquota,valorProduto,frete,seguro,despesas);
                            impostos.add(imp);
                        }
                        
                        default -> {
                        }
                    }
                }
                
                // Mostrar todos os impostos
                case 2 -> {
                    for ( int i=0 ; impostos.size()>i ; i++){
                        Impostos imp = impostos.get(i);
                        System.out.print( i+1 + "° ");
                        imp.showImposto();
                    }
                }
                
                // Consultar Imposto
                case 3 -> {
                    entrada = new Scanner (System.in);
                    System.out.println("Numero do imposto?");
                    scan = entrada.nextInt();
                    
                    Impostos imp = impostos.get(scan-1);
                    imp.descricao();
                    imp.showImposto();
                    imp.calcImposto();
                }
                
                // Sair
                case 4 -> {
                    continuar = false;
                    System.out.println("-> Sair");
                }
                
                // Valor invalido
                default -> {
                    System.out.println("-> Valor invalido");
                }
            }
        }
    }
}
