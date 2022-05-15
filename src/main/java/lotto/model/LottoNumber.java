package lotto.model;

import util.NumberUtil;

public class LottoNumber implements Comparable<LottoNumber> {
	private static final int MIN_LOTTO_NUMBER = 1;
	private static final int MAX_LOTTO_NUMBER = 45;
	private final int lottoNumber;

	public LottoNumber(String lottoNumber) {
		lottoNumber = lottoNumber.trim();
		validationNumber(lottoNumber);
		validationRange(Integer.parseInt(lottoNumber));
		this.lottoNumber = Integer.parseInt(lottoNumber);
	}

	public LottoNumber(int lottoNumber) {
		validationRange(lottoNumber);
		this.lottoNumber = lottoNumber;
	}

	public static int maxLottoNumber() {
		return MAX_LOTTO_NUMBER;
	}

	public static int minLottoNumber() {
		return MIN_LOTTO_NUMBER;
	}

	public int getLottoNumber() {
		return this.lottoNumber;
	}

	private void validationRange(int lottoNumber) {
		if (!isRange(lottoNumber)) {
			throw new IllegalArgumentException(String.format("nubmer: %d %d~%d 범의의 숫자만 입력이 가능합니다.", lottoNumber,
					MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER));
		}
	}

	private boolean isRange(int lottoNumber) {
		return lottoNumber >= MIN_LOTTO_NUMBER && lottoNumber <= MAX_LOTTO_NUMBER;
	}

	private void validationNumber(String lottoNumber) {
		if (!NumberUtil.isNumber(lottoNumber)) {
			throw new IllegalArgumentException(String.format("nubmer: %d 숫자가 아닙니다.", lottoNumber));
		}
	}

	@Override
	public int compareTo(LottoNumber lottoNumber) {
		return getLottoNumber() - lottoNumber.getLottoNumber();
	}

	@Override
	public int hashCode() {
		return lottoNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof LottoNumber) {
			LottoNumber lottoNumber = (LottoNumber) o;
			return getLottoNumber() == lottoNumber.getLottoNumber();
		}
		if (o instanceof Integer) {
			return o.equals(getLottoNumber());
		}
		return false;
	}
}
