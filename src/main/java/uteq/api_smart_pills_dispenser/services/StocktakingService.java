package uteq.api_smart_pills_dispenser.services;

import org.springframework.beans.factory.annotation.Autowired;
import uteq.api_smart_pills_dispenser.models.Stocktaking;
import uteq.api_smart_pills_dispenser.repositories.StocktakingRepository;

import java.util.List;
import java.util.Optional;

public class StocktakingService {
    @Autowired
    private StocktakingRepository stocktakingRepository;

    //Este metodo permite listar todos los registro de la entidad.
    public List<Stocktaking> findAll() throws Exception {
        try {
            return stocktakingRepository.findAll();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    //Este metodo permite: Actualizar un país mediante su ID.
    public Stocktaking findById(Integer id) throws Exception {
        try {
            Optional<Stocktaking> entityOptional = stocktakingRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //Este metodo permite: guardar
    public Stocktaking save(Stocktaking entity) throws Exception {
        try {
            entity = stocktakingRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //Este metodo permite: Actualizar mediante ID
    public Stocktaking update(Integer id, Stocktaking entity) throws Exception {
        try {
            Optional<Stocktaking> entityOptional = stocktakingRepository.findById(id);
            Stocktaking doctor = entityOptional.get();
            doctor = stocktakingRepository.save(entity);
            return doctor;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //Este metodo permite: Eliminar mediante su ID.
    public boolean delete(Integer id) throws Exception {
        try {
            if (stocktakingRepository.existsById(id)) {
                stocktakingRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
