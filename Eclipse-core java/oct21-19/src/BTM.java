
public class BTM {
	static int totalCount;
	int count;
	void swipe() {
		count++;
		totalCount++;
	}
	int getCount() {
		return count;
	}
	int getTotalCount() {
		return totalCount;
	}
}
