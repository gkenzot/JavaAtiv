package atividade5_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizzaria {

    public static void main(String[] args) {
        
        // criando lista cardapio
        ArrayList<cCardapio> cardapio = new ArrayList<>();
        
        // populando o cardapio
        cardapio.add( new cPizza( 1 , "salgado" , "Calabresa" , "calabresa, cebola, mussarela" ) );
        cardapio.add( new cPizza( 2 , "salgado" , "Frango" , "frango, catupiry, mussarela" ) );
        cardapio.add( new cPizza( 3 , "salgado" , "Peperone" , "peperone, mussarela" ) );
        cardapio.add( new cPizza( 4 , "doce" , "Chcolate branco" , "choclate branco, mussarela" ) );
        cardapio.add( new cPizza( 5 , "doce" , "Sensacao" , "chocolate, morango, mussarela" ) );
        cardapio.add( new cPizza( 6 , "doce" , "Sorvete" , "Sorvete e uma fina massa" ) );
        cardapio.add( new cBebida( 7 , 5.00 , "Coca-cola lata" , 350 ) );
        cardapio.add( new cBebida( 8 , 11.00 , "Brahma litrao" , 1000 ) );
        cardapio.add( new cBebida( 9 , 3.50 , "Agua" , 500 ) );
               
        // criando lista pedidoItem
        ArrayList<cPedidoItem> pedidoItem = new ArrayList<>();
        
        // populando pedidos
        pedidoItem.add( new cPedidoItem( 1 , 38.90 , "Calabresa" , 1 , "g"));
        pedidoItem.add( new cPedidoItem( 7 , 5.00 , "Coca-cola lata" , 2 , ""));
        pedidoItem.add( new cPedidoItem( 8 , 11.00 , "Brahma litrao" , 1 , ""));
        pedidoItem.add( new cPedidoItem( 5 , 29.90 , "Sensacao" , 1 , "m"));
        pedidoItem.add( new cPedidoItem( 2 , 17.90 , "Frango" , 3 , "P"));
        pedidoItem.add( new cPedidoItem( 6 , 44.90 , "Sorvete" , 5 , "G"));
        pedidoItem.add( new cPedidoItem( 3 , 24.90 , "Peperone" , 1 , "M"));
        pedidoItem.add( new cPedidoItem( 4 , 21.90 , "Chcolate branco" , 4 , "P"));
        pedidoItem.add( new cPedidoItem( 9 , 3.50 , "Agua" , 2 , ""));
        int memoriaPedidos = 0;
        
        
        // entrando nas opcoes
        int option0 = 0;
        while (option0 !=5){
            Scanner entrada = new Scanner (System.in);
            System.out.println("1 - Mostrar menu || 2 - Adicionar no Menu || 3 - Fazer pedido || 4 - Modo cozinha || 5 - Sair");
            option0 = entrada.nextInt();
            switch ( option0 ) {
                case 1 -> { // Mostrar menu
                    System.out.println("------ MENU ------");
                    System.out.println("Tamanhos: P 20cm | M 30cm | G 40cm");
                    for ( int i=0 ; cardapio.size()>i ; i++ ){
                        cCardapio item1 = cardapio.get(i);
                        item1.showItem();
                    }
                }

                case 2 -> { // Adicionar no menu
                    entrada = new Scanner (System.in);
                    System.out.println("1 - Pizza || 2 - Bebida");
                    int option1 = entrada.nextInt();
                    if ( option1 == 1){
                        // Valores ja pre setados
                        System.out.println("*para n fazer mais perguntas, coloquei ja valores pre setados para pizza 4 QUEIJOS");
                        String _tipo = "salgado";
                        String _sabor = "4 Queijos";
                        String _ingredientes = "mussarela, catupiry, parmesao e provolone";
                        cardapio.add( new cPizza( cardapio.size()+1 , _tipo , _sabor , _ingredientes ) );
                    } else {
                        // Valores ja pre setados
                        System.out.println("*para n fazer mais perguntas, coloquei ja valores pre setados para CAIPIRINHA");
                        double _valor = 14.90;
                        String _nome = "Caipirinha";
                        double _volume = 600;
                        cardapio.add( new cBebida( cardapio.size()+1 , _valor , _nome , _volume ) );
                    }
                }
                
                case 3 -> { // Fazer pedido
                    int option2 = 1;
                    while ( option2 == 1){
                        entrada = new Scanner (System.in);
                        System.out.println("Digite o numero do item que deseja");
                        int _nItem = entrada.nextInt();
                        
                        String _obsItem = " ";
                        cCardapio _item = cardapio.get(_nItem -1);
                        if ( _item.getClass().getSimpleName().equals("cPizza")){
                            entrada = new Scanner (System.in);
                            System.out.println("Qual tamanho da pizza? P M ou G ?");
                            _obsItem = entrada.next();
                        } 

                        cCardapio pedirItem = cardapio.get(_nItem -1);
                        double _valorItem = pedirItem.getValor(_obsItem);
                        String _nome = pedirItem.getNome();
                        pedidoItem.add (new cPedidoItem( _nItem , _valorItem , _nome, 1,_obsItem));
                        
                        System.out.println("Pedido n: " + pedidoItem.size());
                        _item.showItemPedido();
                        System.out.println( _obsItem + " - R$" + _valorItem);
                            
                        entrada = new Scanner (System.in);
                        System.out.println("1 - Adicionar novo pedido || 2 - Voltar ao Menu");
                        option2 = entrada.nextInt();
                    }
                }
                
                case 4 -> {
                    String option3 = "C";
                    while ( !option3.equals("P") ){
                        System.out.println(" -------- PROXIMO PEDIDO --------    C - Continuar || P - Parar");
                        
                        cPedidoItem pA = pedidoItem.get(memoriaPedidos);
                        int m1 = memoriaPedidos + 1;
                        System.out.print("Pedido:" + m1 + " ");
                        pA.showPedidoItemCozinha();
                        
                        entrada = new Scanner (System.in);
                        option3 = entrada.next();
                        
                        if (m1 < pedidoItem.size() ){
                            memoriaPedidos++;
                        } else {
                            System.out.println("Nao tem mais pedidos no momento");
                            option3 = "P";
                            memoriaPedidos = pedidoItem.size()-1;
                        }
                        
                        //System.out.print(memoriaPedidos);
                    }
                    System.out.println("voltando ao menu ...");
                }

                default -> { // Sair
                    option0 = 5;
                    System.out.println("SAIR");
                }
            }
        }
    } 
}
