/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

public class BeansPacientes {

    private int codPac;
    private String nomePac;
    private String nasc;
    private String telefone;
    private String rua;
    private String complemento;
    private String cep;
    private String nomeBairro;
    private String pesquisar;
    private String rg;
    
    public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }

    public int getCodPac(){
        return codPac;
    }
    
    public void setCodPac(int codPac){
        this.codPac = codPac;
    }
    
    public String getNomePac(){
        return nomePac;
    }
    
    public void setNomePac(String nomePac){
        this.nomePac = nomePac;
    }

    public String getNasc(){
        return nasc;
    }

    public void setNasc(String nasc){
        this.nasc = nasc;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getComplemento(){
        return complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getNomeBairro(){
        return nomeBairro;
    }
    
    public void setNomeBairro(String nomeBairro){
        this.nomeBairro = nomeBairro;
    }

    public String getPesquisar(){
        return pesquisar;
    }
    
    public void setPesquisar(String pesquisar){
        this.pesquisar = pesquisar;
    }
}
