package br.com.appviral.materialdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {
FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }


    public void umaMensagem(View view){
        Log.d("MEUAPP", "passou pela umaMensagem(View view)");
        Snackbar.make(view, "O FAB foi clicado!!!!", Snackbar.LENGTH_LONG).setAction("Fechar", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        }).show();
    }
}
