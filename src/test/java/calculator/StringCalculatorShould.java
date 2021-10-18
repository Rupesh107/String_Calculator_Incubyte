package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

	private StringCalculator stringCalculator = new StringCalculator();

	@Test
	void empty_string_should_return_0() throws Exception {

		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() throws Exception {

		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	void string_with_two_numbers_will_return_a_number_as_their_sum() throws Exception {
		assertEquals(3, stringCalculator.add("1,2"));
	}

	@Test
	void string_with_unknown_amount_of_numbers_will_return_number_as_their_sum() throws Exception {
		assertEquals(36, stringCalculator.add("1,2,3,4,5,6,7,8"));
	}

	@Test
	void string_with_new_line_between_numbers_will_return_a_number_as_their_sum() throws Exception {
		assertEquals(6, stringCalculator.add("1\n2,3"));
	}

	@Test
	void string_with_support_for_different_delimeters_seperated_numbers_will_return_number_as_sum() throws Exception {
		assertEquals(3, stringCalculator.add("//;\n1;2"));
	}

	@Test
	void string_with_calling_add_negative_numbers_will_throw_exception() throws Exception{

		stringCalculator.add("-2");
	}		
	
	@Test
	void string_with_numbers_bigger_than_1000_should_be_ignored() throws Exception{

		assertEquals(7, stringCalculator.add("1003,7"));
	}
	
	@Test
	void string_with_any_length_delimiter_numbers_should_return_number_as_sum() throws Exception {
		assertEquals(6, stringCalculator.add("//[***]\n1***2***3"));
	}
}
