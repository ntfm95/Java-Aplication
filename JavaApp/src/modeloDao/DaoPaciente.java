/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansPacientes;

public class DaoPaciente {

    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexBairro = new ConexaoBD();
    String nomeBairro;
    int codBai = 0;
    
    public void buscaBaiCod(String nome){
        conex.conexao();
        conex.executaSQL("select * from bairro where bainome = '"+nome+"'");
        try{
            conex.rs.first();
            codBai = conex.rs.getInt("baicodigo");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar bairro" + ex);
        }
        
        conex.desconecta();
    }

    public void Salvar(BeansPacientes mod) {
        buscaBaiCod(mod.getNomeBairro());
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into pacientes(paci_nome, paci_rg, paci_telefone, paci_rua, paci_cep, paci_complemento, paci_baicodigo, paci_nasc) values(?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, mod.getNomePac());
            pst.setString(2, mod.getRg());
            pst.setString(3, mod.getTelefone());
            pst.setString(4, mod.getRua());
            pst.setString(5, mod.getCep());
            pst.setString(6, mod.getComplemento());
            pst.setInt(7, codBai);
            pst.setString(8, mod.getNasc());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Paciente inserido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados !" + ex);
        }
        conex.desconecta();
    }

    public void Editar(BeansPacientes mod) {
        buscaBaiCod(mod.getNomeBairro());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update pacientes set paci_nome = ?, paci_rg = ?, paci_telefone = ?, paci_rua = ?, paci_cep = ?, paci_complemento = ?,paci_baicodigo = ?, paci_nasc = ? where paci_codigo = ?");
            pst.setString(1, mod.getNomePac());
            pst.setString(2, mod.getRg());
            pst.setString(3, mod.getTelefone());
            pst.setString(4, mod.getRua());
            pst.setString(5, mod.getCep());
            pst.setString(6, mod.getComplemento());
            pst.setInt(7, codBai);
            pst.setString(8, mod.getNasc());
            pst.setInt(9, mod.getCodPac());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro, ao editar dado !\nErro :" + ex);
        }

        conex.desconecta();
    }
    
    public BeansPacientes buscaPacientes(BeansPacientes mod){
        conex.conexao();
        try{
            conex.executaSQL("select * from pacientes where paci_nome like '%"+mod.getPesquisar()+"%'");
            conex.rs.first();
            buscaNomeBairro(conex.rs.getInt("paci_baicodigo"));
            mod.setCodPac(conex.rs.getInt("paci_codigo"));
            mod.setNomePac(conex.rs.getString("paci_nome"));
            mod.setRg(conex.rs.getString("paci_rg"));
            mod.setTelefone(conex.rs.getString("paci_telefone"));
            mod.setRua(conex.rs.getString("paci_rua"));
            mod.setCep(conex.rs.getString("paci_cep"));
            mod.setComplemento(conex.rs.getString("paci_complemento"));
            mod.setNasc(conex.rs.getString("paci_nasc"));
            mod.setNomeBairro(nomeBairro);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar paciente");
        }
        
        conex.desconecta();
        return mod;
    }
    
    public void buscaNomeBairro(int cod){
        conexBairro.conexao();
        try {
            conexBairro.executaSQL("select * from bairro where baicodigo = '"+ cod +"'");
            conexBairro.rs.first();
            nomeBairro = conexBairro.rs.getString("bainome");
        } catch (SQLException ex) {
            Logger.getLogger(DaoPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conexBairro.desconecta();
    }
    public void Excluir (BeansPacientes mod)
    {
        conex.conexao();
        try{
            PreparedStatement pst = conex.con.prepareStatement("delete from pacientes where paci_codigo = ?");
            pst.setInt(1, mod.getCodPac());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Exclusão de paciente concluída");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir paciente" + ex);
        }
        conex.desconecta();
    }
}
