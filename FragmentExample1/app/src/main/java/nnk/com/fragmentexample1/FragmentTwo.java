package nnk.com.fragmentexample1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Naveen on 3/2/2016.
 */
public class FragmentTwo extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
       super.onCreateView(inflater, container, savedInstanceState);
      View  v  = inflater.inflate(R.layout.fragment_layout2,container,false);
        return  v;
    }
}
