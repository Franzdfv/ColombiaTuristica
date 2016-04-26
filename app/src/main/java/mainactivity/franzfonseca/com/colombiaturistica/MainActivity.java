package mainactivity.franzfonseca.com.colombiaturistica;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id== R.id.mHoteles) {
            startActivity(new Intent(this, Hoteles.class));
        }
        if (id== R.id.mBares) {
            startActivity(new Intent(this, Bares.class));
        }
        if (id== R.id.mSitiosturisticos) {
            startActivity(new Intent(this, Sitios_Turisticos.class));
        }
        if (id== R.id.mDemografia) {
            startActivity(new Intent(this, Demografia.class));
        }

        if (id== R.id.mDisenador) {
            startActivity(new Intent(this, Disenador.class));
        }





        return super.onOptionsItemSelected(item);
    }
}
