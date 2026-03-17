package crud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import conexao.ConexaoDB;
import model.Filme;

public class FilmeCRUD {

    public void inserir(Filme f){

        String sql = "INSERT INTO filme(nome,anoLancamento,duracao,genero,sinopse,plataformas,diretor) VALUES(?,?,?,?,?,?,?)";

        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1,f.getNome());
            ps.setInt(2,f.getAnoLancamento());
            ps.setInt(3,f.getDuracao());
            ps.setString(4,f.getGenero());
            ps.setString(5,f.getSinopse());
            ps.setString(6,f.getPlataformas());
            ps.setString(7,f.getDiretor());

            ps.executeUpdate();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<Filme> listar(){

        List<Filme> lista = new ArrayList<>();
        String sql = "SELECT * FROM filme";

        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while(rs.next()){

                Filme f = new Filme();

                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setAnoLancamento(rs.getInt("anoLancamento"));
                f.setDuracao(rs.getInt("duracao"));
                f.setGenero(rs.getString("genero"));
                f.setSinopse(rs.getString("sinopse"));
                f.setPlataformas(rs.getString("plataformas"));
                f.setDiretor(rs.getString("diretor"));

                lista.add(f);
            }

        } catch(Exception e){
            e.printStackTrace();
        }

        return lista;
    }

    public Filme buscarPorId(int id) {
        String sql = "SELECT * FROM filme WHERE id = ?";
        Filme f = null;

        try (Connection conn = ConexaoDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                f = new Filme();
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setAnoLancamento(rs.getInt("anoLancamento"));
                f.setDuracao(rs.getInt("duracao"));
                f.setGenero(rs.getString("genero"));
                f.setSinopse(rs.getString("sinopse"));
                f.setPlataformas(rs.getString("plataformas"));
                f.setDiretor(rs.getString("diretor"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f;
    }

    public void deletar(int id){

        String sql = "DELETE FROM filme WHERE id=?";

        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1,id);
            ps.executeUpdate();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}