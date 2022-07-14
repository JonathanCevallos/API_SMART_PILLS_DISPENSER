package uteq.api_smart_pills_dispenser.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uteq.api_smart_pills_dispenser.models.Schedule;
import uteq.api_smart_pills_dispenser.repositories.ScheduleRepository;

@Transactional
@Service
public class ScheduleService {
	@Autowired
	private ScheduleRepository scheduleRepository;
	
	//Este metodo permite listar todos los registro de la entidad.
    public List<Schedule> findAll() throws Exception {
        try {
            return scheduleRepository.findAll();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    //Este metodo permite: Actualizar un país mediante su ID.
    public Schedule findById(Integer id) throws Exception {
        try {
            Optional<Schedule> entityOptional = scheduleRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //Este metodo permite: guardar
    public Schedule save(Schedule entity) throws Exception {
        try {
            entity = scheduleRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //Este metodo permite: Actualizar mediante ID
    public Schedule update(Integer id, Schedule entity) throws Exception {
        try {
            Optional<Schedule> entityOptional = scheduleRepository.findById(id);
            Schedule schedule = entityOptional.get();
            schedule = scheduleRepository.save(entity);
            return schedule;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //Este metodo permite: Eliminar mediante su ID.
    public boolean delete(Integer id) throws Exception {
        try {
            if (scheduleRepository.existsById(id)) {
            	scheduleRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
