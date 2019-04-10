package name.nicholasgribanov.spring5webluxrest.repository;

import name.nicholasgribanov.spring5webluxrest.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
