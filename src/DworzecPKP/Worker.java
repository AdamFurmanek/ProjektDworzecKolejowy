﻿package DworzecPKP;

import java.util.Date;

public class Worker extends Employee {
	Worker(String firstName, String finalName, Date dateOfBirth, String address, Date dateOfEmployment, WorkSchedule workSchedule) {
		super(firstName, finalName, dateOfBirth, address, dateOfEmployment, workSchedule);
		this.payment = 2200;
	}
	
	void executeService() {
		
	}
}