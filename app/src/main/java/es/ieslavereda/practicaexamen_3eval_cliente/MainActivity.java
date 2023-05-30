package es.ieslavereda.practicaexamen_3eval_cliente;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/*
a. (4 p.) Creates a RecyclerView that displays all elements of the ArrayList defined in the
Model.java file. You must design the interface of the items in this list. Both the data
and the provided image must be displayed. The data for the fruit element are:
i. Name: Name of the fruit.
ii. Imagen: Image of the fruit.
iii. Price: Sale price per kilo.
iv. SaleDay: Day of the week on which the fruit can be sold.
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FloatingActionButton addFruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recrycler);
        addFruit = findViewById(R.id.addFruit);


        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter(this);
        recyclerView.setAdapter(myRecyclerViewAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        ActivityResultLauncher<Intent> addFruitFormActivityLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == RESULT_CANCELED)
                        Toast.makeText(this, "Cancelado por el usuario", Toast.LENGTH_SHORT).show();
                    else if (result.getResultCode() == RESULT_OK){
                        Intent data = result.getData();
                        Fruit fruit = (Fruit) data.getExtras().getSerializable("fruta");
                        FruitRepository.getInstance().add(fruit);
                        myRecyclerViewAdapter.notifyDataSetChanged();
                        Toast.makeText(this, "Nueva: " + fruit.getName(), Toast.LENGTH_SHORT).show();
                    }
                });

        addFruit.setOnClickListener(v->{
            Intent i = new Intent(this, FormularioActivity.class);
            addFruitFormActivityLauncher.launch(i);
        });
    }
}