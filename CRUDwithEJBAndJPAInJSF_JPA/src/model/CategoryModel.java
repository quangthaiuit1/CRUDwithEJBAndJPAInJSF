package model;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class CategoryModel {
    private static final String PERSISTENCE_UNIT_NAME = "CRUDwithEJBAndJPAInJSF_JPA";   
    private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
    private static EntityTransaction transactionObj = entityMgrObj.getTransaction();	
    
    // Method To Fetch All School Details From The Database
    public static List findAll() {
        Query queryObj = entityMgrObj.createQuery("SELECT s FROM Category s");
        List categoryList = queryObj.getResultList();
        if (categoryList != null && categoryList.size() > 0) {           
            return categoryList;
        } else {
            return null;
        }
    }
	/*
	 * public void addCategory(String name) { Session session = null; Transaction
	 * transaction = null;
	 * 
	 * 
	 * try { session = sessionFactory.openSession(); transaction =
	 * session.beginTransaction(); Date date = new Date(); category = new
	 * Category(); category.setName(name); category.setCreatedDate(date);
	 * session.save(category); transaction.commit(); } catch (HibernateException e)
	 * { if (transaction != null) transaction.rollback(); e.printStackTrace(); }
	 * finally { session.close(); } }
	 * 
	 * @SuppressWarnings({"unchecked" }) public List<Category> findAll() {
	 * List<Category> categorys = null; Session session = null; Transaction
	 * transaction = null; try {
	 * 
	 * session = sessionFactory.openSession(); transaction =
	 * session.beginTransaction(); categorys =
	 * session.createQuery("from Category").list(); transaction.commit();
	 * System.out.println("hết findAll"); } catch (Exception e) { categorys =
	 * null; if (transaction != null) { transaction.rollback(); } } finally {
	 * session.close(); } return categorys; } public void updateCategory(String
	 * name,int id){ Session session = null; Transaction transaction = null;
	 * 
	 * 
	 * try { session = sessionFactory.openSession(); transaction =
	 * session.beginTransaction(); Category category =
	 * (Category)session.get(Category.class, id); Date date = new Date();
	 * category.setName(name); category.setModifiedDate(date);
	 * 
	 * session.update(category); transaction.commit(); } catch (HibernateException
	 * e) { if (transaction != null) transaction.rollback(); e.printStackTrace(); }
	 * finally { session.close(); }
	 * 
	 * } public void deleteCategory(int id){ Session session = null; Transaction
	 * transaction = null; try {
	 * 
	 * session = sessionFactory.openSession(); transaction =
	 * session.beginTransaction(); category = (Category)session.get(Category.class,
	 * id); session.delete(category); transaction.commit(); } catch (Exception e) {
	 * e.getStackTrace(); if (transaction != null) { transaction.rollback(); } }
	 * finally { session.close(); } }
	 * 
	 * public Category findById(int id) { Session session = null; Transaction
	 * transaction = null; try {
	 * 
	 * session = sessionFactory.openSession(); transaction =
	 * session.beginTransaction(); category = (Category)session.get(Category.class,
	 * id); transaction.commit(); } catch (Exception e) { category = null; if
	 * (transaction != null) { transaction.rollback(); } } finally {
	 * session.close(); } return category; }
	 */
}