package com.example.tugas_uts_akb_if3_10117089_shendi_permana.View;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugas_uts_akb_if3_10117089_shendi_permana.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/** NIM : 10117089
 * Nama : Shendi Permana
 * Kelas : IF-3
 * Tanggal : 11-05-2020**/
public class ContactActivity extends Fragment {
    public ContactActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        // Inflate the layout for this fragment
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return inflater.inflate(R.layout.activity_contact, container, false);

    }
}
