package com.example.wroom.services.implementations;

import com.example.wroom.exceptions.RentalStartNotFoundException;
import com.example.wroom.models.Person;
import com.example.wroom.models.RentalStart;
import com.example.wroom.services.RentalStartService;

import java.util.List;
import java.util.UUID;

public class RentalStartServiceImpl implements RentalStartService {
    @Override
    public void createRentalStart(RentalStart rentalStart) {

    }

    @Override
    public RentalStart findRentalStartById(UUID id) throws RentalStartNotFoundException {
        return null;
    }

    @Override
    public RentalStart findRentalStartByCustomerEmail(Person email) throws RentalStartNotFoundException {
        return null;
    }

    @Override
    public List<RentalStart> findAllRentalStarts() {
        return null;
    }

    @Override
    public void updateRentalStart(RentalStart rentalStart) throws RentalStartNotFoundException {

    }

    @Override
    public void deleteRentalStartById(UUID id) throws RentalStartNotFoundException {

    }

    @Override
    public void restoreRentalStartById(UUID id) throws RentalStartNotFoundException {

    }
}
