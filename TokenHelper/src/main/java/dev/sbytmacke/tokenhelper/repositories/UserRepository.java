package dev.sbytmacke.tokenhelper.repositories;

import dev.sbytmacke.tokenhelper.dto.UserDTO;

import java.time.LocalDate;
import java.util.ArrayList;

public interface UserRepository<T, ID> extends Repository<T, ID> {

    ArrayList<UserDTO> getAllByTime(ID newTime);

    ArrayList<UserDTO> getAllByDateTime(ID newTime, LocalDate newDate);
}

