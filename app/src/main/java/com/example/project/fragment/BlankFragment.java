package com.example.project.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project.R;
import com.example.project.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {

    private FragmentBlankBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setClick();
    }

    private void setClick(){
        binding.buttonFirst.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_blankFragment_to_blankFragment2);
        });
        binding.buttonSecond.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_blankFragment_to_blankFragment3);
        });
        binding.buttonThird.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_blankFragment_to_blankFragment4);
        });
        binding.buttonFourth.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_blankFragment_to_blankFragment5);
        });
    }
}