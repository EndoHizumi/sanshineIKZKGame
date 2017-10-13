package test;
import static org.junit.Assert.*;
import static saka1029.Yeah.*;

import org.junit.Test;

public class YeahTest {

	@Test
	public void testConverter() {
		Yeah yeah = new Yeah();
		assertEquals("イェーーーーーーええええイェーーーーーー", yeah.Converter("イイイイイイええええいいいいいい"));
		assertEquals("イェーえイェーーえええええイェーえイェーえイェーー", yeah.Converter("イえイイえええええいえいえいい"));
		assertEquals("激唱イェーンフィニティ", yeah.Converter("激唱インフィニティ"));
	}

}
