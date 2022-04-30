import java.util.*;
class Clock {
	int hour;  // 時
	int min;   // 分
	int sec;   // 秒

	Clock() {
		// Calendarクラスを使って，現在の時刻を取得する
		Calendar calendar = Calendar.getInstance();
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		min = calendar.get(Calendar.MINUTE);
		sec = calendar.get(Calendar.SECOND);
	}
	void show() {
		String time = String.format("%02d:%02d:%02d", hour, min, sec);
		System.out.println("[" + time + "]");
	}
}
