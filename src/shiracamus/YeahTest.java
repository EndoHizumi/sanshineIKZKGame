package test;
import static org.junit.Assert.*;
import static shiracamus.yeah;

import org.junit.Test;

public class YeahTest {

	@Test
	public void testConvert() {
		assertEquals("イェーーーーーーええええイェーーーーーー", yeah.convert("イイイイイイええええいいいいいい"));
		assertEquals("イェーえイェーーえええええイェーえイェーえイェーー", yeah.convert("イえイイえええええいえいえいい"));
		assertEquals("激唱イェーンフィニティ", yeah.convert("激唱インフィニティ"));
	}

}
