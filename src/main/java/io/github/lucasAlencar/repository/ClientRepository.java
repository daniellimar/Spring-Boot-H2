package io.github.lucasAlencar.repository;

import io.github.lucasAlencar.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Integer> {


}
