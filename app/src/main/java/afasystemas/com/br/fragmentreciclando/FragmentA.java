package afasystemas.com.br.fragmentreciclando;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by AndreFA on 03/01/2017.
 */

public class FragmentA extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {

        View myFragments = inflater.inflate(R.layout.fragement_a,container,false);
        Button tbnFrag = (Button)myFragments.findViewById(R.id.btnsalvar);

        tbnFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Dentro do Fragment A", Toast.LENGTH_SHORT).show();
            }
        });
        return myFragments;
    }
}
