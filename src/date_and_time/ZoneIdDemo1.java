package date_and_time;

import java.time.ZoneId;

public class ZoneIdDemo1 {

  public static void main(String[] args) {
    ZoneId paris = ZoneId.of("Europe/Paris");
    System.out.println(paris);
  }
}
