package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Lada", "Black", 1990));
        cars.add(new Car("BMW", "525", 1996));
        cars.add(new Car("Mercedes", "125", 1994));
        cars.add(new Car("Renault", "Logan", 2005));
        cars.add(new Car("Audi", "Q5", 2019));
    }

    @Override
    public int sizeListCars() {
        return cars.size();
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > 0 & count < 5) {
            return cars.stream().limit(count).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
