/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
public class testaProduto {
    public static void main(String[] args){
        Data d1=new Data();
        d1.dia=10;
        d1.mes=9;
        d1.ano=2020;
        
        Produto p1= new Produto();
        p1.nome="Racao";
        p1.peso=10.5;
        p1.dataDeFabricacao=d1;
        
        System.out.println(d1.imprimir());
    }
}
