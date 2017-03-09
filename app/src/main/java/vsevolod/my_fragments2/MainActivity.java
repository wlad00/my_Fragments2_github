package vsevolod.my_fragments2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ButtonsFragment.ButtonsFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getFragmentManager();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.my_buttons_container, new ButtonsFragment(),"MyBut");
        transaction.add(R.id.my_fragment_container, new MyFragment(),"MyFrag");
        transaction.commit();


    }

    @Override
    public void changeColor(int color) {
        MyFragment fragment = (MyFragment) getFragmentManager().findFragmentById(R.id.my_fragment_container);

        if (fragment != null){
            fragment.changeTitleColor(color);
        }

    }
}
