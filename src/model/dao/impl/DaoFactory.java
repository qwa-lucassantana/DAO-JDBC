package model.dao.impl;
import com.mysql.jdbc.Connection;
import db.DB;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC((Connection) DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC((Connection) DB.getConnection());
    }
}
