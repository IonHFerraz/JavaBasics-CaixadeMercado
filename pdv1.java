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
public class pdv1 {
    
    private int idpdv1;
    private String data;
    private double valortotal;

    /**
     * @return the idpdv1
     */
    public int getIdpdv1() {
        return idpdv1;
    }

    public pdv1(int idpdv1, String data, double valortotal) {
        this.idpdv1 = idpdv1;
        this.data = data;
        this.valortotal = valortotal;
    }

    /**
     * @param idpdv1 the idpdv1 to set
     */
    public void setIdpdv1(int idpdv1) {
        this.idpdv1 = idpdv1;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the valortotal
     */
    public double getValortotal() {
        return valortotal;
    }

    /**
     * @param valortotal the valortotal to set
     */
    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }
     public int incluir(){
         String sql = "INSERT INTO pdv1(datacompra,valortotal) VALUES (?,?)";
         PreparedStatement st;
         int id = 0;
        try {
            st = new Banco().getCon().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
              st.setString(1, getData());
            st.setDouble(2, getValortotal());
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next())
            id = rs.getInt(1);
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(pdv1.class.getName()).log(Level.SEVERE, null, ex);
        }
          
            return id;
}

    
}

     



