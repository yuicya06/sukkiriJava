package comparable.practice02;

import java.time.LocalDateTime;

public class User implements Comparable<User> {

	private String username;
	private LocalDateTime registrationDate;

	public User(String username, LocalDateTime registrationDate) {

		setUsername(username);
		setRegistrationDate(registrationDate);

	}
	@Override
	public int compareTo(User u) {

		return this.registrationDate.compareTo(u.registrationDate);

	}
	
	
	
//	ublic int compareTo(ChronoLocalDateTime<?> other)
//	この日付/時間を別の日付/時間と比較します。
//	この比較は主として日付/時間(もっとも早いものからもっとも遅いものまで)に基づいています。Comparableに定義されているとおりに、「equalsと一致」しています。
//
//	比較対象のすべての日付/時間がLocalDateTimeのインスタンスである場合、比較は完全にその日付/時間に基づいて行われます。比較対象の日付の中に異なる暦のものが含まれている場合、その暦も考慮されます(ChronoLocalDateTime.compareTo(java.time.chrono.ChronoLocalDateTime<?>)を参照)。
//
//	定義:
//	compareTo in interface Comparable<ChronoLocalDateTime<?>>
//	定義:
//	compareTo、インタフェース: ChronoLocalDateTime<LocalDate>
//	パラメータ:
//	other - 他の比較する日付/時間、null以外
//	戻り値:
//	コンパレータ値、小さい場合は負、大きい場合は正

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

}
