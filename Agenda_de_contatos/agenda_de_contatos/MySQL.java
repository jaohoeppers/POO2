package agenda_de_contatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MySQL extends contato{

    public MySQL(String nome, String datanasc, String telefone, String email) {
        super(nome, datanasc, telefone, email);
    }

    final String NOMEDATABELA = "contatos";

    public boolean inserir() {
        try {
            Connection conn = conexoes.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome, datanasc, telefone, email) VALUES (?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, this.getNome());
            ps.setString(2, this.getDatanasc());
            ps.setString(3, this.getTelefone());
            ps.setString(4, this.getEmail());
            // ps.setInt(2, marca.getNumero());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
//    public boolean alterar(Marca marca) {
//        try {
//            Connection conn = Conexao.conectar();
//            String sql = "UPDATE " + NOMEDATABELA + " SET descricao = ? WHERE codigo = ?;";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, marca.getDescricao());
//            ps.setInt(2, marca.getCodigo());
//            ps.executeUpdate();
//            ps.close();
//            conn.close();
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//    public boolean excluir(Marca marca) {
//        try {
//            Connection conn = Conexao.conectar();
//            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, marca.getCodigo());
//            ps.executeUpdate();
//            ps.close();
//            conn.close();
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//    public Marca procurarPorCodigo(Marca marca) {
//        try {
//            Connection conn = Conexao.conectar();
//            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, marca.getCodigo());
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                Marca obj = new Marca();
//                obj.setCodigo(rs.getInt(1));
//                obj.setDescricao(rs.getString(2));
//                ps.close();
//                rs.close();
//                conn.close();
//                return obj;
//            } else {
//                ps.close();
//                rs.close();
//                conn.close();
//                return null;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//    public Marca procurarPorDescricao(Marca marca) {
//        try {
//            Connection conn = Conexao.conectar();
//            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE descricao = ?;";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, marca.getDescricao());
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                Marca obj = new Marca();
//                obj.setCodigo(rs.getInt(1));
//                obj.setDescricao(rs.getString(2));
//                ps.close();
//                rs.close();
//                conn.close();
//                return obj;
//            } else {
//                ps.close();
//                rs.close();
//                conn.close();
//                return null;
//            }
//        } catch (Exception e) {
//            return null;
//        }
//    }
//    public boolean existe(Marca marca) {
//        try {
//            Connection conn = Conexao.conectar();
//            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE descricao = ?;";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, marca.getDescricao());
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                ps.close();
//                rs.close();
//                conn.close();
//                return true;
//            }
//        } catch (Exception e) {
//            //System.err.println("Erro: " + e.toString());
//            //e.printStackTrace();
//            return false;
//        }
//        return false;
//    }
//    public List<Marca> pesquisarTodos() {
//        try {
//            Connection conn = Conexao.conectar();
//            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            List<Marca> listObj = montarLista(rs);
//            return listObj;
//        } catch (Exception e) {
//            //System.err.println("Erro: " + e.toString());
//            //e.printStackTrace();
//            return null;
//        }
//    }
//    public List<Marca> montarLista(ResultSet rs) {
//        List<Marca> listObj = new ArrayList<Marca>();
//        try {
//            while (rs.next()) {
//                Marca obj = new Marca();
//                obj.setCodigo(rs.getInt(1));
//                obj.setDescricao(rs.getString(2));
//                listObj.add(obj);
//            }
//            return listObj;
//        } catch (Exception e) {
//            //System.err.println("Erro: " + e.toString());
//            //e.printStackTrace();
//            return null;
//        }
//    }
}
