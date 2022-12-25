/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Banco;

/**
 *
 * @author ILSPereira-InfI171
 */
public class produto {
    private int idproduto;
    private String codigo;
    private String descriçao;
    private float Prvenda;
 
    
    
  
    public produto(){
        idproduto = 0;
        codigo = null;
        descriçao = null;
        Prvenda = 0;
    }

    /**
     * @return the idproduto
     */
    public int getIdproduto() {
        return idproduto;
    }

    /**
     * @param idproduto the idproduto to set
     */
    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descriçao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descriçao = descricao;
    }

    /**
     * @return the prvenda
     */
    public float getPrvenda() {
        return Prvenda;
    }

    /**
     * @param prvenda the prvenda to set
     */
    public void setPrvenda(float prvenda) {
        this.Prvenda = prvenda;
    }
   
   public ResultSet procurar(String codigo){
   PreparedStatement st = null;
   ResultSet rs = null;
   String sql = "SELECT * FROM produto WHERE codigo = ?";
        try {
            st = new Banco().getCon().prepareStatement(sql);
            st.setString(1,codigo);
            rs = st.executeQuery();
         
        } catch (SQLException ex) {
            Logger.getLogger(produto.class.getName()).log(Level.SEVERE, null, ex);
            
        }
   return rs;
   }
           
   
}
