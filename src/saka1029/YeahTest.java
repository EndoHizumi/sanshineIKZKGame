package test;
import static org.junit.Assert.*;
import static saka1029.Yeah.*;

import org.junit.Test;

public class YeahTest {

	@Test
	public void testConverter() {
		Yeah yeah = new Yeah();
		assertEquals("�C�F�[�[�[�[�[�[���������C�F�[�[�[�[�[�[", yeah.Converter("�C�C�C�C�C�C��������������������"));
		assertEquals("�C�F�[���C�F�[�[�����������C�F�[���C�F�[���C�F�[�[", yeah.Converter("�C���C�C����������������������"));
		assertEquals("�����C�F�[���t�B�j�e�B", yeah.Converter("�����C���t�B�j�e�B"));
	}

}
