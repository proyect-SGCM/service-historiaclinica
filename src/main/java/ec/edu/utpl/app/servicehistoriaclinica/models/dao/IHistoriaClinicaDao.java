package ec.edu.utpl.app.servicehistoriaclinica.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.utpl.app.servicehistoriaclinica.models.entity.HistoriaClinica;

public interface IHistoriaClinicaDao extends JpaRepository<HistoriaClinica, Long> {

}
