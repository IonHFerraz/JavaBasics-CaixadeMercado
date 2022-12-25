/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Banco;


/**
 *
 * @author ILSPereira-InfI171
 */

   


public class pdv2 {
    private int idpdv2;
    private int idpdv1;
    private String produto;
    private int qtdc;
    private float valorunidade;
    private float valor;
    
    

    /**
     * @return the idpdv2
     */
    public int getidpdv2() {
        return idpdv2;
    }

    /**
     * @param idpdv2 the idpdv2 to set
     */
    public void setidpdv2(int idpdv2) {
        this.idpdv2 = idpdv2;
    }

    /**
     * @return the idpdv1
     */
    public int getidpdv1() {
        return idpdv1;
    }

    /**
     * @param idpdv1 the idpdv1 to set
     */
    public void setidpdv1(int idpdv1) {
        this.idpdv1 = idpdv1;
    }

    /**
     * @return the produto
     */
    public String getproduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setproduto(String produto) {
        this.produto = produto;
    }

    /**
     * @return the qtdc
     */
    public int getqtdc() {
        return qtdc;
    }

    /**
     * @param qtdc the qtdc to set
     */
    public void setqtdc(int qtdc) {
        this.qtdc = qtdc;
    }

    /**
     * @return the valorunidade
     */
    public float getvalorunidade() {
        return valorunidade;
    }

    /**
     * @param valorunidade the valorunidade to set
     */
    public void setvalorunidade(float valorunidade) {
        this.valorunidade = valorunidade;
    }

    /**
     * @return the valor
     */
    public float getvalor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setvalor(float valor) {
        this.valor = valor;
    }
                public boolean adicionar() {
        String sql = "INSERT INTO pdv2 (idpdv1,produto,qtdc,Valorunidade,valor) VALUES(?,?,?,?,?)";
        PreparedStatement st;
        int r= 0;
        try {
            st = new Banco().getCon().prepareStatement(sql);
            
            st.setInt(1, getidpdv1());
            st.setString(2, getproduto());
            st.setInt(3, getqtdc());
            st.setFloat(4,getvalorunidade());
            st.setFloat(5,getvalor());
            r = st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(produto.class.getName
        ()).log(Level.SEVERE, null, ex);
            
        }
        return r == 1;
        }

    public pdv2(int idpdv2, int idpdv1, String produto, int qtdc, float valorunidade, float valor) {
        this.idpdv2 = idpdv2;
        this.idpdv1 = idpdv1;
        this.produto = produto;
        this.qtdc = qtdc;
        this.valorunidade = valorunidade;
        this.valor = valor;
    }
                
                
    }



