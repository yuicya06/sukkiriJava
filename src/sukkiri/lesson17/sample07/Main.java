package sukkiri.lesson17.sample07;

public class Main {
	public static void main(String[] args) {
		
		try {
			//試験的に例外を発生させる
			throw new UnsupportedMusicFileException("未対応のファイルです");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
