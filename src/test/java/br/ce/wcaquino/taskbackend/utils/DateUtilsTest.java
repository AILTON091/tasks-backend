package br.ce.wcaquino.taskbackend.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class DateUtilsTest {
	
	@Test
	public void deveRetornarTrueeParaDatasFuturas() {
		LocalDate date = LocalDate.of(2030, 01, 01);
		assertTrue(DateUtils.isEqualOrFutureDate(date));	
	}
	
	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		LocalDate date = LocalDate.of(2010, 01, 01);
		assertFalse(DateUtils.isEqualOrFutureDate(date));	
	}
	
	@Test
	public void deveRetornarTrueParaDatasPresente() {
		LocalDate date = LocalDate.now();
		assertTrue(DateUtils.isEqualOrFutureDate(date));	
	}
}
