package com.example.danilo.appdebts;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.danilo.appdebts.DAO.CategoryDAO;
import com.example.danilo.appdebts.classes.Category;
import com.example.danilo.appdebts.database.DatabaseHelper;

public class TelaInicial extends AppCompatActivity {
    private SQLiteDatabase mConection;
    private DatabaseHelper mDataHelper;
    private ConstraintLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
        mLayout = findViewById(R.id.layout);

        createConnection();
        Category category = new Category("Tia do Lanche");
        CategoryDAO categoryDAO = new CategoryDAO(mConection);
//        categoryDAO.insert(category);
        categoryDAO.list();
        Log.d("CategoryList", categoryDAO.get(2).getType());
    }

    private void createConnection() {
        try {
            mDataHelper = new DatabaseHelper(this);
            mConection = mDataHelper.getWritableDatabase();
            Log.d("Database", "Conexão realizada com sucess");
            Snackbar.make(mLayout, R.string.sucess_conection, Snackbar.LENGTH_LONG).show();
        } catch (SQLException e) {
            Log.d("Database", "Erro na conexão", e);
            Snackbar.make(mLayout, e.toString(), Snackbar.LENGTH_LONG).show();
        }
    }
}
