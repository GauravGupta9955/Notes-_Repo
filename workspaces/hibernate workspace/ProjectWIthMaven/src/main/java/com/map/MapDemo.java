package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        
		/*
		 * Question question1 = new Question(); question1.setQuestionId(1212);
		 * question1.setQuestion("What is Java?");
		 * 
		 * Answer answer1 = new Answer(); answer1.setAnswerId(343);
		 * answer1.setAnswer("Java is a programming language");
		 * answer1.setQuestion(question1);
		 * 
		 * Answer answer2 = new Answer(); answer2.setAnswerId(344);
		 * answer2.setAnswer("with the help of java we can build software");
		 * answer2.setQuestion(question1);
		 * 
		 * Answer answer3 = new Answer(); answer3.setAnswerId(363);
		 * answer3.setAnswer("java has different type of framework");
		 * answer3.setQuestion(question1); session.save(answer3); session.save(answer2);
		 * session.save(answer1);
		 * 
		 * 
		 * List<Answer> list = new ArrayList<Answer>(); list.add(answer1);
		 * list.add(answer3); list.add(answer2);
		 * 
		 * question1.setAnswers(list);
		 * 
		 * session.save(question1);
		 */
        
        Question q = (Question)session.get(Question.class, 1212);
        System.out.println(q.getQuestionId());
        System.out.println(q.getQuestion());
       
        
        

      

        tx.commit();
        session.close();
        factory.close();
    }
}
