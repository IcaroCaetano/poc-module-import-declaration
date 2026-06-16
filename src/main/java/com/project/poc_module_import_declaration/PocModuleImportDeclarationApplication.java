package com.project.poc_module_import_declaration;


import com.project.poc_module_import_declaration.model.Customer;
import com.project.poc_module_import_declaration.service.FraudAnalysisService;

import java.time.LocalDate;

public class PocModuleImportDeclarationApplication {

	void main() {

		var customer = new Customer(
				"12345678901",
				"Icaro",
				LocalDate.of(1994, 8, 10),
				9000
		);

		var service = new FraudAnalysisService();

		var result = service.analyze(customer);

		System.out.println(result);
	}
}