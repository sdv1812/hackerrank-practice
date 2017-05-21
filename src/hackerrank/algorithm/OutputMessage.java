package hackerrank.algorithm;

public class OutputMessage {

    private String from;
    private String text;
    private String time;
    private String status;
    private String testId;
    private String projectName;

	public OutputMessage() {
    	
    }
    
	public OutputMessage(String from, String text, String time, String status, String testId, String projectName) {
		super();
		this.from = from;
		this.text = text;
		this.time = time;
		this.status = status;
		this.testId = testId;
		this.projectName = projectName;
	}

	public OutputMessage(String from, String text, String time, String status) {
		this.from = from;
		this.text = text;
		this.time = time;
		this.status = status;
	}
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
}
