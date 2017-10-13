package test;
import static org.junit.Assert.*;

import org.junit.Test;

public class YeahTest {

	@Test
	public void testConvert1() {
		assertEquals("イェーーーーーーええええイェーーーーーー", me.Yeah.convert("イイイイイイええええいいいいいい"));
		assertEquals("イェーえイェーーえええええイェーえイェーえイェーー", me.Yeah.convert("イえイイえええええいえいえいい"));
		assertEquals("激唱イェーンフィニティ", me.Yeah.convert("激唱インフィニティ"));
	}

	@Test
	public void testConvert2() {
		assertEquals("イェーーーーーーええええイェーーーーーー", shiracamus.Yeah.convert("イイイイイイええええいいいいいい"));
		assertEquals("イェーえイェーーえええええイェーえイェーえイェーー",shiracamus.Yeah.convert("イえイイえええええいえいえいい"));
		assertEquals("激唱イェーンフィニティ", shiracamus.Yeah.convert("激唱インフィニティ"));
	}


	@Test
	// author:https://qiita.com/saka1029
	public void testConvert3() {
		assertEquals("イェーーーーーーええええイェーーーーーー", saka1029.Yeah.convert("イイイイイイええええいいいいいい"));
		assertEquals("イェーえイェーーえええええイェーえイェーえイェーー",saka1029.Yeah.convert("イえイイえええええいえいえいい"));
		assertEquals("激唱イェーンフィニティ", saka1029.Yeah.convert("激唱インフィニティ"));
	}

}
