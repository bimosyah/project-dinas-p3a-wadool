package syahputro.bimo.projek.dinas.p3a.fragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import syahputro.bimo.projek.dinas.p3a.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHalamanUtama extends Fragment {


    public FragmentHalamanUtama() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Halaman Utama");
        return inflater.inflate(R.layout.fragment_halaman_utama, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}
