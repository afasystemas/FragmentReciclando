package afasystemas.com.br.fragmentreciclando;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by AndreFA on 03/01/2017.
 */

public class Bfragment extends Fragment {

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View myView = inflater.inflate(R.layout.b_fragment,container, false);
        //Button btn = (Button) myView.findViewById(R.id.btnsalvar);


        return myView;
    }


}
