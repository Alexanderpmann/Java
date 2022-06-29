package com.codingdojo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.Travel;
import com.codingdojo.repositories.TravelRepository;

@Service
public class TravelService 
{
		@Autowired
		private TravelRepository travelRepository;

		public void create(Travel travel)
		{
		    travelRepository.save(travel);
		}

		public void update(Travel travel)
		{
		    travelRepository.save(travel);
		}

		public void delete(Long id)
		{
		    travelRepository.deleteById(id);
		}

		public Travel findById(Long id)
		{
		    return travelRepository.findById(id).orElse(null);
		}

		public ArrayList<Travel> findAll()
		{
		    return (ArrayList<Travel>)travelRepository.findAll();
		}
};
