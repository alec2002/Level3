import java.util.ArrayList;

public class OncogeneDetector {

	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String candidate) {
		int can = 0;
		int canh = 0;
		double cann = 0;
		double canhh = 0;
		for (String c : cancerSequences) {
			if (c.contains(candidate)) {
				can++;
			}
			

		}
		cann = can/cancerSequences.size();

		for (String h : healthySequences) {
			if (h.contains(candidate)) {
				canh++;
			}
		}
		canhh = canh/healthySequences.size();
		if (cann > canhh) {
			return true;
		} else {
			return false;
		}

	}
}
