package br.ufjf.dcc171;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Aula16Exerc1 {
    
    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String driverURL = "jdbc:derby://localhost:1527/2017-3-dcc171-exerc1";
            Connection conexao = DriverManager.getConnection(driverURL, "mateus", "123");
            JanelaEntradaSaida janela = new JanelaEntradaSaida(conexao);
            janela.setVisible(true);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setLocationRelativeTo(null);
        } catch (Exception ex) {
            Logger.getLogger(Aula16Exerc1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
