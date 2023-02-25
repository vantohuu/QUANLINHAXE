package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tr = session.beginTransaction();
		TaiKhoan tk = new TaiKhoan();
		tk.setUsername("tan123");
		tk.setPassword("12345");
		tk.setTrangThai(1);
		tk.setTongGioLam(0);
		session.save(tk);
		
		tr.commit();
		session.close();
	}
}
