package com.example.abdygulov_hw_4.country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abdygulov_hw_4.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private int position;
    private ArrayList<Country> countries = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        assert getArguments() != null;
        position = getArguments().getInt("continent", 0);
        checkPosition(position);
        CountryAdapter adapter = new CountryAdapter(countries);
        binding.rvCountry.setAdapter(adapter);
    }

    private void checkPosition(int position) {
        switch (position) {
            case 0:
                loadEurasia();
                break;
            case 1:
                loadSouthAmerica();
                break;
            case 2:
                loadNorthAmerica();
                break;
            case 3:
                loadAustralia();
                break;
            case 4:
                loadAfrica();
                break;
        }
    }

    private void loadAfrica() {
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Flag_of_Algeria.svg/640px-Flag_of_Algeria.svg.png", "Алжир"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/2560px-Flag_of_Morocco.svg.png", "Марокко"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Flag_of_Nigeria.svg/2560px-Flag_of_Nigeria.svg.png", "Нигерия"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Flag_of_Senegal.svg/1280px-Flag_of_Senegal.svg.png", "Сенегал"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Flag_of_Tunisia.svg/2560px-Flag_of_Tunisia.svg.png", "Тунис"));
    }

    private void loadAustralia() {
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Flag_of_Australia.svg/1280px-Flag_of_Australia.svg.png", "Австралия"));

    }

    private void loadNorthAmerica() {
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/US_flag_51_stars.svg/300px-US_flag_51_stars.svg.png", "США"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/250px-Flag_of_Canada_%28Pantone%29.svg.png", "Канада"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/640px-Flag_of_Mexico.svg.png", "Мексика"));
        countries.add(new Country("https://images.visitarcuba.org/bandera-de-cuba.jpg", "Куба"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Flag_of_Jamaica.svg/1280px-Flag_of_Jamaica.svg.png", "Ямайка"));

    }

    private void loadSouthAmerica() {
        countries.add(new Country("https://worldnomadgames.com/media/images/flags/%D0%91%D1%80%D0%B0%D0%B7%D0%B8%D0%BB%D0%B8%D1%8F_YCjTSyy.png", "Бразилия"));
        countries.add(new Country("https://www.flagcolorcodes.com/filter?f=argentina&e=waves", "Аргентина"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/800px-Flag_of_Uruguay.svg.png", "Уругвай"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/800px-Flag_of_Colombia.svg.png", "Колумбия"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1200px-Flag_of_Peru_%28state%29.svg.png", "Перу"));

    }

    private void loadEurasia() {
        countries.add(new Country("https://24.kg/files/media/317/317181.jpeg", "Кыргызстан"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Flag_of_Russia.svg/2560px-Flag_of_Russia.svg.png", "Россия"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flag_of_Japan.svg/2560px-Flag_of_Japan.svg.png", "Япония"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Flag_of_Portugal.svg/800px-Flag_of_Portugal.svg.png", "Португалия"));
        countries.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Flag_of_Saudi_Arabia.svg/2560px-Flag_of_Saudi_Arabia.svg.png", "Саудовская Аравия"));
    }

}