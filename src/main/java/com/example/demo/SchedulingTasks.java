package com.example.demo;

import java.util.Calendar;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulingTasks {

	@Scheduled(fixedRate = 2000)
	public void print() {
		System.out.println("printed at " + Calendar.getInstance().getTimeInMillis());
	}

}
