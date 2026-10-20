/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.atividade;

import ifc.ibirama.atividade.bombeiro.Bombeiro;
import ifc.ibirama.atividade.util.HibernateUtil;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class GerenciarBombeiro {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Bombeiro bombeiro01 = new Bombeiro();
        bombeiro01.setCpf("12345678900");
        bombeiro01.setNome("Fulano Silva");
        bombeiro01.setNome_Guerra("Silva");
        bombeiro01.setData_Nacimento(LocalDate.of(2000, Month.MARCH, 14));

        Transaction transacao = null;
        try{
            transacao = session.beginTransaction();
            
            session.persist(bombeiro01);
            transacao.commit();
            
            session.close();
            
        }catch (Exception erro) {
            if (transacao != null){
                transacao.rollback();
            }
        }
        
        
        
        System.out.println("Conexao estabelecida com sucesso!");
        HibernateUtil.shutdown();
    }
}
