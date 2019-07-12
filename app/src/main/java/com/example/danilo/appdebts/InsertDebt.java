package com.example.danilo.appdebts;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

public class InsertDebt extends AppCompatActivity {

    private FloatingActionButton mFabNewCategory;
    private Spinner mSpinnerCategories;
    private EditText mEditTextDescription;
    private EditText mEditTextDate;
    private EditText mEditTextValue;
    private Switch mSwitchPay;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_add_debts,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_debt);

        //Linking Elements
        mFabNewCategory = findViewById(R.id.fabNewCategory);
        mSpinnerCategories = findViewById(R.id.spinnerCategories);
        mEditTextDescription = findViewById(R.id.editTextDescription);
        mEditTextDate = findViewById(R.id.editTextDate);
        mEditTextValue = findViewById(R.id.editTextValue);
        mSwitchPay = findViewById(R.id.switchPay);

        //ActionBar Configuration
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true); //Ativar o botão
        getSupportActionBar().setTitle(R.string.insertTitle);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //Botão na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home: //ID do seu botão (gerado automaticamente pelo android, usando comoestá, deve funcionar
                startActivity(new Intent(this, MainWindow. class)); //O efeito ao ser pressionado do botão(no caso abre a activity)
                finishAffinity(); //Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:break;
        }
        return true;
    }
}
