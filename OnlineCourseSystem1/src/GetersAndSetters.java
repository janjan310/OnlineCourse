
public class GetersAndSetters {
    
   private String lastName;
   private String firstName;
   private String middleName;
   private String age;
   private String sex;
   private String phoneNumber;
   private String course;
   private String instructor;
   private String status;
   
   public GetersAndSetters(String lastName, String  firstName, String middleName, String age, String sex, String phoneNumber, String course, String instructor,String status){
       this.lastName = lastName;
       this.firstName = firstName;
       this.middleName = middleName;
       this.age = age;
       this.sex = sex;
       this.phoneNumber = phoneNumber;
       this.course = course;
       this.instructor = instructor;
       this.status = status;
   }
   public String getLastName(){
       return lastName;
   }
   
   public void setLastName(String lastName){
       this.lastName = lastName;
   }     
   
   public String getFirstName(){
       return firstName;
   }
   
   public void setFirstName(String firstName){ 
       this.firstName = firstName;    
   }
   public String getMiddleName(){
       return middleName;
   }
   
   public void setMiddleName(String middleName){ 
       this.middleName = middleName;    
   }
   public String getAge(){
       return age;
   }
   
   public void setAge(String age){ 
       this.age = age;    
   }
   public String getSex(){
       return sex;
   }
   
   public void setSex(String sex){ 
       this.sex = sex;    
   }
   public String getPhoneNumber(){
       return phoneNumber;
   }
   
   public void setPhoneNumber(String phoneNumber){ 
       this.phoneNumber = phoneNumber;    
   }
   public String getCoure(){
       return course;
   }
   
   public void setCourse(String course){ 
       this.course = course;    
   }
   public String getInstructor(){
       return instructor;
   }
   
   public void setInstructor(String instructor){ 
       this.instructor = instructor;    
   }
   public String getStatus(){
       return status;
   }
   
   public void setStatus(String status){ 
       this.status = status;    
   }

    String getCourse() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
   
