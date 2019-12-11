package com.insurancecare.testpage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurancecare.entities.InsuranceCareEntities;
import com.insurancecare.repositories.InsuranceCareRepository;

public class UpdateMainPage {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("insurance-context.xml");
		InsuranceCareRepository insuranceRipository = (InsuranceCareRepository) ctx.getBean("insuranceRipository");

		System.out.println("select by id  = 2");
		InsuranceCareEntities i1 = insuranceRipository.getById(2);

		i1.setAddress("3044 covington street");
		i1.setPhone(73839383992L);

		System.out.println("select by id = 4");
		InsuranceCareEntities i3 = insuranceRipository.getById(4);

		i3.setType("Auto + health");
		insuranceRipository.update(i3);

	}

}
