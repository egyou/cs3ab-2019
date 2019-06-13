package iducs.springboot.board.util;

import iducs.springboot.board.domain.User;

public class HttpSessionUtils {
	public static boolean isLogined(User user) {
		// session에 user 객체가 null이 아니면 로그인된 상태임
		if(user == null)
			return true;
		return false;
	}
}
