/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.List;
import segana.Rolusuario;
import org.hibernate.Query;
import org.hibernate.Session;
import segana.Encuentro;
import segana.Equipo;

/**
 *
 * @author eddytrex
 */
public class TorneoD {
    public List <encuentrosSet> ES;
    
    public List<Encuentro> getTorneo()
    {
       Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("from Encuentro");
        List<Encuentro> resultList = q.list();        
        session.getTransaction().commit();   
        int i=0;
        
        while (i<resultList.size())
        {
            encuentrosSet temp=new encuentrosSet();
            temp.encuentro=resultList.get(i);
            temp.KeyEncuentro=resultList.get(i).getIdencuentro()+"id";
            
        
            i++;
        }
        
        
        
        
        return  resultList;
    }
    public String  getNombreEquipo(int IDEquipo)
    {
        String res="";
         Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("from Equipo WHERE idequipo='"+IDEquipo+"'");
        List<Equipo> resultList = q.list();        
        if(resultList.size()==1)
        {res=resultList.get(0).getNombre();}
        session.getTransaction().commit();          
        return res;
    }
    
}
