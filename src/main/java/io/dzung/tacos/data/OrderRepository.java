package io.dzung.tacos.data;

import org.springframework.data.repository.CrudRepository;

import io.dzung.tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
