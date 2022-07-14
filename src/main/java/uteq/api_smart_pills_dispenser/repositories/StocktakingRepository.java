package uteq.api_smart_pills_dispenser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uteq.api_smart_pills_dispenser.models.Stocktaking;

public interface StocktakingRepository extends JpaRepository<Stocktaking, Integer> {


}
