package chapter7.abstraction;

public interface Messenger {

	   public static final int MIN_SIZE = 1;
	   public static final int MAX_SIZE = 104857600;

	   public abstract String getMessage();

	   public abstract void setMessage(String msg); //abstract 삭제 가능

	   public default void setLogin(boolean login) { //abstract 삭제 가능
	      log();
	      if (login) {
	         System.out.println("로그인 처리합니다.");
	      } else {
	         System.out.println("로그아웃 처리합니다");
	      }
	   }

	   public static void getConnection() {
	      System.out.println("network에 연결합니다.");
	   }

	   private void log() {
	      System.out.println("start job!");
	   }
	}