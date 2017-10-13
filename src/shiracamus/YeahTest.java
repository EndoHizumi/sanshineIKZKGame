package test;
import static org.junit.Assert.*;
import static shiracamus.yeah;

import org.junit.Test;

public class YeahTest {

	@Test
	public void testConvert() {
		assertEquals("�C�F�[�[�[�[�[�[���������C�F�[�[�[�[�[�[", yeah.convert("�C�C�C�C�C�C��������������������"));
		assertEquals("�C�F�[���C�F�[�[�����������C�F�[���C�F�[���C�F�[�[", yeah.convert("�C���C�C����������������������"));
		assertEquals("�����C�F�[���t�B�j�e�B", yeah.convert("�����C���t�B�j�e�B"));
	}

}
