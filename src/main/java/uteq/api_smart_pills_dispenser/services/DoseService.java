package uteq.api_smart_pills_dispenser.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uteq.api_smart_pills_dispenser.models.Dose;
import uteq.api_smart_pills_dispenser.repositories.DoseRepository;

@Transactional
@Service
public class DoseService {
	@Autowired
	private DoseRepository doseRepository;
	
	//Este metodo permite listar todos los registro de la entidad.
    public List<Dose> findAll() throws Exception {
        try {
            return doseRepository.findAll();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    //Este metodo permite: Actualizar un país mediante su ID.
    public Dose findById(Integer id) throws Exception {
        try {
            Optional<Dose> entityOptional = doseRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //Este metodo permite: guardar
    public Dose save(Dose entity) throws Exception {
        try {
            entity = doseRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //Este metodo permite: Actualizar mediante ID
    public Dose update(Integer id, Dose entity) throws Exception {
        try {
            Optional<Dose> entityOptional = doseRepository.findById(id);
            Dose dose = entityOptional.get();
            dose = doseRepository.save(entity);
            return dose;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //Este metodo permite: Eliminar mediante su ID.
    public boolean delete(Integer id) throws Exception {
        try {
            if (doseRepository.existsById(id)) {
            	doseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
