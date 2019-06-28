package com.example.danilo.appdebts.database;

import android.database.sqlite.SQLiteDatabase;

import com.example.danilo.appdebts.DAO.CategoryDAO;
import com.example.danilo.appdebts.DAO.DebtDAO;
import com.example.danilo.appdebts.classes.Category;
import com.example.danilo.appdebts.classes.Debt;

/**
 * Created by aluno on 28/06/19.
 */

public class Seeder {
    public static void seed(SQLiteDatabase connection) {
        CategoryDAO categoryDAO = new CategoryDAO(connection);
        DebtDAO debtDAO = new DebtDAO(connection);

        Category cat1 = categoryDAO.insert(new Category("Alimentação"));
        Category cat2 = categoryDAO.insert(new Category("Pagamentos"));
        Category cat3 = categoryDAO.insert(new Category("Moradia"));
        Category cat4 = categoryDAO.insert(new Category("Roupas"));
        Category cat5 = categoryDAO.insert(new Category("Lazer"));

        Debt debt1 = new Debt();
        debt1.setDescription("Lanche faculdade");
        debt1.setValue(7.50);
        debt1.setPayDate("28/06/2019");
        debt1.setCategory(cat1);

        Debt debt2 = new Debt();
        debt2.setDescription("Açaí");
        debt2.setValue(15.0);
        debt2.setPayDate("22/06/2019");
        debt2.setCategory(cat1);

        Debt debt3 = new Debt();
        debt3.setDescription("Cartão NuBank");
        debt3.setValue(376.89);
        debt3.setPayDate("17/06/2019");
        debt3.setCategory(cat2);

        Debt debt4 = new Debt();
        debt4.setDescription("Cartão Riachuelo");
        debt4.setValue(94.70);
        debt4.setPayDate("22/06/2019");
        debt4.setCategory(cat2);

        Debt debt5 = new Debt();
        debt5.setDescription("Água");
        debt5.setValue(43);
        debt5.setPayDate("24/06/2019");
        debt5.setCategory(cat3);

        Debt debt6 = new Debt();
        debt6.setDescription("Internet");
        debt6.setValue(100);
        debt6.setPayDate("20/06/2019");
        debt6.setCategory(cat3);
    }
}
