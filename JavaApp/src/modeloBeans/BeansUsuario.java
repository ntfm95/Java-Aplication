/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;


public class BeansUsuario {
    
    private Integer usuCod;
    private String usuNome;
    private String usuTipo;
    private String usuSenha;
    private String pesquisa;
    
//pesquisa
    public String getPesquisa(){
        return pesquisa;
    }
    public void setPesquisa(String pesquisa){
        this.pesquisa = pesquisa;
    }
//Cod    
    public Integer getUsuCod(){
        return usuCod;
    }
    public void setUsuCod(Integer usuCod){
        this.usuCod = usuCod;
    }
//nome
    public String getUsuNome(){
        return usuNome;
    }
    public void setUsuNome(String usuNome){
        this.usuNome = usuNome;
    }
//tipo
    public String getUsuTipo(){
        return usuTipo;
    }
    public void setUsuTipo(String usuTipo){
        this.usuTipo = usuTipo;
    }
//senha
    public String getUsuSenha(){
        return usuSenha;
    }
    public void setUsuSenha(String usuSenha){
        this.usuSenha = usuSenha;
    }
}
