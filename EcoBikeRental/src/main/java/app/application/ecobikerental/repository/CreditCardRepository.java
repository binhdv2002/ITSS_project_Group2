package app.application.ecobikerental.repository;

import app.application.ecobikerental.entity.CreditCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCard , Long > {
}
