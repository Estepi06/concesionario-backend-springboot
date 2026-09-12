package com.Cesde.concesionario.Repositorio;
import com.Cesde.concesionario.Dto.FacturasClienteDTO;
import com.Cesde.concesionario.Modelo.MCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICliente extends JpaRepository<MCliente, String> {
    //Consulta por nombre
    List<MCliente> findByNomcliente(String Nomcliente);
    //consultar que tiene el cliente

    @Query(value = "select from cliente C inner join factura F" +
            "on C.idcliente = F.idcliente where F.idcliente = :idcliente", nativeQuery = true)

    List<FacturasClienteDTO> buscarFacturasCliente (@Param("idcliente")String idcliente);



}
