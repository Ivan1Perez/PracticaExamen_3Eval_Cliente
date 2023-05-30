package es.ieslavereda.practicaexamen_3eval_cliente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

import java.io.Serializable;

public class FormularioActivity extends AppCompatActivity {

    public enum MODE implements Serializable{
        UPDATE,CREATE;
    }

    private TextInputEditText hintFruta;
    private Button addBtn;
    private Button cancelBtn;
    private ImageView imageView;
    private Spinner spinner;
    private ArrayAdapter<Fruit> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        MODE mode = MODE.valueOf(getIntent().getExtras().getString(""));

        hintFruta = findViewById(R.id.hintPrecioFruta);
        addBtn = findViewById(R.id.addBtn);
        cancelBtn = findViewById(R.id.cancelBtn);
        imageView = findViewById(R.id.imageViewForm);
        spinner = findViewById(R.id.spinner);

        switch (mode){
            case UPDATE:

        }

    }


}