package sn.tp_2.com;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("sn.tp_2.com");

        noClasses()
            .that()
            .resideInAnyPackage("sn.tp_2.com.service..")
            .or()
            .resideInAnyPackage("sn.tp_2.com.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..sn.tp_2.com.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
