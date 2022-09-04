package com.example.wroom.services.implementations;

import com.example.wroom.exceptions.RentalOfficeNotFoundException;
import com.example.wroom.models.RentalOffice;
import com.example.wroom.repository.BookingRepository;
import com.example.wroom.repository.RentalOfficeRepository;
import com.example.wroom.services.RentalOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

/**
 * Implementation of RentalOffice
 *
 * @author Jonathan Rigottier
 */
@Service
@Transactional
public class RentalOfficeServiceImpl implements RentalOfficeService {

    @Autowired
    private RentalOfficeRepository rentalOfficeRepository;

    @Override
    public void createRentalOffice(RentalOffice rentalOffice) {

    }

    @Override
    public RentalOffice findRentalOfficehById(UUID id) throws RentalOfficeNotFoundException {
        return null;
    }

    @Override
    public RentalOffice findRentalOfficeByName(String name) throws RentalOfficeNotFoundException {
        return null;
    }

    @Override
    public List<RentalOffice> findAllRentalOffices() {
        return null;
    }

    @Override
    public void updateRentalOffice(RentalOffice rentalOffice) throws RentalOfficeNotFoundException {

    }

    @Override
    public void deleteRentalOfficeById(UUID id) throws RentalOfficeNotFoundException {

    }

    @Override
    public void restoreRentalOfficeById(UUID id) throws RentalOfficeNotFoundException {

    }
}
