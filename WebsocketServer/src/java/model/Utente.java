/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author davidedelbuono
 */
/**Rappresenta un utente, ovvero un operatore in grado di
 * accedere con le proprie credenziali allo sportello
 */
public class Utente {

    private String id;
    private String password;
    /**
     * 
     * @param id identificativo dell'utente
     * @param password password dell'utente
     */

    public Utente(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Utente{" + "id=" + id + ", password=" + password + '}';
    }

}
