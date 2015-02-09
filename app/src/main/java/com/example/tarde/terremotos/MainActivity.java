package com.example.tarde.terremotos;
/*pantalla inicial: fecha, filtros por intensidad del terremoto, boton buscar
* */



import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.Spinner;

import java.util.Calendar;


public class MainActivity extends ActionBarActivity {
    private CalendarView calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestionSpinerEscala();
        gestionarBuscar();
        gestionarFecha();
        

    }

    
    public void gestionSpinerEscala(){
        Spinner spinnerEscala = (Spinner) findViewById(R.id.spEscala);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Escala, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerEscala.setAdapter(adapter);

        }

        public void onItemSelected( ) {

    }
    
    public void gestionarBuscar(){

        View boton = findViewById(R.id.btBuscar);

        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    //indicamos que quiero que haga el evento
                    Intent intent = new Intent();



             }
        });

    }

    public void gestionarFecha(){
       calendar.getDate();
    }
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
