/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import modeloConection.ConexaoBD;
import modeloBeans.BeansUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaoUsuario {

    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void Salvar(BeansUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuarios(usu_nome, usu_senha, usu_tipo) values (?, ?, ?)");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados");
        }
        conex.desconecta();
    }
    
    public void Editar (BeansUsuario mod){
        conex.conexao();
        try{
        PreparedStatement pst = conex.con.prepareStatement("update usuarios set usu_nome = ?, usu_senha = ?, usu_tipo = ? where usu_cod = ?");
        pst.setString(1, mod.getUsuNome());
        pst.setString(2, mod.getUsuSenha());
        pst.setString(3, mod.getUsuTipo());
        pst.setInt(4, mod.getUsuCod());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Dados alterados com sucesso !");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao editar dados" + ex);
        }
        
        conex.desconecta();
    }
    
    public BeansUsuario buscaUsuario(BeansUsuario mod){
        conex.conexao();
        conex.executaSQL("select *from usuarios where usu_nome like '%" + mod.getPesquisa()+ "%'");
        try{
            conex.rs.first();
            mod.setUsuCod(conex.rs.getInt("usu_cod"));
            mod.setUsuNome(conex.rs.getString("usu_nome"));
            mod.setUsuSenha(conex.rs.getString("usu_senha"));
            mod.setUsuTipo(conex.rs.getString("usu_tipo"));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados");
        }
        conex.desconecta();
        return mod;
    }

    public void Excluir(BeansUsuario mod){
        conex.conexao();
        try{
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where usu_cod = ?");
            pst.setInt(1, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Exclusão de usuário concluída");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuário " + ex);
        }
        conex.desconecta();
    }

}
