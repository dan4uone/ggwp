package com.example.ggwp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FourFragment extends Fragment {

    private TextView textView;
    private Button btn;
    private String str;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        str=getArguments().getString("key2");
        return inflater.inflate(R.layout.fragment_four, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.email);
        btn = view.findViewById(R.id.btn1);
        textView.setText(str);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bdn = new Bundle();
                bdn.putString("key3",textView.getText().toString());
                Fragment fragment = new FiveFragment();
                fragment.setArguments(bdn);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.cont,fragment).addToBackStack(null).commit();
            }
        });
    }
}
