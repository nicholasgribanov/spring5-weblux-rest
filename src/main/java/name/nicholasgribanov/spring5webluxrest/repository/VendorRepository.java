package name.nicholasgribanov.spring5webluxrest.repository;

import name.nicholasgribanov.spring5webluxrest.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
