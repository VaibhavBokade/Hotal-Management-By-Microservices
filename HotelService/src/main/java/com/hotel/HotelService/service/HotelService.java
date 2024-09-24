package com.hotel.HotelService.service;

import com.hotel.HotelService.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel getHotel(String id);
}
