package trial;

import java.util.UUID;

public class uuid {
	public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String numericUUID = Long.toString(uuid.getMostSignificantBits());
        long number = java.lang.Math.abs(Long.parseLong(numericUUID));
        System.out.println(number);
	}
}
