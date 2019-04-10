package name.nicholasgribanov.spring5webluxrest.bootstrap;

import name.nicholasgribanov.spring5webluxrest.domain.Category;
import name.nicholasgribanov.spring5webluxrest.domain.Vendor;
import name.nicholasgribanov.spring5webluxrest.repository.CategoryRepository;
import name.nicholasgribanov.spring5webluxrest.repository.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;
    private VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (categoryRepository.count().block() == 0) {
            //load data
            System.out.println("#### LOADING DATA ON BOOTSTRAP");
            categoryRepository.save(Category.builder().description("Fruits").build()).block();
            categoryRepository.save(Category.builder().description("Nuts").build()).block();
            categoryRepository.save(Category.builder().description("Breads").build()).block();
            categoryRepository.save(Category.builder().description("Meats").build()).block();
            categoryRepository.save(Category.builder().description("Eggs").build()).block();
            categoryRepository.save(Category.builder().description("Vegetables").build()).block();

            System.out.println("Loaded " + categoryRepository.count().block());

            vendorRepository.save(Vendor.builder().firstName("Oleg").lastName("Kravinsky").build()).block();
            vendorRepository.save(Vendor.builder().firstName("Nikolay").lastName("Gribanov").build()).block();
            vendorRepository.save(Vendor.builder().firstName("Sergey").lastName("Chistiakov").build()).block();
            vendorRepository.save(Vendor.builder().firstName("Roman").lastName("Varlamov").build()).block();
            vendorRepository.save(Vendor.builder().firstName("Marina").lastName("Savinova").build()).block();

            System.out.println("Loaded " + vendorRepository.count().block());

        }

    }
}
