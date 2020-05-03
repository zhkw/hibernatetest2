package com.zkw;

import com.mastertheboss.domain.Address;
import com.mastertheboss.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init(){
        Configuration config = new Configuration().configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        sessionFactory = config.buildSessionFactory(serviceRegistry);
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    @After
    public void destory(){
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @Test
    public void testSaveStudent(){
//        Student s = new Student(3,"bbb");
//        Address address = new Address(1,"100020","beijing");
//        s.setAddress(address);
//        session.save(s);
    }

    @Test
    public void testReadStudent(){
        Student s = (Student) session.get(Student.class,1);
        System.out.println(s);
    }

    @Test
    public void testStudentInAddress(){
        Address a = new Address(2,"100000","shanghai");
        session.save(a);
        Student s = new Student(10,"qqq");
        a.getStudents().add(s);
        session.save(s);

    }
}
