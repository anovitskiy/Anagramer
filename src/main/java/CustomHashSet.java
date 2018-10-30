public class CustomHashSet {
	private Node[] buckets;
	private double loadFactor;
	private int currentSize;
	private int current;

	public CustomHashSet(int bucketSize, double loadFactor) {
		buckets = new Node[bucketSize];
		currentSize = 0;
		this.loadFactor = loadFactor;
	}

	/**
	 * @param o an object to be added to set
	 * @return true if object was not previously in set
	 */
	public boolean add(Object o) {
		int key = getHashCode(o);
		Node cursor = buckets[key];
		while (cursor != null) {
			if (cursor.data.equals(o)) {
				return false;
			} else {
				cursor = cursor.next;
			}
		}

		Node newNode = new Node();
		newNode.data = o;
		newNode.next = buckets[key];
		buckets[key] = newNode;
		currentSize++;
		current = key;

		if (currentSize > (buckets.length * loadFactor)) {
			rehash();
		}

		return true;
	}

	/**
	 * Double the bucket size when currentSize reaches max loadFactor
	 */
	private void rehash() {
		Node temp = buckets[current];
		Object o[] = new Object[buckets.length];
		buckets = new Node[2 * buckets.length];
		currentSize = 0;
		int i = 0;
		while (temp != null) {
			o[i] = temp.data;
			temp = temp.next;
			i++;
		}
		while (i > 0) {
			add(o[--i]);
		}
	}

	private int getHashCode(Object o) {
		int hc = o.hashCode();
		if (hc < 0) {
			hc = -hc;
		}
		return hc % buckets.length;
	}
}