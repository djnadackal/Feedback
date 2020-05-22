package ibs.hilton.ase.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Document(collection = "FeedBackHumans")
public class HumanDoman {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public ArrayList getSurveyDetails() {
        return surveyDetails;
    }

    public void setSurveyDetails(ArrayList surveyDetails) {
        this.surveyDetails = surveyDetails;
    }

    @Id
    private Integer id;
    private String role;
    private String name;
    private String password;

    @Override
    public String toString() {
        return "HumanDoman{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", feedback='" + feedback + '\'' +
                ", surveyDetails=" + surveyDetails +
                '}';
    }

    public HumanDoman(Integer id, String role, String name, String password, Date dateOfBirth, String feedback, ArrayList surveyDetails) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.feedback = feedback;
        this.surveyDetails = surveyDetails;
    }

    private Date dateOfBirth;
    private String feedback;
    private ArrayList surveyDetails;
}
