package vsevolod.my_fragments2;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Vsevolod on 01.03.17.
 */

public class ButtonsFragment extends Fragment implements View.OnClickListener {

    private Button blackBtn, whiteBtn;
    private ButtonsFragmentListener listener;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buttons,null);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        blackBtn = (Button) view.findViewById(R.id.black_btn);
        whiteBtn = (Button) view.findViewById(R.id.white_btn);

        blackBtn.setOnClickListener(this);
        whiteBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.black_btn){
            listener.changeColor(Color.rgb(0,0,0));
        } else if (v.getId() == R.id.white_btn){
            listener.changeColor(Color.rgb(255,255,255));
        }
    }

    interface ButtonsFragmentListener{
        void changeColor(int color);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof  ButtonsFragmentListener){
            listener = (ButtonsFragmentListener) activity;
        } else {
            throw new RuntimeException("Activity must implements buttonsFragmentListener");
        }
    }
}
















