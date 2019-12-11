package com.insurancecare.testpage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insurancecare.entities.InsuranceCareEntities;
import com.insurancecare.repositories.InsuranceCareRepository;

public class InsertInsuranceData {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("insurance-context.xml");
		InsuranceCareRepository insuranceRepository = (InsuranceCareRepository) ctx.getBean("insuranceRipository");

		InsuranceCareEntities i = new InsuranceCareEntities();
		i.setName("Geico");
		i.setPhone(7298298393L);
		i.setType("Auto + Home");
		i.setAddress("8292 jackson hill street");

		InsuranceCareEntities i1 = new InsuranceCareEntities();
		i1.setName("Statefarm");
		i1.setPhone(98908298393L);
		i1.setType("Business + Home + Auto");
		i1.setAddress("6282 garden street");

		InsuranceCareEntities i2 = new InsuranceCareEntities();
		i2.setName("Progressive");
		i2.setPhone(910990908393L);
		i2.setType("Auto + Home");
		i2.setAddress("7292 hillside place");

		InsuranceCareEntities i3 = new InsuranceCareEntities();
		i3.setName("AllState");
		i3.setPhone(7289998393L);
		i3.setType("Auto + Home");
		i3.setAddress("9001 germanroad court");

		InsuranceCareEntities i4 = new InsuranceCareEntities();
		i4.setName("Erie");
		i4.setPhone(7232223354L);
		i4.setType("Auto + Home");
		i4.setAddress("7298 barrick street");

		InsuranceCareEntities i5 = new InsuranceCareEntities();
		i5.setName("National");
		i5.setPhone(7298298393L);
		i5.setType("Auto + Health");
		i5.setAddress("6289 mason hill street");

		insuranceRepository.save(i);
		insuranceRepository.save(i1);
		insuranceRepository.save(i2);
		insuranceRepository.save(i3);
		insuranceRepository.save(i4);
		insuranceRepository.save(i5);
	}

}
