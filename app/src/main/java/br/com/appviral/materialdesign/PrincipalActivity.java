package br.com.appviral.materialdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.syncState();


     /*   tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Aba Um"));
        tabLayout.addTab(tabLayout.newTab().setText("Aba Dois"));
        tabLayout.addTab(tabLayout.newTab().setText("Aba Três"));*/

    }


    public void umaMensagem(View view) {
        Snackbar.make(view, "O FAB foi clicado!!!!", Snackbar.LENGTH_LONG).setAction("Fechar", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        }).show();
    }
}
