package com.Cesde.concesionario.Repositorio;
import com.Cesde.concesionario.Modelo.MVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IVehiculo extends JpaRepository<MVehiculo, String> {
    //Consulta por marca
    List<MVehiculo> findByMarca (String Marca);
    //Consulta por modelo
    List<MVehiculo> findByModelo (String Modelo);
}
