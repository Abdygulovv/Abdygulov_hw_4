package com.example.abdygulov_hw_4.continent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abdygulov_hw_4.OnClick;
import com.example.abdygulov_hw_4.R;
import com.example.abdygulov_hw_4.country.CountryFragment;
import com.example.abdygulov_hw_4.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnClick {
    private FragmentContinentBinding binding;
    private ArrayList<Continent> continents = new ArrayList<Continent>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter adapter = new ContinentAdapter(continents, this);
        binding.rvContinent.setAdapter(adapter);
    }

    private void loadData() {
        continents.add(new Continent("https://8b08ab88-ee1b-4b04-9ae9-321e0da71ae2.selcdn.net/44a642af-8f34-4e32-99d0-10e585328f5d/%D0%95%D0%B2%D1%80%D0%B0%D0%B7%D0%B8%D1%8F%203-w658.png","Евразия"));
        continents.add(new Continent("https://e7.pngegg.com/pngimages/983/676/png-clipart-flags-of-south-america-united-states-of-america-continent-map-map-flag-world.png","Южная Америка"));
        continents.add(new Continent("https://klev.club/uploads/posts/2023-10/1697620733_klev-club-p-risunki-karta-severnoi-ameriki-34.jpg","Северная Америка"));
        continents.add(new Continent("https://klev.club/uploads/posts/2023-10/1697613476_klev-club-p-risunki-karta-avstralii-7.jpg","Австралия"));
        continents.add(new Continent("https://8b08ab88-ee1b-4b04-9ae9-321e0da71ae2.selcdn.net/573e2c8d-9fea-4e92-aff5-91cf402eb2b5/%D0%90%D1%84%D1%80%D0%B8%D0%BA%D0%B0w658.png","Африка"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("continent",position);

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_fragment,countryFragment).addToBackStack(null).commit();
    }
}