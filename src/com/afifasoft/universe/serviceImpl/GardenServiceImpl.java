package com.afifasoft.universe.serviceImpl;

import com.afifasoft.universe.bean.Carrot;
import com.afifasoft.universe.service.GardenService;


public class GardenServiceImpl implements GardenService {



    @Override
    public Carrot findNextCarrot() {

        Carrot carrot = new Carrot();
        System.out.println("GardenServiceImpl: findNextCarrot()");
        return carrot;


    }
}
