package br.com.parks.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitedNumberTextFielDocument extends PlainDocument {

	private static final long serialVersionUID = -958343719934510178L;

	private final int MAX_VALUE;

	public LimitedNumberTextFielDocument(int maxValue) {
		MAX_VALUE = maxValue;
	}

	@Override
	public void insertString(int offset, String str, AttributeSet attr)
			throws BadLocationException {
		if (str == null)
			return;
		for (int i = 0; i < str.length(); i++) {
			if ((!Character.isDigit(str.charAt(i)))) {
				return;
			}
		}
		int currLength = getLength();
		if (currLength > MAX_VALUE)
			return;

		super.insertString(offset, str, attr);
	}
}
