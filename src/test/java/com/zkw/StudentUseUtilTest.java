package com.zkw;

import com.mastertheboss.domain.Address;
import com.mastertheboss.domain.Student;
import com.mastertheboss.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class StudentUseUtilTest {
    @Test
    public void testSaveStudent(){
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        Address a = new Address(3,"300000","tianjin");
        session.save(a);
        Student s = new Student(11,"www");
        a.getStudents().add(s);
        session.save(s);

        tx.commit();
        HibernateUtil.closeSession(session);

    }
}
