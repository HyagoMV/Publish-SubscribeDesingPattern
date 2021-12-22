package system;

public class Message {
	private String tag;
	private String payload;

	public Message() {
	}

	public Message(String topic, String payload) {
		this.tag = topic;
		this.payload = payload;
	}

	public String getTap() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}
}