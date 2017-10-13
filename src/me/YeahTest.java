package test;
import static org.junit.Assert.*;
import static me.*;

import org.junit.Test;

public class YeahTest {

	@Test
	public void testConvert() {
		assertEquals("イェーーーーーーええええイェーーーーーー", convert("イイイイイイええええいいいいいい"));
		assertEquals("イェーえイェーーえええええイェーえイェーえイェーー", convert("イえイイえええええいえいえいい"));
		assertEquals("激唱イェーンフィニティ", convert("激唱インフィニティ"));
	}

}
