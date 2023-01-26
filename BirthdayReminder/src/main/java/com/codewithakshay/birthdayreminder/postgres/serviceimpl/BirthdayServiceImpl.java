package com.codewithakshay.birthdayreminder.postgres.serviceimpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithakshay.birthdayreminder.postgres.model.Birthday;
import com.codewithakshay.birthdayreminder.postgres.repository.BirthdayRepository;
import com.codewithakshay.birthdayreminder.postgres.service.BirthdayService;

@Service
public class BirthdayServiceImpl implements BirthdayService {

	@Autowired
	private BirthdayRepository birthdayRepository;

	@Override
	public List<Birthday> getTodaysBithdays() {
		LocalDate localDate = LocalDate.now();
		int month = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();
		String date = month + "-" + day;
		List<Birthday> birthdayData = birthdayRepository.findByDateLike("%" + date + "%");
		System.out.println("here - " + birthdayData);
		return birthdayData;
	}

}
