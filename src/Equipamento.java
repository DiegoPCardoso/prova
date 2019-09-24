/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
public class Equipamento {
    double preco;
    
    void adicionarImposto(double valor){
        double novopreco=preco+(preco*0.15);
    }
}
