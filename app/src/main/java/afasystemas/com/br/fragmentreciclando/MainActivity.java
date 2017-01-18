package afasystemas.com.br.fragmentreciclando;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;



import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Fragment escolhido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAdicionar = (Button)findViewById(R.id.btnAdd);
        Button btnTrocar = (Button)findViewById(R.id.btnMudar);
        Button btnRemover= (Button)findViewById(R.id.btnRemover);

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentA fragmentA = new FragmentA();
                fragmentTransaction.add(R.id.fragment_container,fragmentA,"fragmentA");
                Log.d(" adicionar "," teste");
                fragmentTransaction.commit();

            }
        });

        btnTrocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                Bfragment bfragment = new Bfragment();
                escolhido = bfragment;


                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack so the user can navigate back
                transaction.replace(R.id.fragment_container, escolhido);
                transaction.addToBackStack(null);
                Log.d(" Trocar "," BFragment");
                // Commit the transaction
                transaction.commit();
            }
        });

        btnRemover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.remove(escolhido);
                Log.d(" removeu  "," com sucesso");
                fragmentTransaction.commit();
            }
        });

    }
}
