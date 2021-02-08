public class Password {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getSecurityHint() {
        return securityHint;
    }

    public void setSecurityHint(String securityHint) {
        this.securityHint = securityHint;
    }

    public String getHyperLink() {
        return hyperLink;
    }

    public void setHyperLink(String hyperLink) {
        this.hyperLink = hyperLink;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    String title;
    String password;
    String securityQuestion;
    String securityAnswer;
    String securityHint;
    String hyperLink;
    String category;

    public Password() {
        String title = "";
        String password = "";
        String securityAnswer = "";
        String securityHint = "";
        String hyperLink = "";
        String category = "";
    }
}
