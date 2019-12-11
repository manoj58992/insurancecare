package com.insurancecare.testpage;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurancecare.entities.InsuranceCareEntities;
import com.insurancecare.repositories.InsuranceCareRepository;

public class SelectMainPage {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("insurance-context.xml");
		InsuranceCareRepository insuranceRepository = (InsuranceCareRepository) ctx.getBean("insuranceRipository");

		System.out.println("select by id = 2");
		InsuranceCareEntities i1 = insuranceRepository.getById(2);

		if (i1 != null) {
			System.out.println(i1.toString());
		}

		System.out.println("select by type = Auto + Home");

		List<InsuranceCareEntities> insurance = insuranceRepository.getByType("Auto + Home");

		for (InsuranceCareEntities i : insurance) {
			System.out.println(i.toString());
		}
		System.out.println("select by type = Auto + Home");

	}

}
