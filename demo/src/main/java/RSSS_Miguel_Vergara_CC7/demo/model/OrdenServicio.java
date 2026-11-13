package RSSS_Miguel_Vergara_CC7.demo.model;

import jakarta.persistence.*;
import org.hibernate.mapping.ManyToOne;

@Entity
public class OrdenServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String descripcion;
        private int costo;
        private String tipo;
        private String estado;
        private ManyToOne vehiculo;
    }

