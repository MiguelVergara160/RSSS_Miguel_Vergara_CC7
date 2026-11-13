package RSSS_Miguel_Vergara_CC7.demo.repository;

import RSSS_Miguel_Vergara_CC7.demo.model.OrdenServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenServicioRepository extends JpaRepository<OrdenServicio, Long> {

}
