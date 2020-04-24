package lunainc.com.mx.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private TextView etiSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        etiSeleccion = (TextView) findViewById(R.id.textID);
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Cristian");
        listaNombres.add("Maria");
        listaNombres.add("Carlos");
        listaNombres.add("Juan");


        for (int i = 0; i < 10; i++) {
            listaNombres.add("Nombre "+(i+1));
        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, listaNombres);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Seleecciona: "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                etiSeleccion.setText(parent.getItemAtPosition(position).toString());
            }
        });




    }
}
