package inudcs.springboot.board.util;

import iducs.springboot.board.domain.User;

public class HttpSessionUtils {
	public static boolean isLogined(User user) {
		//session 내에 user 객체의 값으로 로그인 상태 확인.
		if(user == null) // null이라면 ( 로그인이 아니라면 )
			return true;
		return false;
	}

}
